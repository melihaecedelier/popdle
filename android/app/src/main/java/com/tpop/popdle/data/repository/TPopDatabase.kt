package com.tpop.popdle.data.repository

import com.tpop.popdle.data.model.TPopMember
import com.tpop.popdle.data.model.TPopSong

object TPopDatabase {

    val members: List<TPopMember> = listOf(
        // ==========================================
        // 1. MANIFEST (T-Pop Kız Grubu)
        // Çıkış: 2025 (Zamansızdık)
        // ==========================================
        TPopMember(
            id = "manifest_esin",
            name = "Esin Bahat",
            group = "Manifest",
            gender = "Kadın",
            roles = listOf("Ana Dansçı"),
            birthYear = 2001,
            age = 25,
            debutYear = 2025,
            zodiac = "İkizler",
            iconicTrait = "Ana Dansçı (Main Dancer) • 'Zamansızdık', 'Rüya'",
            clueQuote = "Zamansızdık ama sahnede ritmi asla kaçırmadık!",
            funFact = "Manifest grubunun Ana Dansçısıdır. Grubun çıkış şarkısı 'Zamansızdık' ve 'Rüya' kliplerinde koreografiye liderlik etmiştir.",
            avatarBgColor = "#EC4899",
            groupIconEmoji = "✨",
            avatarStyleSeed = "esin"
        ),
        TPopMember(
            id = "manifest_hilal",
            name = "Hilal Yelekçi",
            group = "Manifest",
            gender = "Kadın",
            roles = listOf("Baş Dansçı"),
            birthYear = 2003,
            age = 23,
            debutYear = 2025,
            zodiac = "Boğa",
            iconicTrait = "Baş Dansçı (Lead Dancer) • 'Başrol Sensin', 'KTS'",
            clueQuote = "Bu hikayede başrol sensin!",
            funFact = "Manifest grubunun Baş Dansçısıdır. 'Başrol Sensin' ve 'KTS' teklilerinde dinamik dans çizgileriyle öne çıkmaktadır.",
            avatarBgColor = "#F43F5E",
            groupIconEmoji = "✨",
            avatarStyleSeed = "hilal"
        ),
        TPopMember(
            id = "manifest_lidya",
            name = "Lidya Pınar",
            group = "Manifest",
            gender = "Kadın",
            roles = listOf("Rapçi", "Vokal"),
            birthYear = 2004,
            age = 22,
            debutYear = 2025,
            zodiac = "Aslan",
            iconicTrait = "Rap & Vokalist • 'Snap', 'Arıyo'",
            clueQuote = "Arıyo ama nafile, Snap attım sahneden!",
            funFact = "Manifest grubunun üyesidir. 'Snap' ve 'Arıyo' parçalarında enerjik sahne tavrıyla bilinir.",
            avatarBgColor = "#A855F7",
            groupIconEmoji = "✨",
            avatarStyleSeed = "lidya"
        ),
        TPopMember(
            id = "manifest_mina",
            name = "Mina Solak",
            group = "Manifest",
            gender = "Kadın",
            roles = listOf("Yardımcı Vokalist"),
            birthYear = 2003,
            age = 23,
            debutYear = 2025,
            zodiac = "Terazi",
            iconicTrait = "Yardımcı Vokalist (Sub Vocal) • 'Daha İyi', 'Amatör'",
            clueQuote = "Artık çok daha iyi, amatör hislere elveda!",
            funFact = "Manifest grubunun Yardımcı Vokalistidir (Sub Vocal). 'Daha İyi' ve 'Amatör' teklilerindeki melodik tınılarıyla dikkat çeker.",
            avatarBgColor = "#06B6D4",
            groupIconEmoji = "✨",
            avatarStyleSeed = "mina"
        ),
        TPopMember(
            id = "manifest_sueda",
            name = "Sueda Uluca",
            group = "Manifest",
            gender = "Kadın",
            roles = listOf("Ana Vokalist"),
            birthYear = 2002,
            age = 24,
            debutYear = 2025,
            zodiac = "Koç",
            iconicTrait = "Ana Vokalist (Main Vocal) • 'Hileli (feat. Ajda Pekkan)', 'TRALALA'",
            clueQuote = "Ajda Pekkan ile 'Hileli' düetinde parlayan ana vokal sesi!",
            funFact = "Manifest'in Ana Vokalistidir. Türk pop divası Ajda Pekkan ile seslendirdikleri 'Hileli' şarkısında ana vokalleri üstlenmiştir.",
            avatarBgColor = "#EC4899",
            groupIconEmoji = "✨",
            avatarStyleSeed = "sueda"
        ),
        TPopMember(
            id = "manifest_zeynep",
            name = "Zeynep Sude Oktay",
            group = "Manifest",
            gender = "Kadın",
            roles = listOf("Ana Rapçi"),
            birthYear = 2005,
            age = 21,
            debutYear = 2025,
            zodiac = "Balık",
            iconicTrait = "Ana Rapçi (Main Rapper) • 'Toz Pembe', 'Snap'",
            clueQuote = "Toz pembe dünyaları yıkan hızlı flowlar!",
            funFact = "Manifest grubunun Ana Rapçisidir (Main Rapper). 'Toz Pembe' parçasındaki keskin rap bölümlerini seslendirmiştir.",
            avatarBgColor = "#F59E0B",
            groupIconEmoji = "✨",
            avatarStyleSeed = "zeynep"
        ),

        // ==========================================
        // 2. CRUSH (T-Pop Erkek Grubu)
        // Çıkış: 2026-07-31 (CRUSH!)
        // ==========================================
        TPopMember(
            id = "crush_oguzhan",
            name = "Oğuzhan Çifçi",
            group = "Crush",
            gender = "Erkek",
            roles = listOf("Vokalist"),
            birthYear = 2001,
            age = 25,
            debutYear = 2026,
            zodiac = "Akrep",
            iconicTrait = "Crush Vokalisti • 'CRUSH!', 'Benim Olsana'",
            clueQuote = "CRUSH! Sahneye adım attığımız ilk an!",
            funFact = "Crush grubunun üyesidir. Grubun 31 Temmuz 2026 tarihli çıkış teklisi 'CRUSH!' ve 'Benim Olsana' parçalarında yer almıştır.",
            avatarBgColor = "#DC2626",
            groupIconEmoji = "⚡",
            avatarStyleSeed = "oguzhan"
        ),
        TPopMember(
            id = "crush_batu",
            name = "Batu Cengiz",
            group = "Crush",
            gender = "Erkek",
            roles = listOf("Dansçı", "Vokal"),
            birthYear = 2002,
            age = 24,
            debutYear = 2026,
            zodiac = "Yay",
            iconicTrait = "Crush Dans & Sahne Enerjisi • 'Benim Olsana'",
            clueQuote = "Kaçma benden, benim olsana!",
            funFact = "Crush grubunun üyesidir. Grubun Eylül 2026'da yayımlanan ikinci teklisi 'Benim Olsana' klibinde öne çıkmaktadır.",
            avatarBgColor = "#EA580C",
            groupIconEmoji = "⚡",
            avatarStyleSeed = "batu"
        ),
        TPopMember(
            id = "crush_baris",
            name = "Barış Çağan Yüksekkaya",
            group = "Crush",
            gender = "Erkek",
            roles = listOf("Vokalist"),
            birthYear = 2000,
            age = 26,
            debutYear = 2026,
            zodiac = "Koç",
            iconicTrait = "Crush Güçlü Vokal • 'CRUSH!'",
            clueQuote = "İlk single ile T-Pop listelerini sarsan vokal tavrı!",
            funFact = "Crush grubunun üyesidir. Grubun vokal harmonilerinin omurgasında yer alır.",
            avatarBgColor = "#B91C1C",
            groupIconEmoji = "⚡",
            avatarStyleSeed = "baris_cagan"
        ),
        TPopMember(
            id = "crush_mirac",
            name = "Miraç Fırat",
            group = "Crush",
            gender = "Erkek",
            roles = listOf("Dansçı"),
            birthYear = 2003,
            age = 23,
            debutYear = 2026,
            zodiac = "Aslan",
            iconicTrait = "Crush Sahne Koreografisi • 'CRUSH!'",
            clueQuote = "Senkronize adımlar ve patlayıcı sokak koreografisi!",
            funFact = "Crush grubunun üyesidir. Canlı sahne performanslarında dans figürleriyle dikkat çeker.",
            avatarBgColor = "#D97706",
            groupIconEmoji = "⚡",
            avatarStyleSeed = "mirac"
        ),
        TPopMember(
            id = "crush_milan",
            name = "Milan Önder",
            group = "Crush",
            gender = "Erkek",
            roles = listOf("Visual", "Vokal"),
            birthYear = 2002,
            age = 24,
            debutYear = 2026,
            zodiac = "İkizler",
            iconicTrait = "Crush Visual Karizma • 'Benim Olsana'",
            clueQuote = "Kamera karşısında karizmatik duruş ve vokaller!",
            funFact = "Crush grubunun üyesidir. Fotoğraf çekimlerinde ve tanıtım materyallerinde grubun görsel yüzlerindendir.",
            avatarBgColor = "#991B1B",
            groupIconEmoji = "⚡",
            avatarStyleSeed = "milan"
        ),
        TPopMember(
            id = "crush_arda",
            name = "Arda Soydoğan",
            group = "Crush",
            gender = "Erkek",
            roles = listOf("Rapçi"),
            birthYear = 2004,
            age = 22,
            debutYear = 2026,
            zodiac = "Boğa",
            iconicTrait = "Crush Hızlı Flow • 'CRUSH!'",
            clueQuote = "Ritimleri hızlandıran dinamik rap flowları!",
            funFact = "Crush grubunun üyesidir. Şarkılardaki dinamik geçiş kısımlarında yer alır.",
            avatarBgColor = "#C2410C",
            groupIconEmoji = "⚡",
            avatarStyleSeed = "arda_soydogan"
        ),
        TPopMember(
            id = "crush_efe",
            name = "Efe Şan",
            group = "Crush",
            gender = "Erkek",
            roles = listOf("Dansçı", "Vokal"),
            birthYear = 2005,
            age = 21,
            debutYear = 2026,
            zodiac = "Balık",
            iconicTrait = "Crush Genç Enerji • 'Benim Olsana'",
            clueQuote = "Crush grubunun taze ve enerjik sahne ritmi!",
            funFact = "Crush grubunun üyesidir. Genç yaşı ve yüksek sahne enerjisiyle tanınır.",
            avatarBgColor = "#7F1D1D",
            groupIconEmoji = "⚡",
            avatarStyleSeed = "efe"
        ),

        // ==========================================
        // 3. KARMA (KARM6 - Co-ed / Karma Grup)
        // Çıkış: 2026-05-22 (Serotonin EP)
        // ==========================================
        TPopMember(
            id = "karma_cem",
            name = "Cem Suha Kurt",
            group = "Karma",
            gender = "Erkek",
            roles = listOf("Ana Rapçi", "Ana Dansçı"),
            birthYear = 2000,
            age = 26,
            debutYear = 2026,
            zodiac = "Oğlak",
            iconicTrait = "Ana Rapçi & Ana Dansçı • 'Keşke Benim Olsa', 'KARMA'",
            clueQuote = "Keşke benim olsa dediğin an sahnedeyiz!",
            funFact = "KARM6 (Karma) grubunun Ana Rapçisi ve Ana Dansçısıdır. 'Serotonin' EP'sinde ve 'KARMA' teklisinde yer almıştır.",
            avatarBgColor = "#7E22CE",
            groupIconEmoji = "🔮",
            avatarStyleSeed = "cem_suha"
        ),
        TPopMember(
            id = "karma_ezgi",
            name = "Ezgi Akliman",
            group = "Karma",
            gender = "Kadın",
            roles = listOf("Ana Rapçi", "Ana Dansçı"),
            birthYear = 2002,
            age = 24,
            debutYear = 2026,
            zodiac = "Akrep",
            iconicTrait = "Ana Rapçi & Ana Dansçı • 'Crop Top', 'Blok Blok'",
            clueQuote = "Crop Top giydik, blok blok vurduk ritimleri!",
            funFact = "Karma (KARM6) grubunun Ana Rapçisi ve Ana Dansçısıdır. Serotonin EP'sindeki 'Crop Top' ve 'Blok Blok' parçalarında başroldedir.",
            avatarBgColor = "#9333EA",
            groupIconEmoji = "🔮",
            avatarStyleSeed = "ezgi"
        ),
        TPopMember(
            id = "karma_ozlem",
            name = "Özlem Naz Gözcü",
            group = "Karma",
            gender = "Kadın",
            roles = listOf("Ana Vokalist"),
            birthYear = 2001,
            age = 25,
            debutYear = 2026,
            zodiac = "Yengeç",
            iconicTrait = "Ana Vokalist (Main Vocal) • 'Sırra Kadem', 'İhtimal'",
            clueQuote = "Sırra kadem bastık, başka bir ihtimal yok!",
            funFact = "Karma grubunun Ana Vokalistidir (Main Vocal). 'Sırra Kadem' ve 'İhtimal' parçalarındaki güçlü tizleriyle bilinir.",
            avatarBgColor = "#6B21A8",
            groupIconEmoji = "🔮",
            avatarStyleSeed = "ozlem_naz"
        ),
        TPopMember(
            id = "karma_adilcan",
            name = "Adilcan Bilgin",
            group = "Karma",
            gender = "Erkek",
            roles = listOf("Ana Vokalist"),
            birthYear = 2000,
            age = 26,
            debutYear = 2026,
            zodiac = "Başak",
            iconicTrait = "Ana Vokalist • 'Ta Burama (feat. Serdar Ortaç)', 'Önümüz Yaz'",
            clueQuote = "Ta burama geldi dedirten Serdar Ortaç düeti!",
            funFact = "Karma grubunun Ana Vokalistidir. Ağustos 2026'da yayımlanan 'Ta Burama (feat. Serdar Ortaç)' teklisinde ana vokalleri üstlenmiştir.",
            avatarBgColor = "#581C87",
            groupIconEmoji = "🔮",
            avatarStyleSeed = "adilcan"
        ),
        TPopMember(
            id = "karma_erdeniz",
            name = "Erdeniz Telli",
            group = "Karma",
            gender = "Erkek",
            roles = listOf("Baş Vokalist", "Baş Dansçı"),
            birthYear = 2001,
            age = 25,
            debutYear = 2026,
            zodiac = "Terazi",
            iconicTrait = "Baş Vokalist & Baş Dansçı • 'Serotonin EP', 'KARMA'",
            clueQuote = "Serotonin salgılatan dengeli ve akıcı sahne şovu!",
            funFact = "Karma grubunun Baş Vokalisti ve Baş Dansçısıdır. Karma'nın 19 Eylül 2026 tarihli grup adını taşıyan 'KARMA' teklisinde yer almıştır.",
            avatarBgColor = "#4C1D95",
            groupIconEmoji = "🔮",
            avatarStyleSeed = "erdeniz"
        ),
        TPopMember(
            id = "karma_ada",
            name = "Ada Atılgan",
            group = "Karma",
            gender = "Kadın",
            roles = listOf("Baş Vokalist", "Baş Dansçı"),
            birthYear = 2003,
            age = 23,
            debutYear = 2026,
            zodiac = "Balık",
            iconicTrait = "Baş Vokalist & Baş Dansçı • 'Önümüz Yaz', 'Serotonin'",
            clueQuote = "Önümüz yaz, enerjimiz yüksek!",
            funFact = "Karma grubunun Baş Vokalisti ve Baş Dansçısıdır. Grubun renkli ve dinamik şarkısı 'Önümüz Yaz'da vokal sololarına sahiptir.",
            avatarBgColor = "#3B0764",
            groupIconEmoji = "🔮",
            avatarStyleSeed = "ada_atilgan"
        ),

        // ==========================================
        // 4. AURA (AURA - T-Pop Kız Grubu)
        // Çıkış: 2026-05-15 (YUH!) • Albüm: ELEMENTAL
        // ==========================================
        TPopMember(
            id = "aura_asli",
            name = "Aslı Göztaşı",
            group = "Aura",
            gender = "Kadın",
            roles = listOf("Baş Dansçı"),
            birthYear = 2002,
            age = 24,
            debutYear = 2026,
            zodiac = "Yay",
            iconicTrait = "Baş Dansçı (Lead Dancer) • 'YUH!', 'Tuzak'",
            clueQuote = "YUH! Dedirten çıkış parçası ve tuzak dolu ritimler!",
            funFact = "Aura grubunun Baş Dansçısıdır (Lead Dancer). Grubun 15 Mayıs 2026'daki çıkış teklisi 'YUH!' ve Temmuz 2026 teklisi 'Tuzak'ta dansıyla öne çıkar.",
            avatarBgColor = "#0284C7",
            groupIconEmoji = "🌟",
            avatarStyleSeed = "asli_goztasi"
        ),
        TPopMember(
            id = "aura_suzy",
            name = "Suzy Roumenov",
            group = "Aura",
            gender = "Kadın",
            roles = listOf("Baş Vokalist"),
            birthYear = 2001,
            age = 25,
            debutYear = 2026,
            zodiac = "Kova",
            iconicTrait = "Baş Vokalist (Lead Vocal) • 'PES', '2036'",
            clueQuote = "PES etmeyen 2036 fütüristik vokal melodisi!",
            funFact = "Aura grubunun Baş Vokalistidir (Lead Vocal). Ağustos 2026 teklisi 'PES' ve Ekim 2026 teklisi '2036'da melodik vokalleri üstlenmiştir.",
            avatarBgColor = "#0369A1",
            groupIconEmoji = "🌟",
            avatarStyleSeed = "suzy"
        ),
        TPopMember(
            id = "aura_meri",
            name = "Meri Aslan",
            group = "Aura",
            gender = "Kadın",
            roles = listOf("Ana Vokalist"),
            birthYear = 2000,
            age = 26,
            debutYear = 2026,
            zodiac = "Aslan",
            iconicTrait = "Ana Vokalist (Main Vocal) • 'We Are Aura!', 'ELEMENTAL Albümü'",
            clueQuote = "We Are Aura! ELEMENTAL albümünün doruk noktası!",
            funFact = "Aura grubunun Ana Vokalistidir (Main Vocal). 23 Ekim 2026'da yayımlanan ilk albümleri ELEMENTAL'daki 'We Are Aura!' ve 'AURA' şarkılarının ana sesidir.",
            avatarBgColor = "#0D9488",
            groupIconEmoji = "🌟",
            avatarStyleSeed = "meri"
        ),
        TPopMember(
            id = "aura_esra",
            name = "Esra Mutlu",
            group = "Aura",
            gender = "Kadın",
            roles = listOf("Ana Dansçı"),
            birthYear = 2003,
            age = 23,
            debutYear = 2026,
            zodiac = "Boğa",
            iconicTrait = "Ana Dansçı (Main Dancer) • 'Masum Kedi', 'Tempo'",
            clueQuote = "Masum Kedi gibi zarif, yüksek Tempo ile sahnede!",
            funFact = "Aura grubunun Ana Dansçısıdır (Main Dancer). ELEMENTAL albümündeki 'Masum Kedi' ve 'Tempo' parçalarında ana koreografileri icra eder.",
            avatarBgColor = "#0F766E",
            groupIconEmoji = "🌟",
            avatarStyleSeed = "esra_mutlu"
        ),

        // ==========================================
        // 5. MANTRA (T-Pop Kız Grubu)
        // Çıkış: 2026-05-15 (Bi Kiss) • Albüm: New Era
        // ==========================================
        TPopMember(
            id = "mantra_delfin",
            name = "Delfin Kayra Uraz",
            group = "Mantra",
            gender = "Kadın",
            roles = listOf("Baş Vokalist"),
            birthYear = 2002,
            age = 24,
            debutYear = 2026,
            zodiac = "İkizler",
            iconicTrait = "Baş Vokalist (Lead Vocal) • 'Bi Kiss', 'New Era Albümü'",
            clueQuote = "Bi Kiss gönderdim sahneden, New Era başladı!",
            funFact = "Mantra grubunun Baş Vokalistidir (Lead Vocal). Grubun 15 Mayıs 2026 çıkış teklisi 'Bi Kiss' ve 10 Temmuz 2026 tarihli 'New Era' albümünde yer alır.",
            avatarBgColor = "#D97706",
            groupIconEmoji = "🪷",
            avatarStyleSeed = "delfin"
        ),
        TPopMember(
            id = "mantra_sila",
            name = "Sıla Nisa Bozkurt",
            group = "Mantra",
            gender = "Kadın",
            roles = listOf("Baş Dansçı"),
            birthYear = 2003,
            age = 23,
            debutYear = 2026,
            zodiac = "Koç",
            iconicTrait = "Baş Dansçı (Lead Dancer) • 'Toysun', 'Goygoy'",
            clueQuote = "Toysun daha sen, sahnede goygoy yok ciddiyet var!",
            funFact = "Mantra grubunun Baş Dansçısıdır (Lead Dancer). New Era albümündeki 'Toysun' ve 'Goygoy' parçalarındaki hareketli danslarıyla tanınır.",
            avatarBgColor = "#B45309",
            groupIconEmoji = "🪷",
            avatarStyleSeed = "sila_nisa"
        ),
        TPopMember(
            id = "mantra_guniz",
            name = "Güniz Ok",
            group = "Mantra",
            gender = "Kadın",
            roles = listOf("Ana Dansçı"),
            birthYear = 2001,
            age = 25,
            debutYear = 2026,
            zodiac = "Akrep",
            iconicTrait = "Ana Dansçı (Main Dancer) • 'Tuttu Fırlattı', 'Red Flag'",
            clueQuote = "Tuttu Fırlattı kalbimi, Red Flag çaldı sahnede!",
            funFact = "Mantra grubunun Ana Dansçısıdır (Main Dancer). New Era albümündeki 'Tuttu Fırlattı' ve 'Red Flag' şarkılarının ana koreografisini yönetir.",
            avatarBgColor = "#92400E",
            groupIconEmoji = "🪷",
            avatarStyleSeed = "guniz"
        ),
        TPopMember(
            id = "mantra_doga",
            name = "Doğa Bezek",
            group = "Mantra",
            gender = "Kadın",
            roles = listOf("Ana Vokalist"),
            birthYear = 2000,
            age = 26,
            debutYear = 2026,
            zodiac = "Oğlak",
            iconicTrait = "Ana Vokalist (Main Vocal) • 'Tek Başıma', 'Bi Kiss'",
            clueQuote = "Tek Başıma kalsam bile sesim tüm salonu doldurur!",
            funFact = "Mantra grubunun Ana Vokalistidir (Main Vocal). 'Tek Başıma' ve 'Kaldım Ellerinde' parçalarında güçlü tizleriyle grubu taşır.",
            avatarBgColor = "#78350F",
            groupIconEmoji = "🪷",
            avatarStyleSeed = "doga"
        ),
        TPopMember(
            id = "mantra_seyma",
            name = "Şeyma Akso",
            group = "Mantra",
            gender = "Kadın",
            roles = listOf("Ana Rapçi"),
            birthYear = 2004,
            age = 22,
            debutYear = 2026,
            zodiac = "Terazi",
            iconicTrait = "Ana Rapçi (Main Rapper) • 'Kaldım Ellerinde', 'Toysun'",
            clueQuote = "Kaldım ellerinde ama flowlarım özgür!",
            funFact = "Mantra grubunun Ana Rapçisidir (Main Rapper). New Era albümündeki hızlı rap partisyonlarının yazımına ve icrasına imza atmıştır.",
            avatarBgColor = "#CA8A04",
            groupIconEmoji = "🪷",
            avatarStyleSeed = "seyma"
        ),

        // ==========================================
        // 6. RADİKAL (T-Pop Erkek Grubu)
        // Çıkış: 2026-06-19 (Hayran)
        // ==========================================
        TPopMember(
            id = "radikal_vedat",
            name = "Vedat Çelik",
            group = "Radikal",
            gender = "Erkek",
            roles = listOf("Ana Vokalist"),
            birthYear = 2000,
            age = 26,
            debutYear = 2026,
            zodiac = "Koç",
            iconicTrait = "Ana Vokalist (Main Vocal) • 'Hayran', 'Korkmam Ben'",
            clueQuote = "Hayran bırakan ses tonu, korkmam ben bu yolda!",
            funFact = "Radikal grubunun Ana Vokalistidir (Main Vocal). 19 Haziran 2026 tarihli çıkış teklisi 'Hayran' ve Ekim 2026 teklisi 'Korkmam Ben'de ana vokalleri söyler.",
            avatarBgColor = "#BE123C",
            groupIconEmoji = "🔥",
            avatarStyleSeed = "vedat"
        ),
        TPopMember(
            id = "radikal_yusa",
            name = "Yuşa Akbıyık",
            group = "Radikal",
            gender = "Erkek",
            roles = listOf("Baş Dansçı"),
            birthYear = 2002,
            age = 24,
            debutYear = 2026,
            zodiac = "Başak",
            iconicTrait = "Baş Dansçı (Lead Dancer) • 'Hayran', 'Yalancı'",
            clueQuote = "Yalancı sözlere inat gerçek ve keskin adımlar!",
            funFact = "Radikal grubunun Baş Dansçısıdır (Lead Dancer). Radikal'in koreografilerinde senkronize liderlik sergiler.",
            avatarBgColor = "#9F1239",
            groupIconEmoji = "🔥",
            avatarStyleSeed = "yusa"
        ),
        TPopMember(
            id = "radikal_yusuf",
            name = "Yusuf Emre Akbıyık",
            group = "Radikal",
            gender = "Erkek",
            roles = listOf("Yardımcı Vokalist"),
            birthYear = 2002,
            age = 24,
            debutYear = 2026,
            zodiac = "Başak",
            iconicTrait = "Yardımcı Vokalist (Sub Vocal) • 'Korkmam Ben'",
            clueQuote = "Korkmam Ben teklisinde vokal desteği!",
            funFact = "Radikal grubunun Yardımcı Vokalistidir (Sub Vocal). İkizi Yuşa Akbıyık ile birlikte grupta yer almaktadır.",
            avatarBgColor = "#881337",
            groupIconEmoji = "🔥",
            avatarStyleSeed = "yusuf_emre"
        ),
        TPopMember(
            id = "radikal_ibrahim",
            name = "İbrahim Can Kaya",
            group = "Radikal",
            gender = "Erkek",
            roles = listOf("Ana Dansçı"),
            birthYear = 2001,
            age = 25,
            debutYear = 2026,
            zodiac = "Boğa",
            iconicTrait = "Ana Dansçı (Main Dancer) • 'Hayran'",
            clueQuote = "Hayran şarkısının merkezinde patlayan dans performansı!",
            funFact = "Radikal grubunun Ana Dansçısıdır (Main Dancer). Çıkış klibi 'Hayran'daki akrobatik dans sololarıyla dikkat çekmiştir.",
            avatarBgColor = "#4C0519",
            groupIconEmoji = "🔥",
            avatarStyleSeed = "ibrahim_can"
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

    // ==========================================
    // 42 RESMİ T-POP ŞARKISI VE İKONİK ŞARKI SÖZLERİ
    // ==========================================
    val songs: List<TPopSong> = listOf(
        // 1. MANIFEST (11 Şarkı)
        TPopSong("man_zamansizdik", "Zamansızdık", "Manifest", 2025, "Zamansızdık ilk başta, sandım hep iyi kalıcaz\nYetmiyo' hiçbi' iltifat hissettirmiyosan\nBoşa dökülen yaşlar, artık üzülmem asla", "Manifest'in 2025 çıkış teklisi."),
        TPopSong("man_ruya", "Rüya", "Manifest", 2025, "Rüyasında beni arıyormuş\nGüçlüyüz ve bunu biliyorsun\nSen vazgeçtin bizden\nTek sen kaybettin cidden", "Manifest'in 2025 hiti."),
        TPopSong("man_toz_pembe", "Toz Pembe", "Manifest", 2026, "Bakıyosun niye çok toz pembe hislerle?\nKafayı bozdun sen o düşlerle\nKoz bende, acele etme\nYasak aşkın emin ellerde", "Manifest'in 2026 ritmik dans parçası."),
        TPopSong("man_amator", "Amatör", "Manifest", 2025, "Acemi duygularla başladık aşka\nAmatör bir kalple sevdik güya\nArtık çok daha iyi, amatör hislere elveda!", "Manifest'in 2025 albümünden pop ritimli teklisi."),
        TPopSong("man_basrol_sensin", "Başrol Sensin", "Manifest", 2026, "Bu filmin senaryosu baştan yazıldı\nBaşrol sensin sanıyordun ama perde kapandı\nAlkışlar sustu, ışıklar söndü!", "Manifest'in sinematik konseptli 2026 şarkısı."),
        TPopSong("man_tralala", "TRALALA", "Manifest", 2026, "Tralala dillerde yine aynı melodi\nDinlemem artık senin o eski hikayeni\nDans et ritimle, unut dertleri!", "Manifest'in enerjik festival hiti."),
        TPopSong("man_hileli", "Hileli", "Manifest", 2026, "Oyunun kuralı hileli baştan\nKazananı yok bu sessiz savaştan\nAteşe at bizi, bizim aşkımız zehirli!", "Ajda Pekkan ile iş birliği yapılan ikonik Manifest parçası."),
        TPopSong("man_daha_iyi", "Daha İyi", "Manifest", 2026, "Bensiz daha iyi olduğunu sanıyorsan yanılıyorsun\nHer köşe başında dönüp beni arıyorsun\nYalan söyleme kalbine!", "Manifest'in 2026 duygusal ayrılık parçası."),
        TPopSong("man_snap", "Snap", "Manifest", 2025, "Tek bir snap ile silindi geçmiş\nKim kimi daha çok derinden sevmiş\nBak bakalım kim kimi geride itmiş!", "Manifest'in hızlı tempolu 2025 şarkısı."),
        TPopSong("man_ariyo", "Arıyo", "Manifest", 2025, "Gecenin köründe yine numaramı arıyo\nAçmıyorum diye içi içini yanıyo\nCevap yok sana artık nafile!", "Manifest'in telefon melodisi sample'lı parçası."),
        TPopSong("man_kts", "KTS", "Manifest", 2025, "KTS çalar yine ritimler hızlanır\nSahneye çıktık mı gözler kamaşır\nBizi durduramaz hiçbir sınır!", "Manifest'in sahne koreografi marşı."),

        // 2. CRUSH (2 Şarkı)
        TPopSong("cru_crush", "CRUSH!", "Crush", 2026, "Gülümsemek ister misin?\nYoksa durup izler misin?\nBildiklerim çok değil ama\nSenin gibileri bilmez miyim?\nDene hadi ama bizden olmaz!", "7 erkek üyeli Crush grubunun çıkış parçası."),
        TPopSong("cru_benim_olsana", "Benim Olsana", "Crush", 2026, "Geceden sabaha uyumuşum düşlerimde seni beklerken\nDöndüm arkama kokun kalmış üzerimde onu koklarken\nNeden acaba? Artık benim ol ya da kimselerin olma\nBenim olsana!", "Crush grubunun romantik hit parçası."),

        // 3. KARMA / KARM6 (8 Şarkı)
        TPopSong("kar_keske_benim_olsa", "Keşke Benim Olsa", "Karma", 2026, "Derdim var geceler uzar da uzar\nSaymadım bi' gece kaç ömür yutar\nZor da mecalim, en güçlü ihtimalim\nHep yanımda kalsa, keşke benim olsa!", "KARM6'nın serotonin dolu hit parçası."),
        TPopSong("kar_sirra_kadem", "Sırra Kadem", "Karma", 2026, "Bir anda sırra kadem\nMuhtemelen vazgeçtin benden dinlemeden\nÇekip vurdun kalbimden\nYüreğim acıyor inkar edemem", "Karma grubunun duygusal T-Pop balladı."),
        TPopSong("kar_crop_top", "Crop Top", "Karma", 2026, "Crop top üstümde, ritim kalbimde\nDönüp bakarlar her adımımda geriye\nIşıklar altında sahne bizimle!", "Karma grubunun yaz konseptli yüksek tempolu parçası."),
        TPopSong("kar_onumuz_yaz", "Önümüz Yaz", "Karma", 2026, "Hadi topla bavulu önümüz yaz\nGüneş tenimizde dertleri biraz arkada bırak\nDalgalar eşlik etsin dansımıza!", "Karma grubunun enerjik yaz hiti."),
        TPopSong("kar_blok_blok", "Blok Blok", "Karma", 2026, "Blok blok ördün duvarları aramıza\nŞimdi geçemezsin o kapıdan asla\nTelefonu sessize aldım, arama boşuna!", "Karma grubunun trap-pop beat'li parçası."),
        TPopSong("kar_ihtimal", "İhtimal", "Karma", 2026, "En zayıf ihtimal bile tutar bazen\nSen vazgeçtin ama ben gitmedim ruhen\nKalbim atar yine aynı heyecanla!", "Karma grubunun vokal uyumuyla öne çıkan parçası."),
        TPopSong("kar_ta_burama", "Ta Burama", "Karma", 2026, "Ta burama kadar geldi artık yetti\nSabrımın sınırları çoktan tükendi\nNe halin varsa gör hadi yoluna git!", "Karma grubunun isyankar şarkısı."),
        TPopSong("kar_karma", "KARMA", "Karma", 2026, "Karmadır adı döner dolaşır bulur\nYaptığın her kötülük önüne dikilip durur\nKaçamazsın kendinden asla!", "Karma grubunun kendi adını taşıyan marşı."),

        // 4. AURA (12 Şarkı)
        TPopSong("aur_yuh", "YUH!", "Aura", 2026, "Yuhh! Sana gönülden inanana\nYuhh! Bir sözüne bel bağlayana\nYuhh! Hevesine kapılana\nYuh ki ne yuhh! Yuh ki ne yuhh!\nKızlarım sahnede beni bekler!", "4 kadın üyeli Aura grubunun viral çıkış şarkısı."),
        TPopSong("aur_pes", "PES", "Aura", 2026, "Bu kadarına pes! Bitti son heves\nBağıra çağıra kalmadı nefes!\nYalana dolana alışkın olana!\nRüzgarınla deli deli es!\nI don't wanna dude anymore stress!", "Aura'nın toksik ilişkilere meydan okuyan 'PES' hiti."),
        TPopSong("aur_tuzak", "Tuzak", "Aura", 2026, "Gözlerin en tatlı tuzak\nBenden kilometrelerce uzak\nDüşerim sanma sakın ağına\nKendi yoluma giderim baka baka!", "Aura grubunun elektro-pop tarzındaki parçası."),
        TPopSong("aur_2036", "2036", "Aura", 2026, "Zamanın ötesindeyiz 2036\nBizim devrimiz başladı ışıklar yansın\nGelecek avucumuzun içinde parıldasın!", "Aura'nın fütüristik T-Pop konseptli parçası."),
        TPopSong("aur_we_are_aura", "We Are Aura!", "Aura", 2026, "Kızlarım sahnede beni bekler\nWe are Aura! Gücümüzü görecekler\nIşık saçıyoruz her adımda teker teker!", "Aura'nın sahne intro marşı."),
        TPopSong("aur_masum_kedi", "Masum Kedi", "Aura", 2026, "Görünüşe aldanma öyle masum kedi gibi\nTırnaklarını çıkarır bir anda kaplan gibi\nOyuncak sanma kalbimi!", "Aura'nın tatlı ve sert vokal geçişli şarkısı."),
        TPopSong("aur_tempo", "Tempo", "Aura", 2026, "Tempoyu arttır, durmak yok bu gece\nRitim kalbimize işlesin hece hece\nDans pistinde kuralları biz koyarız!", "Aura'nın kulüp ve dans hiti."),
        TPopSong("aur_aura", "AURA", "Aura", 2026, "Parlayan ışığımız kapatır gölgeleri\nİşte bu AURA, aşar tüm engelleri\nBakışlarımız büyüler herkesi!", "Aura grubunun imza şarkısı."),
        TPopSong("aur_red_flag_aura", "Red Flag!", "Aura", 2026, "Her hareketin açıkça bir red flag\nUyarmıştı herkes beni tek tek\nKaçıyorum arkama bile bakmadan!", "Aura grubunun modern flört şarkısı."),
        TPopSong("aur_iltifatlar", "İltifatlar", "Aura", 2026, "Dökülür dilinden boş iltifatlar\nArkasında gizli sahte niyetler var\nKanmam artık güzel sözlerine!", "Aura grubunun güçlü vokal melodisi."),
        TPopSong("aur_derbeder", "Derbeder", "Aura", 2026, "Derbeder ettin arkana bakmadan\nGeçer bu günler yüreğim yanmadan\nGözyaşlarımı sildim çoktan!", "Aura'nın dramatik pop parçası."),
        TPopSong("aur_parcali_bulutlu", "Parçalı Bulutlu", "Aura", 2026, "Ruh halim bugün parçalı bulutlu\nGittiğinden beri bu kalp seni unuttu\nGüneş açar yine elbet yarın!", "Aura'nın melodik orta tempolu şarkısı."),

        // 5. MANTRA (7 Şarkı)
        TPopSong("man_bi_kiss", "Bi Kiss", "Mantra", 2026, "Hadi bi' kiss, bi' kiss\nYolun sonu belli, içimde bi' his\nDökülür o dudaklarından zehir\nYanıyorum, kalmadı akıl fikir\nTek istediğim gelsin bi' kiss, bi' kiss!", "Mantra'nın dillerden düşmeyen pop hiti."),
        TPopSong("man_toysun", "Toysun", "Mantra", 2026, "Hoş, ambalajın paketin\nFazla çaban var nedir derdin\nHenüz toysun, daha pişeceksin\nBebeğim düşe kalka öğreneceksin!", "Mantra'nın havalı pop nakaratı."),
        TPopSong("man_tuttu_firlatti", "Tuttu Fırlattı", "Mantra", 2026, "Aşkı çabuk söndü\nBeni pabucunun ucuyla eze eze geçti ve gitti...\nTuttu fırlattı kalbimi\nEzdi, üstünü çiğnedi\n'Zamanla geçer', dedi!", "Mantra'nın enerjik şarkısı."),
        TPopSong("man_goygoy", "Goygoy", "Mantra", 2026, "Goygoy yapma bana ciddi konuş biraz\nAşk bu oyun değil geçer kış ve yaz\nCesaretin varsa çık karşıma!", "Mantra'nın eğlenceli şarkısı."),
        TPopSong("man_red_flag_man", "Red Flag", "Mantra", 2026, "Göz göre göre yürüdüm tehlikeye\nBütün işaretler red flag diye diye\nKendimi kurtardım son anda!", "Mantra'nın dinamik tempo ve bas yüklü parçası."),
        TPopSong("man_tek_basima", "Tek Başıma", "Mantra", 2026, "Tek başıma da gülerim kaderime\nİhtiyacım yok senin o sahte sevgine\nKendi ışığımla aydınlatırım geceyi!", "Mantra'nın özgüven marşı."),
        TPopSong("man_kaldim_ellerinde", "Kaldım Ellerinde", "Mantra", 2026, "Kaldım ellerinde bir yaprak gibi\nSavurma beni sonbahar yeli gibi\nTut elimden bırakma!", "Mantra'nın duygusal baladı."),

        // 6. RADİKAL (2 Şarkı)
        TPopSong("rad_hayran", "Hayran", "Radikal", 2026, "Kalbim kapalı, bana dokunma daha\nDedim sana bi' değil iki defa\nHayran, hiç boşuna çabalama\nOlmam Mecnun'un, Leyla'm!\nSana benden olmaz bi' hayran!", "Radikal grubunun maskülen vokal hiti."),
        TPopSong("rad_korkmam_ben", "Korkmam Ben", "Radikal", 2026, "Geceleri hep unuturum\nTıpış tıpış geldim ayağına\nKorkmam ben senin yalanlarından\nİşlemez anılarıma\nYalancılar giremez rüyalarıma!", "Radikal grubunun güçlü nakaratlı parçası.")
    )

    fun getRandomSong(): TPopSong = songs.random()

    fun findSong(nameOrId: String): TPopSong? {
        val clean = nameOrId.trim()
        return songs.find { it.id.equals(clean, true) || it.title.equals(clean, true) }
    }
}
