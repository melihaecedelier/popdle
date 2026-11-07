package com.tpop.popdle.engine

import com.tpop.popdle.data.model.MemberGuessComparison
import com.tpop.popdle.data.model.MatchStatus
import com.tpop.popdle.data.model.NumericComparison
import com.tpop.popdle.data.model.NumericDirection
import com.tpop.popdle.data.model.TPopMember
import kotlin.math.abs

object PopdleEngine {

    fun compare(guessed: TPopMember, target: TPopMember): MemberGuessComparison {
        val isWin = guessed.id == target.id

        // Grup Kontrolü
        val groupMatch = if (guessed.group.equals(target.group, ignoreCase = true)) {
            MatchStatus.MATCH
        } else {
            MatchStatus.MISMATCH
        }

        // Cinsiyet Kontrolü
        val genderMatch = if (guessed.gender.equals(target.gender, ignoreCase = true)) {
            MatchStatus.MATCH
        } else {
            MatchStatus.MISMATCH
        }

        // Rol / Pozisyon Kontrolü (Tam eşleşme vs kısmi ortak rol)
        val sharedRoles = guessed.roles.intersect(target.roles.toSet())
        val roleMatch = when {
            guessed.roles == target.roles -> MatchStatus.MATCH
            sharedRoles.isNotEmpty() -> MatchStatus.PARTIAL
            else -> MatchStatus.MISMATCH
        }

        // Yaş Kontrolü (Yukarı / Aşağı ve Yakınlık)
        val ageDiff = abs(guessed.age - target.age)
        val ageDirection = when {
            guessed.age == target.age -> NumericDirection.EQUAL
            target.age > guessed.age -> NumericDirection.HIGHER
            else -> NumericDirection.LOWER
        }
        val ageStatus = when {
            ageDirection == NumericDirection.EQUAL -> MatchStatus.MATCH
            ageDiff <= 3 -> MatchStatus.PARTIAL // 3 yaş veya daha az fark varsa sarı ipucu
            else -> MatchStatus.MISMATCH
        }

        // Çıkış Yılı Kontrolü
        val debutDiff = abs(guessed.debutYear - target.debutYear)
        val debutDirection = when {
            guessed.debutYear == target.debutYear -> NumericDirection.EQUAL
            target.debutYear > guessed.debutYear -> NumericDirection.HIGHER
            else -> NumericDirection.LOWER
        }
        val debutStatus = when {
            debutDirection == NumericDirection.EQUAL -> MatchStatus.MATCH
            debutDiff <= 3 -> MatchStatus.PARTIAL
            else -> MatchStatus.MISMATCH
        }

        // Burç Kontrolü
        val zodiacMatch = if (guessed.zodiac.equals(target.zodiac, ignoreCase = true)) {
            MatchStatus.MATCH
        } else {
            MatchStatus.MISMATCH
        }

        return MemberGuessComparison(
            guessedMember = guessed,
            isWin = isWin,
            groupMatch = groupMatch,
            genderMatch = genderMatch,
            roleMatch = roleMatch,
            ageComparison = NumericComparison(guessed.age, ageStatus, ageDirection),
            debutComparison = NumericComparison(guessed.debutYear, debutStatus, debutDirection),
            zodiacMatch = zodiacMatch
        )
    }

    /**
     * Puan Hesaplama Algoritması:
     * - 1. tahminde bilirse: 1000 puan
     * - 2. tahminde: 800 puan
     * - 3. tahminde: 600 puan
     * - 4. tahminde: 450 puan
     * - 5. tahminde: 300 puan
     * - 6+ tahminde: 150 puan
     */
    fun calculateScore(guessCount: Int): Int {
        return when (guessCount) {
            1 -> 1000
            2 -> 800
            3 -> 600
            4 -> 450
            5 -> 300
            else -> 150
        }
    }
}
