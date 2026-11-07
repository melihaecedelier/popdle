package com.tpop.popdle.data.model

data class TPopMember(
    val id: String,
    val name: String,
    val group: String,
    val gender: String, // "Kadın" veya "Erkek"
    val roles: List<String>, // Örn: ["Lider", "Ana Vokal"]
    val birthYear: Int,
    val age: Int,
    val debutYear: Int,
    val zodiac: String, // Örn: "Yay", "Akrep", "Balık"
    val iconicTrait: String, // Örn: "Karizmatik Sahne Dansı"
    val clueQuote: String, // Şarkı sözü / ipucu
    val funFact: String, // Eğlenceli gerçek
    val avatarBgColor: String = "#8B5CF6"
) {
    val roleDisplay: String
        get() = roles.joinToString(", ")
}
