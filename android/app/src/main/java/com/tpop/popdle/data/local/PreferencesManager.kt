package com.tpop.popdle.data.local

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.tpop.popdle.data.model.UserStats

class PreferencesManager(context: Context) {

    private val prefs: SharedPreferences =
        context.getSharedPreferences("popdle_user_prefs", Context.MODE_PRIVATE)
    private val gson = Gson()

    companion object {
        private const val KEY_STATS = "key_user_stats"
        private const val KEY_SOUND_ENABLED = "key_sound_enabled"
        private const val KEY_HAPTIC_ENABLED = "key_haptic_enabled"
        private const val KEY_DAILY_COMPLETED_DATE = "key_daily_completed_date"
        private const val KEY_DAILY_SAVED_GUESSES = "key_daily_saved_guesses_"
    }

    fun getStats(): UserStats {
        val json = prefs.getString(KEY_STATS, null) ?: return UserStats()
        return try {
            gson.fromJson(json, UserStats::class.java) ?: UserStats()
        } catch (e: Exception) {
            UserStats()
        }
    }

    fun saveStats(stats: UserStats) {
        val json = gson.toJson(stats)
        prefs.edit().putString(KEY_STATS, json).apply()
    }

    fun isDailyCompleted(dateStr: String): Boolean {
        return prefs.getString(KEY_DAILY_COMPLETED_DATE, "") == dateStr
    }

    fun markDailyCompleted(dateStr: String) {
        prefs.edit().putString(KEY_DAILY_COMPLETED_DATE, dateStr).apply()
    }

    fun isSoundEnabled(): Boolean = prefs.getBoolean(KEY_SOUND_ENABLED, true)
    fun setSoundEnabled(enabled: Boolean) = prefs.edit().putBoolean(KEY_SOUND_ENABLED, enabled).apply()

    fun isHapticEnabled(): Boolean = prefs.getBoolean(KEY_HAPTIC_ENABLED, true)
    fun setHapticEnabled(enabled: Boolean) = prefs.edit().putBoolean(KEY_HAPTIC_ENABLED, enabled).apply()
}
