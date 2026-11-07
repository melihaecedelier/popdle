package com.tpop.popdle.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.tpop.popdle.R
import com.tpop.popdle.data.local.PreferencesManager
import com.tpop.popdle.databinding.ActivityMainBinding
import com.tpop.popdle.engine.DailyChallengeManager
import com.tpop.popdle.ui.dialogs.HowToPlayDialog
import com.tpop.popdle.ui.dialogs.StatsDialog
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var prefs: PreferencesManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        prefs = PreferencesManager(this)

        setupUI()
        setupListeners()
    }

    override fun onResume() {
        super.onResume()
        updateDashboardStats()
    }

    private fun setupUI() {
        // Bugünün Tarihini Formatla (Örn: 8 Kasım 2026)
        val sdf = SimpleDateFormat("d MMMM yyyy", Locale("tr"))
        binding.tvTodayDate.text = sdf.format(Date())

        updateDashboardStats()
    }

    private fun updateDashboardStats() {
        val stats = prefs.getStats()
        binding.tvCurrentStreak.text = "${stats.currentStreak} Günlük Seri 🔥"
        binding.tvTotalPoints.text = "Toplam: ${String.format("%,d", stats.totalPoints)} Puan"

        val todayStr = DailyChallengeManager.getTodayDateString()
        if (prefs.isDailyCompleted(todayStr)) {
            binding.tvDailyStatusBadge.text = "TAMAMLANDI ✅"
            binding.tvDailyStatusBadge.setBackgroundResource(R.drawable.bg_card_correct)
            binding.btnStartDaily.text = "Bugünün Sonucunu Gör"
        } else {
            binding.tvDailyStatusBadge.text = "BUGÜN HAZIR ⭐"
            binding.tvDailyStatusBadge.setBackgroundResource(R.drawable.bg_card_partial)
            binding.btnStartDaily.text = "Günün Oyununu Başlat"
        }
    }

    private fun setupListeners() {
        // 1. Günlük Mod Başlat
        binding.cardDailyMode.setOnClickListener { startDailyGame() }
        binding.btnStartDaily.setOnClickListener { startDailyGame() }

        // 2. Sonsuz Pratik Modu Başlat
        binding.cardClassicMode.setOnClickListener {
            val intent = Intent(this, ClassicGameActivity::class.java).apply {
                putExtra("EXTRA_IS_DAILY", false)
            }
            startActivity(intent)
        }

        // 3. Şarkı Sözü & İpucu Modu Başlat
        binding.cardClueMode.setOnClickListener {
            startActivity(Intent(this, ClueModeActivity::class.java))
        }

        // İstatistikler Modalı
        binding.btnOpenStats.setOnClickListener {
            StatsDialog(this).show()
        }

        // Nasıl Oynanır Modalı
        binding.btnHowToPlay.setOnClickListener {
            HowToPlayDialog(this).show()
        }
    }

    private fun startDailyGame() {
        val todayStr = DailyChallengeManager.getTodayDateString()
        if (prefs.isDailyCompleted(todayStr)) {
            Toast.makeText(
                this,
                "Bugünün gizli T-Pop yıldızını zaten buldunuz! Pratik Modu ile oynamaya devam edebilirsiniz.",
                Toast.LENGTH_LONG
            ).show()
        }
        val intent = Intent(this, ClassicGameActivity::class.java).apply {
            putExtra("EXTRA_IS_DAILY", true)
        }
        startActivity(intent)
    }
}
