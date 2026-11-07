package com.tpop.popdle.data.model

data class TPopMember(
    val id: String,
    val name: String,
    val group: String, // Manifest, Crush, Karma, Aura, Mantra, Radikal
    val gender: String, // "Kadın" veya "Erkek"
    val roles: List<String>, // Örn: ["Lider", "Ana Vokal"]
    val birthYear: Int,
    val age: Int,
    val debutYear: Int,
    val zodiac: String, // Burç
    val iconicTrait: String, // Görsel / Sahne özelliği
    val clueQuote: String, // Şarkı sözü / ipucu
    val funFact: String, // İlginç bilgi
    val avatarBgColor: String = "#8B5CF6",
    val groupIconEmoji: String = "✨",
    val avatarStyleSeed: String = "", // Görsel avatar oluşturucu tohumu
    val photoUrl: String = "",
    val searchUrl: String = ""
) {
    val roleDisplay: String
        get() = roles.joinToString(", ")
}
