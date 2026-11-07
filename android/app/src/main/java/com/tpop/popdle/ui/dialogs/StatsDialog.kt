package com.tpop.popdle.ui.dialogs

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.Window
import android.widget.Button
import android.widget.TextView
import com.tpop.popdle.R
import com.tpop.popdle.data.local.PreferencesManager

class StatsDialog(context: Context) : Dialog(context) {

    init {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.dialog_stats)
        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        setCancelable(true)

        val prefs = PreferencesManager(context)
        val stats = prefs.getStats()

        findViewById<TextView>(R.id.tvStatsPlayed)?.text = stats.gamesPlayed.toString()
        findViewById<TextView>(R.id.tvStatsWinRate)?.text = "%${stats.winRate}"
        findViewById<TextView>(R.id.tvStatsCurrentStreak)?.text = stats.currentStreak.toString()
        findViewById<TextView>(R.id.tvStatsMaxStreak)?.text = stats.maxStreak.toString()
        findViewById<TextView>(R.id.tvStatsTotalScore)?.text = String.format("%,d", stats.totalPoints)

        // Tahmin Dağılım Özeti
        val distText = StringBuilder()
        stats.guessDistribution.forEach { (key, count) ->
            distText.append("$key Tahmin: $count  |  ")
        }
        val cleanDist = if (distText.endsWith("  |  ")) {
            distText.substring(0, distText.length - 5)
        } else {
            distText.toString()
        }
        findViewById<TextView>(R.id.tvDistributionSummary)?.text = cleanDist

        findViewById<Button>(R.id.btnCloseStats)?.setOnClickListener {
            dismiss()
        }
    }
}
