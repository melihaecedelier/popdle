package com.tpop.popdle.data.repository

import com.tpop.popdle.data.model.TPopMember

object TPopDatabase {

    val members: List<TPopMember> = listOf(
        // === MANIFEST GRUBU (Yeni Nesil T-Pop Kız Grubu - Big5 / Hypers) ===
        TPopMember(
            id = "manifest_sueda",
            name = "Sueda Uluca",
            group = "Manifest",
            gender = "Kadın",
            roles = listOf("Lider", "Ana Vokal"),
            birthYear = 2002,
            age = 22,
            debutYear = 2024,
            zodiac = "Koç",
            iconicTrait = "Güçlü Tiz Vokaller & Grup Liderliği",
            clueQuote = "Manifest'in sahnedeki ses tüneli ve lider vokali!",
            funFact = "Big5 Türkiye yarışmasında güçlü vokal tekniğiyle jüriden tam not alarak gruba lider seçilmiştir.",
            avatarBgColor = "#EC4899"
        ),
        TPopMember(
            id = "manifest_hilal",
            name = "Hilal Yelekçi",
            group = "Manifest",
            gender = "Kadın",
            roles = listOf("Ana Dansçı", "Vokal"),
            birthYear = 2003,
            age = 21,
            debutYear = 2024,
            zodiac = "Boğa",
            iconicTrait = "Senkronize Koreografi & Sahne Karizması",
            clueQuote = "Dans pistinde fırtına estiren dinamik adımlar!",
            funFact = "Dans koreografilerinin hazırlanmasında grubun en aktif ve yaratıcı yönlendiricisidir.",
            avatarBgColor = "#F43F5E"
        ),
        TPopMember(
            id = "manifest_lidya",
            name = "Lidya Pınar",
            group = "Manifest",
            gender = "Kadın",
            roles = listOf("Ana Rapçi", "Vokal"),
            birthYear = 2004,
            age = 20,
            debutYear = 2024,
            zodiac = "Aslan",
            iconicTrait = "Hızlı Ritim Flowları & Keskin Sahne Duruşu",
            clueQuote = "T-Pop ritimlerini rap beatleriyle harmanlayan enerjik tarz!",
            funFact = "Grubun şarkılarındaki dinamik rap kısımlarının söz yazımına katkıda bulunmaktadır.",
            avatarBgColor = "#8B5CF6"
        ),
        TPopMember(
            id = "manifest_mina",
            name = "Mina Solak",
            group = "Manifest",
            gender = "Kadın",
            roles = listOf("Visual", "Lead Vokal"),
            birthYear = 2003,
            age = 21,
            debutYear = 2024,
            zodiac = "Terazi",
            iconicTrait = "Büyüleyici Kamera Bakışları & Melodik Tını",
            clueQuote = "Kliplerdeki ikonik sahneleri ve kadife vokaliyle öne çıkıyor!",
            funFact = "Moda ve sahne kostümü tasarımına özel ilgi duymaktadır.",
            avatarBgColor = "#06B6D4"
        ),
        TPopMember(
            id = "manifest_esin",
            name = "Esin Bahat",
            group = "Manifest",
            gender = "Kadın",
            roles = listOf("Vokal", "Dansçı"),
            birthYear = 2001,
            age = 23,
            debutYear = 2024,
            zodiac = "İkizler",
            iconicTrait = "Çok Yönlü Sahne Enerjisi & Canlı Şovlar",
            clueQuote = "Sahnenin ritmini bir an bile düşürmeyen pozitif enerji!",
            funFact = "Grupta motivasyon kaynağı ve en neşeli üye olarak bilinir.",
            avatarBgColor = "#10B981"
        ),
        TPopMember(
            id = "manifest_zeynep",
            name = "Zeynep Sude Oktay",
            group = "Manifest",
            gender = "Kadın",
            roles = listOf("Maknae", "Vokal", "Dansçı"),
            birthYear = 2005,
            age = 19,
            debutYear = 2024,
            zodiac = "Balık",
            iconicTrait = "Grubun En Genç Üyesi & Taze Vokal Rengi",
            clueQuote = "Genç yaşına rağmen sahneyi devleştiren doğal yetenek!",
            funFact = "Manifest'in 'maknae'si (en genç üyesi) olup hayranlar tarafından sevgiyle korunmaktadır.",
            avatarBgColor = "#F59E0B"
        ),

        // === KÖFN (Yeni Nesil Synth-Pop & Alternatif Pop İkilisi) ===
        TPopMember(
            id = "kofn_salman",
            name = "Salman Tin",
            group = "KÖFN",
            gender = "Erkek",
            roles = listOf("Ana Vokal", "Söz Yazarı"),
            birthYear = 1992,
            age = 32,
            debutYear = 2018,
            zodiac = "İkizler",
            iconicTrait = "Melankolik Vokal & 'Bi Tek Ben Anlarım'",
            clueQuote = "Ben seni öyle bir severim ki aklın durur!",
            funFact = "Şarkı sözlerinin tamamına yakınını kendi derin duygu dünyasından ilham alarak yazmaktadır.",
            avatarBgColor = "#6366F1"
        ),
        TPopMember(
            id = "kofn_bilge",
            name = "Bilge Kağan Etil",
            group = "KÖFN",
            gender = "Erkek",
            roles = listOf("Prodüktör", "Klavye"),
            birthYear = 1989,
            age = 35,
            debutYear = 2018,
            zodiac = "Yay",
            iconicTrait = "Elektronik Altyapılar & Retro Synth Melodileri",
            clueQuote = "80'ler analog synth tınılarını modern popla buluşturan mimar!",
            funFact = "Klasik müzik ve caz piyanistliği geçmişine sahiptir.",
            avatarBgColor = "#3B82F6"
        ),

        // === MADRIGAL (Modern T-Pop & Indie Pop-Rock) ===
        TPopMember(
            id = "madrigal_anil",
            name = "Anıl Erbil",
            group = "Madrigal",
            gender = "Erkek",
            roles = listOf("Lider", "Ana Vokal", "Gitar"),
            birthYear = 1993,
            age = 31,
            debutYear = 2014,
            zodiac = "Akrep",
            iconicTrait = "Hüzünlü & Büyüleyici Vokal Tonu",
            clueQuote = "Seni dert etmeler yalan oldu...",
            funFact = "'Seni Dert Etmeler' parçasıyla Spotify listelerini aylarca domine etmiştir.",
            avatarBgColor = "#EF4444"
        ),
        TPopMember(
            id = "madrigal_ceyhun",
            name = "Ceyhun Kırdemir",
            group = "Madrigal",
            gender = "Erkek",
            roles = listOf("Bas Gitar"),
            birthYear = 1992,
            age = 32,
            debutYear = 2014,
            zodiac = "Başak",
            iconicTrait = "Güçlü Bas Yürüyüşleri & Ritim Çatısı",
            clueQuote = "Grubun şarkılarının omurgasını oluşturan bas riffleri!",
            funFact = "Konserlerde enerjik bas sololarıyla bilinir.",
            avatarBgColor = "#14B8A6"
        ),

        // === DOLU KADEHİ TERS TUT (Yeni Nesil Pop-Rock İkilisi) ===
        TPopMember(
            id = "dktt_ugurhan",
            name = "Uğurhan Özay",
            group = "Dolu Kadehi Ters Tut",
            gender = "Erkek",
            roles = listOf("Ana Vokal", "Söz Yazarı"),
            birthYear = 1993,
            age = 31,
            debutYear = 2014,
            zodiac = "Yay",
            iconicTrait = "Samimi Anlatım & Özgün Vokal Tavrı",
            clueQuote = "Madem öyle, işte böyle...",
            funFact = "Grubun ismi Ömer Hayyam'ın bir rubaisinden esinlenilmiştir.",
            avatarBgColor = "#D97706"
        ),
        TPopMember(
            id = "dktt_ogulcan",
            name = "Mürsel Oğulcan Ava",
            group = "Dolu Kadehi Ters Tut",
            gender = "Erkek",
            roles = listOf("Prodüktör", "Gitar"),
            birthYear = 1993,
            age = 31,
            debutYear = 2014,
            zodiac = "Kova",
            iconicTrait = "Aranjeler & Bağımsız Müzik Prodüksiyonu",
            clueQuote = "Tüm aranjeleri ev stüdyosunda inşa eden vizyoner gitarist!",
            funFact = "Mimar Sinan Üniversitesi mezunu olup görsel kliplerin de yönetmenliğini yapmıştır.",
            avatarBgColor = "#7C3AED"
        ),

        // === HEPSİ (Türkiye'nin Öncü Kız Pop Grubu - Klasik T-Pop Referansı) ===
        TPopMember(
            id = "hepsi_gulcin",
            name = "Gülçin Ergül",
            group = "Grup Hepsi",
            gender = "Kadın",
            roles = listOf("Ana Vokal", "Dansçı"),
            birthYear = 1985,
            age = 39,
            debutYear = 2005,
            zodiac = "Akrep",
            iconicTrait = "Akrobatik Danslar & Yüksek Oktav Vokaller",
            clueQuote = "Olmaz Oğlan, bir bakışta aşık oldum!",
            funFact = "Mimar Sinan Devlet Konservatuvarı Bale ve Müzikal bölümü mezunudur.",
            avatarBgColor = "#E11D48"
        ),
        TPopMember(
            id = "hepsi_cemre",
            name = "Cemre Kemer",
            group = "Grup Hepsi",
            gender = "Kadın",
            roles = listOf("Lider", "Vokal"),
            birthYear = 1985,
            age = 39,
            debutYear = 2005,
            zodiac = "Kova",
            iconicTrait = "İkonik Saç Modeli & Popüler Medya İkonu",
            clueQuote = "Yalan mı, söylediklerin yalan mı?",
            funFact = "Grup Hepsi'nin gençlik dizisi 'Hepsi 1'de başrol oynamıştır.",
            avatarBgColor = "#A855F7"
        )
    )

    fun findById(id: String): TPopMember? = members.find { it.id == id }

    fun findByName(name: String): TPopMember? = members.find {
        it.name.equals(name.trim(), ignoreCase = true)
    }

    fun searchMembers(query: String): List<TPopMember> {
        if (query.isBlank()) return emptyList()
        val clean = query.trim().lowercase()
        return members.filter {
            it.name.lowercase().contains(clean) ||
            it.group.lowercase().contains(clean)
        }
    }
}
