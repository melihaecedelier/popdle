package com.tpop.popdle.util

import android.content.Context
import android.media.AudioManager
import android.media.ToneGenerator
import android.os.Build
import android.os.VibrationEffect
import android.os.Vibrator
import android.os.VibratorManager
import com.tpop.popdle.data.local.PreferencesManager

class SoundAndHapticHelper(private val context: Context) {

    private val prefs = PreferencesManager(context)
    private var toneGenerator: ToneGenerator? = null

    init {
        try {
            toneGenerator = ToneGenerator(AudioManager.STREAM_NOTIFICATION, 70)
        } catch (e: Exception) {
            toneGenerator = null
        }
    }

    private fun getVibrator(): Vibrator {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            val vibratorManager = context.getSystemService(Context.VIBRATOR_MANAGER_SERVICE) as VibratorManager
            vibratorManager.defaultVibrator
        } else {
            @Suppress("DEPRECATION")
            context.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        }
    }

    fun playWinFeedback() {
        if (prefs.isHapticEnabled()) {
            val vibrator = getVibrator()
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                val timings = longArrayOf(0, 100, 80, 200, 80, 300)
                val amplitudes = intArrayOf(0, 180, 0, 220, 0, 255)
                vibrator.vibrate(VibrationEffect.createWaveform(timings, amplitudes, -1))
            } else {
                @Suppress("DEPRECATION")
                vibrator.vibrate(longArrayOf(0, 100, 80, 200), -1)
            }
        }

        if (prefs.isSoundEnabled()) {
            toneGenerator?.startTone(ToneGenerator.TONE_PROP_PROMPT, 350)
        }
    }

    fun playGuessFeedback(isCorrect: Boolean) {
        if (prefs.isHapticEnabled()) {
            val vibrator = getVibrator()
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                val effect = if (isCorrect) {
                    VibrationEffect.createOneShot(80, VibrationEffect.DEFAULT_AMPLITUDE)
                } else {
                    VibrationEffect.createOneShot(40, 100)
                }
                vibrator.vibrate(effect)
            } else {
                @Suppress("DEPRECATION")
                vibrator.vibrate(if (isCorrect) 80 else 40)
            }
        }

        if (prefs.isSoundEnabled()) {
            val tone = if (isCorrect) ToneGenerator.TONE_PROP_ACK else ToneGenerator.TONE_PROP_NACK
            toneGenerator?.startTone(tone, 150)
        }
    }
}
