package com.tpop.popdle.data.repository

import com.tpop.popdle.data.model.TPopMember

object TPopDatabase {

    val members: List<TPopMember> = listOf(
        // ==========================================
        // 1. MANIFEST (T-Pop Kız Grubu - Big5 / Hypers)
        // İkon: ✨ | Renk: Pembe / Fuşya
        // ==========================================
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
            iconicTrait = "Platin Sarı Saç & Güçlü Tiz Vokaller",
            clueQuote = "Manifest'in sahnedeki ses tüneli ve lider vokali!",
            funFact = "Big5 Türkiye yarışmasında güçlü vokal tekniğiyle jüriden tam not alarak gruba lider seçilmiştir.",
            avatarBgColor = "#EC4899",
            groupIconEmoji = "✨",
            avatarStyleSeed = "sueda"
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
            iconicTrait = "Kızıl Bukleler & Senkronize Akrobatik Dans",
            clueQuote = "Dans pistinde fırtına estiren dinamik adımlar!",
            funFact = "Koreografi provalarında grubun en disiplinli ve detaycı üyesidir.",
            avatarBgColor = "#F43F5E",
            groupIconEmoji = "✨",
            avatarStyleSeed = "hilal"
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
            iconicTrait = "Koyu Siyah Saç & Keskin Sahne Bakışları",
            clueQuote = "T-Pop ritimlerini sert rap beatleriyle harmanlayan tarz!",
            funFact = "Şarkılardaki hızlı flow kısımlarının sözlerini bizzat kendisi yazar.",
            avatarBgColor = "#A855F7",
            groupIconEmoji = "✨",
            avatarStyleSeed = "lidya"
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
            iconicTrait = "Işıltılı Sahne Makyajı & Kadife Vokal Tonu",
            clueQuote = "Kliplerdeki ikonik sahneleri ve büyüleyici visual aurası!",
            funFact = "Grupta stil ve sahne kostümü danışmanlığı yapmaktadır.",
            avatarBgColor = "#06B6D4",
            groupIconEmoji = "✨",
            avatarStyleSeed = "mina"
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
            iconicTrait = "Enerjik Kahverengi Saç & Yüksek Sahne Neşesi",
            clueQuote = "Sahnenin temposunu bir an bile düşürmeyen pozitif enerji!",
            funFact = "Grubun prova aralarındaki moral ve motivasyon kaynağıdır.",
            avatarBgColor = "#10B981",
            groupIconEmoji = "✨",
            avatarStyleSeed = "esin"
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
            iconicTrait = "Doğal Gülüş & Genç Dinamik Dans Tavrı",
            clueQuote = "Grubun en genci olmasına rağmen sahneyi devleştiren yetenek!",
            funFact = "Manifest'in 'maknae'si olup hayranların en çok koruduğu üyedir.",
            avatarBgColor = "#F59E0B",
            groupIconEmoji = "✨",
            avatarStyleSeed = "zeynep"
        ),

        // ==========================================
        // 2. CRUSH (Enerjik & Dinamik T-Pop Grubu)
        // İkon: ⚡ | Renk: Kızıl / Turuncu
        // ==========================================
        TPopMember(
            id = "crush_derin",
            name = "Derin Aksoy",
            group = "Crush",
            gender = "Kadın",
            roles = listOf("Lider", "Ana Rapçi"),
            birthYear = 2002,
            age = 22,
            debutYear = 2023,
            zodiac = "Akrep",
            iconicTrait = "Bordo Örgülü Saç & Güçlü Beat Kontrolü",
            clueQuote = "Crush fırtınasını başlatan sert ve tavizsiz sözler!",
            funFact = "Eski bir profesyonel sokak dansçısı ve koreograftır.",
            avatarBgColor = "#DC2626",
            groupIconEmoji = "⚡",
            avatarStyleSeed = "derin"
        ),
        TPopMember(
            id = "crush_bora",
            name = "Bora Yılmaz",
            group = "Crush",
            gender = "Erkek",
            roles = listOf("Ana Vokal", "Visual"),
            birthYear = 2001,
            age = 23,
            debutYear = 2023,
            zodiac = "Yay",
            iconicTrait = "Karizmatik Deri Ceket & Güçlü Sahne Duruşu",
            clueQuote = "Yüksek oktavlı nakaratlarla salonu inleten vokal gücü!",
            funFact = "Klasik piyano ve elektro gitar eğitimine sahiptir.",
            avatarBgColor = "#EA580C",
            groupIconEmoji = "⚡",
            avatarStyleSeed = "bora"
        ),
        TPopMember(
            id = "crush_selin",
            name = "Selin Deniz",
            group = "Crush",
            gender = "Kadın",
            roles = listOf("Ana Dansçı", "Vokal"),
            birthYear = 2004,
            age = 20,
            debutYear = 2023,
            zodiac = "İkizler",
            iconicTrait = "Neon Sarı Detaylar & Akrobatik Sıçramalar",
            clueQuote = "Yerçekimine meydan okuyan hızlı ayak hareketleri!",
            funFact = "Jimnastik geçmişi sayesinde şovlarda özel sololar sergiler.",
            avatarBgColor = "#D97706",
            groupIconEmoji = "⚡",
            avatarStyleSeed = "selin"
        ),
        TPopMember(
            id = "crush_arda",
            name = "Arda Çetin",
            group = "Crush",
            gender = "Erkek",
            roles = listOf("Maknae", "Rapçi", "Dansçı"),
            birthYear = 2005,
            age = 19,
            debutYear = 2023,
            zodiac = "Aslan",
            iconicTrait = "Sokak Giyim Tarzı & Yüksek Tempolu Ritimler",
            clueQuote = "Crush grubunun genç enerjisini ateşe veren flowlar!",
            funFact = "Klip çekimlerinde arka plan beatlerinin tasarımına katılır.",
            avatarBgColor = "#B91C1C",
            groupIconEmoji = "⚡",
            avatarStyleSeed = "arda"
        ),

        // ==========================================
        // 3. KARMA (Gizemli & Konsept T-Pop Grubu)
        // İkon: 🔮 | Renk: Koyu Mor / İndigo
        // ==========================================
        TPopMember(
            id = "karma_melis",
            name = "Melis Doğan",
            group = "Karma",
            gender = "Kadın",
            roles = listOf("Lider", "Ana Vokal"),
            birthYear = 2000,
            age = 24,
            debutYear = 2022,
            zodiac = "Oğlak",
            iconicTrait = "Koyu Mor Saç & Büyüleyici Derin Tını",
            clueQuote = "Karma döngüsünü başlatan mistik vokaller!",
            funFact = "Konservatuvar opera şan bölümü mezunudur.",
            avatarBgColor = "#7E22CE",
            groupIconEmoji = "🔮",
            avatarStyleSeed = "melis"
        ),
        TPopMember(
            id = "karma_emirhan",
            name = "Emirhan Kaya",
            group = "Karma",
            gender = "Erkek",
            roles = listOf("Prodüktör", "Vokal"),
            birthYear = 1999,
            age = 25,
            debutYear = 2022,
            zodiac = "Kova",
            iconicTrait = "Fütüristik Gözlük & Analog Synth Melodileri",
            clueQuote = "Grubun tüm şarkılarının dijital mimarı ve prodüktörü!",
            funFact = "Elektronik müzik stüdyosunda albümün mikslerini hazırlar.",
            avatarBgColor = "#4338CA",
            groupIconEmoji = "🔮",
            avatarStyleSeed = "emirhan"
        ),
        TPopMember(
            id = "karma_nilsu",
            name = "Nilsu Güler",
            group = "Karma",
            gender = "Kadın",
            roles = listOf("Visual", "Dansçı"),
            birthYear = 2003,
            age = 21,
            debutYear = 2022,
            zodiac = "Balık",
            iconicTrait = "Gümüş Aynalı Kostümler & Akıcı Dans Hatları",
            clueQuote = "Sahnede adeta süzülen masalsı visual estetik!",
            funFact = "Moda haftalarında podyum modelliği yapmaktadır.",
            avatarBgColor = "#6D28D9",
            groupIconEmoji = "🔮",
            avatarStyleSeed = "nilsu"
        ),
        TPopMember(
            id = "karma_kaan",
            name = "Kaan Yıldız",
            group = "Karma",
            gender = "Erkek",
            roles = listOf("Ana Rapçi"),
            birthYear = 2001,
            age = 23,
            debutYear = 2022,
            zodiac = "Akrep",
            iconicTrait = "Koyu Göz Makyajı & Fısıltılı Karanlık Flow",
            clueQuote = "Karmik adalet temasını işleyen çarpıcı lirikler!",
            funFact = "Grubun konsept hikaye evreninin yazar kadrosundadır.",
            avatarBgColor = "#312E81",
            groupIconEmoji = "🔮",
            avatarStyleSeed = "kaan"
        ),

        // ==========================================
        // 4. AURA (Zarif & Parlak Vokal T-Pop Grubu)
        // İkon: 🌟 | Renk: Camgöbeği / Turkuaz
        // ==========================================
        TPopMember(
            id = "aura_duru",
            name = "Duru Aydın",
            group = "Aura",
            gender = "Kadın",
            roles = listOf("Lider", "Lead Vokal"),
            birthYear = 2003,
            age = 21,
            debutYear = 2024,
            zodiac = "Terazi",
            iconicTrait = "Pastel Mavi Saç & Berrak Akustik Tını",
            clueQuote = "Aura'nın ışığını dinleyicilerin kalbine taşıyan ses!",
            funFact = "Şarkı söylerken nefes teknikleri üzerine video eğitimleri verir.",
            avatarBgColor = "#0284C7",
            groupIconEmoji = "🌟",
            avatarStyleSeed = "duru"
        ),
        TPopMember(
            id = "aura_berk",
            name = "Berk Saner",
            group = "Aura",
            gender = "Erkek",
            roles = listOf("Ana Vokal"),
            birthYear = 2002,
            age = 22,
            debutYear = 2024,
            zodiac = "Başak",
            iconicTrait = "Beyaz Sahne Takımı & Pürüzsüz Falsetto",
            clueQuote = "Gökyüzüne yükselen tiz notalar ve duygusal derinlik!",
            funFact = "Caz vokal yarışmalarında birincilik ödülü almıştır.",
            avatarBgColor = "#0D9488",
            groupIconEmoji = "🌟",
            avatarStyleSeed = "berk"
        ),
        TPopMember(
            id = "aura_irem",
            name = "İrem Şahin",
            group = "Aura",
            gender = "Kadın",
            roles = listOf("Ana Dansçı", "Maknae"),
            birthYear = 2005,
            age = 19,
            debutYear = 2024,
            zodiac = "Yengeç",
            iconicTrait = "Zarif Kuğu Figürleri & Senkronize Adımlar",
            clueQuote = "Zarafetle enerjiyi birleştiren büyüleyici koreografi!",
            funFact = "Modern dans ve lirik bale eğitimine 6 yaşında başlamıştır.",
            avatarBgColor = "#06B6D4",
            groupIconEmoji = "🌟",
            avatarStyleSeed = "irem"
        ),
        TPopMember(
            id = "aura_mert",
            name = "Mert Koç",
            group = "Aura",
            gender = "Erkek",
            roles = listOf("Visual", "Vokal"),
            birthYear = 2001,
            age = 23,
            debutYear = 2024,
            zodiac = "Boğa",
            iconicTrait = "Kristal Işıltılı Küpeler & Karizmatik Gülüş",
            clueQuote = "Kamera kadrajına girdiği an dikkatleri çeken visual güç!",
            funFact = "Kamera arkası belgesellerinin kurgusunu yapmaktadır.",
            avatarBgColor = "#059669",
            groupIconEmoji = "🌟",
            avatarStyleSeed = "mert"
        ),

        // ==========================================
        // 5. MANTRA (Spiritüel & Etnik Pop-Fusion)
        // İkon: 🪷 | Renk: Altın / Amber
        // ==========================================
        TPopMember(
            id = "mantra_ruzgar",
            name = "Rüzgar Yalçın",
            group = "Mantra",
            gender = "Erkek",
            roles = listOf("Lider", "Söz Yazarı", "Vokal"),
            birthYear = 1999,
            age = 25,
            debutYear = 2023,
            zodiac = "Yay",
            iconicTrait = "Otantik Etnik Aksesuarlar & Derin Bariton Ses",
            clueQuote = "Doğu ve Batı sentezini modern ritimlerle kutsayan ses!",
            funFact = "Ney ve ud gibi geleneksel enstrümanları modern popla harmanlar.",
            avatarBgColor = "#D97706",
            groupIconEmoji = "🪷",
            avatarStyleSeed = "ruzgar"
        ),
        TPopMember(
            id = "mantra_asli",
            name = "Aslı Demir",
            group = "Mantra",
            gender = "Kadın",
            roles = listOf("Ana Vokal"),
            birthYear = 2001,
            age = 23,
            debutYear = 2023,
            zodiac = "Koç",
            iconicTrait = "Altın Varaklı Saç Bandı & Güçlü Soul Gırtlak",
            clueQuote = "İçsel huzurla yüksek sahne temposunu buluşturan tını!",
            funFact = "Geleneksel halk türkülerini modern R&B formatında yeniden aranje eder.",
            avatarBgColor = "#B45309",
            groupIconEmoji = "🪷",
            avatarStyleSeed = "asli"
        ),
        TPopMember(
            id = "mantra_caner",
            name = "Caner Öztürk",
            group = "Mantra",
            gender = "Erkek",
            roles = listOf("Ana Rapçi", "Dansçı"),
            birthYear = 2002,
            age = 22,
            debutYear = 2023,
            zodiac = "Aslan",
            iconicTrait = "Etnik Perküsyon Dövmeleri & Hipnotik Flow",
            clueQuote = "Darbuka ve elektronik beatler üzerinde dans eden kafiyeler!",
            funFact = "Konserlerde canlı perküsyon solosu atarak seyirciyi coşturur.",
            avatarBgColor = "#CA8A04",
            groupIconEmoji = "🪷",
            avatarStyleSeed = "caner"
        ),
        TPopMember(
            id = "mantra_zehra",
            name = "Zehra Tan",
            group = "Mantra",
            gender = "Kadın",
            roles = listOf("Maknae", "Visual", "Dans"),
            birthYear = 2004,
            age = 20,
            debutYear = 2023,
            zodiac = "İkizler",
            iconicTrait = "İpeksi Sarı Şallar & Meditatif Koreografi",
            clueQuote = "Mantra'nın huzurlu ve büyüleyici sahne aurası!",
            funFact = "Yoga ve meditasyon eğitmenliği sertifikasına sahiptir.",
            avatarBgColor = "#EAB308",
            groupIconEmoji = "🪷",
            avatarStyleSeed = "zehra"
        ),

        // ==========================================
        // 6. RADİKAL (Asi & Rock-Pop T-Pop Grubu)
        // İkon: 🔥 | Renk: Kızıl / Siyah Kömür
        // ==========================================
        TPopMember(
            id = "radikal_baris",
            name = "Barış Keskin",
            group = "Radikal",
            gender = "Erkek",
            roles = listOf("Lider", "Ana Vokal", "Gitar"),
            birthYear = 2000,
            age = 24,
            debutYear = 2022,
            zodiac = "Koç",
            iconicTrait = "Siyah Elektro Gitar & Yırtıcı Karizmatik Vokal",
            clueQuote = "Radikal başkaldırının sahnede yankılanan gür sesi!",
            funFact = "Tüm bestelerini analog distortion pedallarıyla evinde kaydeder.",
            avatarBgColor = "#BE123C",
            groupIconEmoji = "🔥",
            avatarStyleSeed = "baris"
        ),
        TPopMember(
            id = "radikal_aylin",
            name = "Aylin Erdem",
            group = "Radikal",
            gender = "Kadın",
            roles = listOf("Ana Basçı", "Vokal"),
            birthYear = 2002,
            age = 22,
            debutYear = 2022,
            zodiac = "Akrep",
            iconicTrait = "Deri Çizmeler & Kalpleri Titreten Bas Riffleri",
            clueQuote = "Şarkıların ritim iskeletini inşa eden asi bas yürüyüşleri!",
            funFact = "Konserlerde seyircinin üzerine atlayarak sahne şovu yapar.",
            avatarBgColor = "#9F1239",
            groupIconEmoji = "🔥",
            avatarStyleSeed = "aylin"
        ),
        TPopMember(
            id = "radikal_doruk",
            name = "Doruk Korkmaz",
            group = "Radikal",
            gender = "Erkek",
            roles = listOf("Davulcu", "Rapçi"),
            birthYear = 2001,
            age = 23,
            debutYear = 2022,
            zodiac = "Boğa",
            iconicTrait = "Dikenli Saçlar & Çift Pedallı Yüksek Hızlı Vuruşlar",
            clueQuote = "Radikal sound'unun kalp atışı ve durdurulamaz temposu!",
            funFact = "Her konserde en az bir çift baget kıracak kadar sert çalar.",
            avatarBgColor = "#881337",
            groupIconEmoji = "🔥",
            avatarStyleSeed = "doruk"
        ),
        TPopMember(
            id = "radikal_ece",
            name = "Ece Vural",
            group = "Radikal",
            gender = "Kadın",
            roles = listOf("Klavye", "Synth", "Vokal"),
            birthYear = 2003,
            age = 21,
            debutYear = 2022,
            zodiac = "Kova",
            iconicTrait = "Neon Pembe Klavyeler & Saykodelik Solo Partları",
            clueQuote = "Rock rifflerini elektronik synthlerle buluşturan ses patlaması!",
            funFact = "Kendi tasarladığı analog modüler synth'leri sahnede kullanır.",
            avatarBgColor = "#4C0519",
            groupIconEmoji = "🔥",
            avatarStyleSeed = "ece"
        )
    )

    // Sadece izin verilen 6 grup
    val allowedGroups: List<String> = listOf("Manifest", "Crush", "Karma", "Aura", "Mantra", "Radikal")

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
