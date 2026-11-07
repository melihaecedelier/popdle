package com.tpop.popdle.data.model

data class UserStats(
    var gamesPlayed: Int = 0,
    var gamesWon: Int = 0,
    var currentStreak: Int = 0,
    var maxStreak: Int = 0,
    var totalPoints: Int = 0,
    var lastDailyDate: String = "",
    val guessDistribution: MutableMap<String, Int> = mutableMapOf(
        "1" to 0,
        "2" to 0,
        "3" to 0,
        "4" to 0,
        "5" to 0,
        "6+" to 0
    )
) {
    val winRate: Int
        get() = if (gamesPlayed > 0) ((gamesWon.toDouble() / gamesPlayed) * 100).toInt() else 0

    fun recordWin(guessCount: Int, pointsEarned: Int, isDaily: Boolean, dateStr: String) {
        gamesPlayed++
        gamesWon++
        totalPoints += pointsEarned
        currentStreak++
        if (currentStreak > maxStreak) {
            maxStreak = currentStreak
        }
        if (isDaily) {
            lastDailyDate = dateStr
        }

        val key = if (guessCount in 1..5) guessCount.toString() else "6+"
        val currentCount = guessDistribution[key] ?: 0
        guessDistribution[key] = currentCount + 1
    }

    fun recordLoss(isDaily: Boolean, dateStr: String) {
        gamesPlayed++
        currentStreak = 0
        if (isDaily) {
            lastDailyDate = dateStr
        }
    }
}
