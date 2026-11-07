package com.tpop.popdle.ui

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.tpop.popdle.R
import com.tpop.popdle.data.local.PreferencesManager
import com.tpop.popdle.data.model.TPopMember
import com.tpop.popdle.data.repository.TPopDatabase
import com.tpop.popdle.databinding.ActivityClassicGameBinding
import com.tpop.popdle.engine.DailyChallengeManager
import com.tpop.popdle.engine.PopdleEngine
import com.tpop.popdle.ui.adapter.GuessAdapter
import com.tpop.popdle.ui.adapter.MemberSearchAdapter
import com.tpop.popdle.ui.dialogs.HowToPlayDialog
import com.tpop.popdle.ui.dialogs.WinDialog
import com.tpop.popdle.util.SoundAndHapticHelper

class ClassicGameActivity : AppCompatActivity() {

    private lateinit var binding: ActivityClassicGameBinding
    private lateinit var prefs: PreferencesManager
    private lateinit var soundAndHaptic: SoundAndHapticHelper
    private lateinit var guessAdapter: GuessAdapter
    private lateinit var searchAdapter: MemberSearchAdapter

    private lateinit var targetMember: TPopMember
    private var isDaily: Boolean = true
    private var attemptsCount: Int = 0
    private var isGameOver: Boolean = false
    private val guessedMemberIds = mutableSetOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityClassicGameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        prefs = PreferencesManager(this)
        soundAndHaptic = SoundAndHapticHelper(this)

        isDaily = intent.getBooleanExtra("EXTRA_IS_DAILY", true)

        initGame()
        setupUI()
        setupListeners()
    }

    private fun initGame() {
        if (isDaily) {
            targetMember = DailyChallengeManager.getDailyTargetMember()
            binding.tvModeTitle.text = "Günün T-Pop Üyesi"
        } else {
            targetMember = DailyChallengeManager.getRandomTargetMember()
            binding.tvModeTitle.text = "Sonsuz Pratik Modu"
        }
    }

    private fun setupUI() {
        // RecyclerView ve Adapter Kurulumu
        guessAdapter = GuessAdapter()
        binding.rvGuesses.layoutManager = LinearLayoutManager(this)
        binding.rvGuesses.adapter = guessAdapter

        // Autocomplete Arama Adapter Kurulumu
        searchAdapter = MemberSearchAdapter(this, TPopDatabase.members)
        binding.autoCompleteMemberInput.setAdapter(searchAdapter)

        updateAttemptCounter()
    }

    private fun setupListeners() {
        binding.btnBack.setOnClickListener { finish() }

        binding.btnGameHelp.setOnClickListener {
            HowToPlayDialog(this).show()
        }

        binding.btnSubmitGuess.setOnClickListener {
            submitCurrentGuess()
        }

        binding.autoCompleteMemberInput.setOnItemClickListener { parent, _, position, _ ->
            val selectedMember = parent.getItemAtPosition(position) as? TPopMember
            if (selectedMember != null) {
                processGuess(selectedMember)
                binding.autoCompleteMemberInput.setText("")
            }
        }
    }

    private fun submitCurrentGuess() {
        val inputName = binding.autoCompleteMemberInput.text.toString().trim()
        if (inputName.isBlank()) {
            Toast.makeText(this, "Lütfen bir T-Pop üyesi adı yazınız!", Toast.LENGTH_SHORT).show()
            return
        }

        val found = TPopDatabase.findByName(inputName)
        if (found == null) {
            Toast.makeText(this, "'$inputName' bulunamadı. Listeden geçerli bir üye seçin.", Toast.LENGTH_SHORT).show()
            return
        }

        processGuess(found)
        binding.autoCompleteMemberInput.setText("")
    }

    private fun processGuess(guessedMember: TPopMember) {
        if (isGameOver) {
            Toast.makeText(this, "Bu oyun tamamlandı! Yeni bir oyun başlatabilirsiniz.", Toast.LENGTH_SHORT).show()
            return
        }

        if (guessedMemberIds.contains(guessedMember.id)) {
            Toast.makeText(this, "${guessedMember.name} zaten tahmin edildi!", Toast.LENGTH_SHORT).show()
            return
        }

        guessedMemberIds.add(guessedMember.id)
        attemptsCount++
        updateAttemptCounter()

        // Popdle Motoru ile LoLdle benzeri karşılaştırma yap
        val comparison = PopdleEngine.compare(guessedMember, targetMember)

        // Boş durumu gizle, listeyi göster
        binding.layoutEmptyState.visibility = View.GONE
        binding.rvGuesses.visibility = View.VISIBLE

        guessAdapter.addGuess(comparison)
        binding.rvGuesses.smoothScrollToPosition(0)

        // Doğru / Yanlış geri bildirimi (Ses & Titreşim)
        soundAndHaptic.playGuessFeedback(comparison.isWin)

        if (comparison.isWin) {
            handleVictory()
        }
    }

    private fun handleVictory() {
        isGameOver = true
        soundAndHaptic.playWinFeedback()

        val pointsEarned = PopdleEngine.calculateScore(attemptsCount)
        val todayStr = DailyChallengeManager.getTodayDateString()

        // İstatistikleri güncelle ve kaydet
        val stats = prefs.getStats()
        stats.recordWin(attemptsCount, pointsEarned, isDaily, todayStr)
        prefs.saveStats(stats)

        if (isDaily) {
            prefs.markDailyCompleted(todayStr)
        }

        // Kazanan Modalı Aç
        WinDialog(
            context = this,
            member = targetMember,
            attemptCount = attemptsCount,
            pointsEarned = pointsEarned,
            isDaily = isDaily,
            onDismissCallback = {
                if (!isDaily) {
                    // Pratik modunda yeni oyun başlat
                    resetGameForNextRound()
                } else {
                    finish()
                }
            }
        ).show()
    }

    private fun resetGameForNextRound() {
        targetMember = DailyChallengeManager.getRandomTargetMember()
        attemptsCount = 0
        isGameOver = false
        guessedMemberIds.clear()
        guessAdapter.clearGuesses()
        binding.layoutEmptyState.visibility = View.VISIBLE
        binding.rvGuesses.visibility = View.GONE
        updateAttemptCounter()
    }

    private fun updateAttemptCounter() {
        binding.tvAttemptCount.text = "Tahmin Sayısı: $attemptsCount"
    }
}
