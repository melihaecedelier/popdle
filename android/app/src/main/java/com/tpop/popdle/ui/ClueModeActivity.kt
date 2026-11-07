package com.tpop.popdle.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.tpop.popdle.R
import com.tpop.popdle.data.local.PreferencesManager
import com.tpop.popdle.data.model.TPopMember
import com.tpop.popdle.data.repository.TPopDatabase
import com.tpop.popdle.databinding.ActivityClueModeBinding
import com.tpop.popdle.engine.DailyChallengeManager
import com.tpop.popdle.engine.PopdleEngine
import com.tpop.popdle.ui.adapter.MemberSearchAdapter
import com.tpop.popdle.ui.dialogs.WinDialog
import com.tpop.popdle.util.SoundAndHapticHelper

class ClueModeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityClueModeBinding
    private lateinit var prefs: PreferencesManager
    private lateinit var soundAndHaptic: SoundAndHapticHelper
    private lateinit var targetMember: TPopMember

    private var wrongAttempts: Int = 0
    private val maxAttempts = 5
    private var isGameOver: Boolean = false
    private val triedNames = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityClueModeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        prefs = PreferencesManager(this)
        soundAndHaptic = SoundAndHapticHelper(this)

        initGame()
        setupUI()
        setupListeners()
    }

    private lateinit var currentSong: com.tpop.popdle.data.model.TPopSong

    private fun initGame() {
        currentSong = TPopDatabase.songs.random()
        val matchingMember = TPopDatabase.members.filter { it.group.equals(currentSong.group, true) }.randomOrNull()
        targetMember = matchingMember ?: DailyChallengeManager.getRandomTargetMember()
        wrongAttempts = 0
        isGameOver = false
        triedNames.clear()
    }

    private fun setupUI() {
        binding.tvQuoteClue.text = "“${currentSong.lyrics}”"
        updateAttemptsUI()

        // Autocomplete
        val searchAdapter = MemberSearchAdapter(this, TPopDatabase.members)
        binding.autoCompleteClueInput.setAdapter(searchAdapter)
    }

    private fun setupListeners() {
        binding.btnClueBack.setOnClickListener { finish() }

        binding.btnSubmitClueGuess.setOnClickListener {
            val text = binding.autoCompleteClueInput.text.toString().trim()
            val found = TPopDatabase.findByName(text)
            if (found != null) {
                processGuess(found)
                binding.autoCompleteClueInput.setText("")
            } else {
                Toast.makeText(this, "Lütfen listeden geçerli bir T-Pop üyesi seçin!", Toast.LENGTH_SHORT).show()
            }
        }

        binding.autoCompleteClueInput.setOnItemClickListener { parent, _, position, _ ->
            val selected = parent.getItemAtPosition(position) as? TPopMember
            if (selected != null) {
                processGuess(selected)
                binding.autoCompleteClueInput.setText("")
            }
        }
    }

    private fun processGuess(guessed: TPopMember) {
        if (isGameOver) return

        if (guessed.id == targetMember.id) {
            // Bildi!
            isGameOver = true
            soundAndHaptic.playWinFeedback()
            val score = PopdleEngine.calculateScore(wrongAttempts + 1)
            val stats = prefs.getStats()
            stats.recordWin(wrongAttempts + 1, score, false, DailyChallengeManager.getTodayDateString())
            prefs.saveStats(stats)

            WinDialog(
                context = this,
                member = targetMember,
                attemptCount = wrongAttempts + 1,
                pointsEarned = score,
                isDaily = false,
                onDismissCallback = { finish() }
            ).show()
        } else {
            // Yanlış tahmin
            wrongAttempts++
            triedNames.add(guessed.name)
            soundAndHaptic.playGuessFeedback(false)
            updateAttemptsUI()
            revealNextClueStage()

            if (wrongAttempts >= maxAttempts) {
                isGameOver = true
                Toast.makeText(
                    this,
                    "Haklarınız bitti! Doğru cevap: ${targetMember.name} (${targetMember.group})",
                    Toast.LENGTH_LONG
                ).show()
                finish()
            }
        }
    }

    private fun updateAttemptsUI() {
        val remaining = maxAttempts - wrongAttempts
        binding.tvClueAttemptCount.text = "Kalan Hak: $remaining"
        if (triedNames.isNotEmpty()) {
            binding.tvWrongGuessesList.text = "Denenenler: " + triedNames.joinToString(", ") { "$it ❌" }
        } else {
            binding.tvWrongGuessesList.text = ""
        }
    }

    private fun revealNextClueStage() {
        when (wrongAttempts) {
            1 -> {
                binding.tvClueStage1.text = "💡 İpucu 1: Şarkı ${currentSong.year} yılında yayınlandı! (Burç: ${targetMember.zodiac})"
                binding.tvClueStage1.setBackgroundResource(R.drawable.bg_card_partial)
                binding.tvClueStage1.setTextColor(getColor(R.color.white))
            }
            2 -> {
                binding.tvClueStage2.text = "💡 İpucu 2: Grup: ${currentSong.group} | Rol: ${targetMember.roleDisplay}"
                binding.tvClueStage2.setBackgroundResource(R.drawable.bg_card_partial)
                binding.tvClueStage2.setTextColor(getColor(R.color.white))
            }
            3 -> {
                binding.tvClueStage3.text = "💡 İpucu 3: ${currentSong.clue} • (${targetMember.name})"
                binding.tvClueStage3.setBackgroundResource(R.drawable.bg_card_partial)
                binding.tvClueStage3.setTextColor(getColor(R.color.white))
            }
        }
    }
}
