package com.tpop.popdle.data.model

enum class MatchStatus {
    MATCH,    // Yeşil (Tam Eşleşme)
    PARTIAL,  // Sarı (Kısmi Eşleşme / Yakın Değer)
    MISMATCH  // Kırmızı (Yanlış)
}

enum class NumericDirection {
    EQUAL,   // Tam eşit
    HIGHER,  // Hedef kişi daha büyük / daha yeni (Yukarı Ok ▲)
    LOWER    // Hedef kişi daha küçük / daha eski (Aşağı Ok ▼)
}

data class NumericComparison(
    val value: Int,
    val status: MatchStatus,
    val direction: NumericDirection
)

data class MemberGuessComparison(
    val guessedMember: TPopMember,
    val isWin: Boolean,
    val groupMatch: MatchStatus,
    val genderMatch: MatchStatus,
    val roleMatch: MatchStatus,
    val ageComparison: NumericComparison,
    val debutComparison: NumericComparison,
    val zodiacMatch: MatchStatus
)
