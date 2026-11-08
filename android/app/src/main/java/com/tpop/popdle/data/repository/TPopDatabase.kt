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
            avatarStyleSeed = "esin",
            photoUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTfsrAAnUFEBJfhzsbNj6Mqc5vJhf6ApggdxP5LDv-BIoZgTv3usjhZReUW&s=10",
            searchUrl = "https://www.google.com/search?tbm=isch&q=Manifest%20Esin%20Bahat"
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
            avatarStyleSeed = "hilal",
            photoUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS9iq6frer9g29Iq8Qc7eYejlpBcvYutbA1_6C7qTYFrNCf1kS9EOwl6Ot3&s=10",
            searchUrl = "https://www.google.com/search?tbm=isch&q=Manifest%20Hilal%20Yelek%C3%A7i"
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
            avatarStyleSeed = "lidya",
            photoUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT1kH6m_IwsXVBSQK0uxk5KeE_sLCE-AnAiANAyClDGc3p7ggLJISrEI5iK&s=10",
            searchUrl = "https://www.google.com/search?tbm=isch&q=Manifest%20Lidya%20P%C4%B1nar"
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
            avatarStyleSeed = "mina",
            photoUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS4cI297iGgfqLvZOuAu0E4fbY_LKhMNc0EdD-LGmxtPJ_HhkAB1NspSt2-&s=10",
            searchUrl = "https://www.google.com/search?tbm=isch&q=Manifest%20Mina%20Solak"
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
            avatarStyleSeed = "sueda",
            photoUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQFl0W1d3W7bDtIdhJw7hZT_klB2HUJPDqEU_AJjLOityghT3iu-biTzjvh&s=10",
            searchUrl = "https://www.google.com/search?tbm=isch&q=Manifest%20Sueda%20Uluca"
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
            avatarStyleSeed = "zeynep",
            photoUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSA7PYtghEP8shejqLEfxFLeYTvHSuSw6a5-WMuLbvOZ250yWewye-XWV2c&s=10",
            searchUrl = "https://www.google.com/search?tbm=isch&q=Manifest%20Zeynep%20Sude%20Oktay"
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
            avatarStyleSeed = "oguzhan",
            photoUrl = "https://biyografi.co/wp-content/uploads/2026/08/Oguzhan-Cifci-kimdir.webp",
            searchUrl = "https://wearecrushboys.com.tr/"
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
            avatarStyleSeed = "batu",
            photoUrl = "https://pbs.twimg.com/media/HM8tfg2XkAAME84?format=webp&name=large",
            searchUrl = "https://wearecrushboys.com.tr/"
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
            avatarStyleSeed = "baris_cagan",
            photoUrl = "https://images.genius.com/77e85a6617f4dd2f2bd62f6cdff7341c.1000x1000x1.png",
            searchUrl = "https://wearecrushboys.com.tr/"
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
            avatarStyleSeed = "mirac",
            photoUrl = "https://img-s2.onedio.com/id-6a840c68800d697c4e63cc27/rev-0/w-600/h-770/f-jpg/s-1e71d6b444118c503add45cdd008a7f108d8c27e.jpg",
            searchUrl = "https://wearecrushboys.com.tr/"
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
            avatarStyleSeed = "milan",
            photoUrl = "https://img-s1.onedio.com/id-6a8410d74341ce048f727f5b/rev-0/w-600/h-796/f-jpg/s-01db963f1a71d85b528ea30c23d27dfaf21b4cfc.jpg",
            searchUrl = "https://wearecrushboys.com.tr/"
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
            avatarStyleSeed = "arda_soydogan",
            photoUrl = "https://i.tgrthaber.com/images/2026/8/5/crush-arda-soydogan-kimdir-kac-yasinda-crush-uyesi-ardanin-meslegi-3351760_202608051912_2.png",
            searchUrl = "https://wearecrushboys.com.tr/"
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
            avatarStyleSeed = "efe",
            photoUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTgqg4NUaCgih8LFpePXiDyWeVg0O6Xk23Zjf8ce6q4WzgF0NtLIaYUnRp9&s=10",
            searchUrl = "https://wearecrushboys.com.tr/"
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
            avatarStyleSeed = "cem_suha",
            photoUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRsCjglvLwVR70U92CZwFsjpmN47tYlZQygWOJjDmB7Z-B71ESgZVeOvPeg&s=10",
            searchUrl = "https://www.google.com/search?tbm=isch&q=Karma%20%28KARM6%29%20Cem%20Suha%20Kurt"
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
            avatarStyleSeed = "ezgi",
            photoUrl = "https://pbs.twimg.com/media/HSQkPkAXYAAbmmu?format=webp&name=large",
            searchUrl = "https://www.google.com/search?tbm=isch&q=Karma%20%28KARM6%29%20Ezgi%20Akliman"
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
            avatarStyleSeed = "ozlem_naz",
            photoUrl = "https://images.genius.com/d224cf5ff13b727591f4763cf41d264f.1000x1000x1.png",
            searchUrl = "https://www.google.com/search?tbm=isch&q=Karma%20%28KARM6%29%20%C3%96zlem%20Naz%20G%C3%B6zc%C3%BC"
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
            avatarStyleSeed = "adilcan",
            photoUrl = "https://i.pinimg.com/474x/db/55/28/db552879d5e2aa63f837dfd2a652377d.jpg",
            searchUrl = "https://www.google.com/search?tbm=isch&q=Karma%20%28KARM6%29%20Adilcan%20Bilgin"
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
            avatarStyleSeed = "erdeniz",
            photoUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRZMN4mTgwKBaMp3OEP46okKlCAVIhpCWxy3-C9hzi_c4IeNN_Sq_ZBFFs&s=10",
            searchUrl = "https://www.google.com/search?tbm=isch&q=Karma%20%28KARM6%29%20Erdeniz%20Telli"
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
            avatarStyleSeed = "ada_atilgan",
            photoUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQKhZ3E9mb3GZKQIfi74wyTs1PWf_eHzF2plvwRT_33glSLlD_1ud7pGBFj&s=10",
            searchUrl = "https://www.google.com/search?tbm=isch&q=Karma%20%28KARM6%29%20Ada%20At%C4%B1lgan"
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
            avatarStyleSeed = "asli_goztasi",
            photoUrl = "https://www.oncasey.com/wp-content/uploads/2026/07/hangi-aura-kizisin-test-asli.jpg",
            searchUrl = "https://www.google.com/search?tbm=isch&q=Aura%20Asl%C4%B1%20G%C3%B6zta%C5%9F%C4%B1"
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
            avatarStyleSeed = "suzy",
            photoUrl = "https://img-s1.onedio.com/id-6a0720ca64814839bedbba0a/rev-0/w-600/h-899/f-jpg/s-b40256c91a74c540680cd1568316eef44b8c7192.jpg",
            searchUrl = "https://www.google.com/search?tbm=isch&q=Aura%20Suzy%20Roumenov"
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
            avatarStyleSeed = "meri",
            photoUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRJ8uld8ZeSqupxscokEInS9H-pLJ-PeJ7AraTuB2hDrYtprzgvTVnaiyU&s=10",
            searchUrl = "https://www.google.com/search?tbm=isch&q=Aura%20Meri%20Aslan"
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
            avatarStyleSeed = "esra_mutlu",
            photoUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQJlhD3fY451m6BRTexvJ0_lUPCUWuaEvemfqxApUbJ5wQJN3grMjT31V0A&s=10",
            searchUrl = "https://www.google.com/search?tbm=isch&q=Aura%20Esra%20Mutlu"
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
            avatarStyleSeed = "delfin",
            photoUrl = "https://trpop.com/wp-content/uploads/2026/07/mantra-delfin-kayra-uraz.jpg.webp",
            searchUrl = "https://www.google.com/search?tbm=isch&q=Mantra%20Delfin%20Kayra%20Uraz"
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
            avatarStyleSeed = "sila_nisa",
            photoUrl = "https://trpop.com/wp-content/uploads/2026/07/mantra-sila-nisa-bozkurt.jpg",
            searchUrl = "https://www.google.com/search?tbm=isch&q=Mantra%20S%C4%B1la%20Nisa%20Bozkurt"
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
            avatarStyleSeed = "guniz",
            photoUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTSS1T20rruslZSYuRzGZq-rTZBM_yQvIBTaREgTcQtHCWi4kRPbzJbynuZ&s=10",
            searchUrl = "https://www.google.com/search?tbm=isch&q=Mantra%20G%C3%BCniz%20Ok"
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
            avatarStyleSeed = "doga",
            photoUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTguyJdKXkwW6XQaEUifWexhep8BFO4iXXzf4BMaXMnUKPCzOSmSwoS5vs&s=10",
            searchUrl = "https://www.google.com/search?tbm=isch&q=Mantra%20Do%C4%9Fa%20Bezek"
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
            avatarStyleSeed = "seyma",
            photoUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR9xBBA3hEpS96ddH8YTAc069p9bWhVyOTfD1R8Yevt5iKWs_ZccUQxDhji&s=10",
            searchUrl = "https://www.google.com/search?tbm=isch&q=Mantra%20%C5%9Eeyma%20Akso"
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
            avatarStyleSeed = "vedat",
            photoUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTHl6_ZjQxgvMWdObaZQGmbumgy0G7MTCQDsjO8fGcMgm3P7ko50ML5TAO5&s=10",
            searchUrl = "https://www.google.com/search?tbm=isch&q=Radikal%20Vedat%20%C3%87elik"
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
            avatarStyleSeed = "yusa",
            photoUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTw2wBu3KypGaozVKeGIbWHEwIxJgHiYdgnW3j9ZM2ojcyZF1r2ckVmHhCS&s=10",
            searchUrl = "https://www.google.com/search?tbm=isch&q=Radikal%20Yu%C5%9Fa%20Akb%C4%B1y%C4%B1k"
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
            avatarStyleSeed = "yusuf_emre",
            photoUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQZtvJuCqErwyRXQE2Bx4_r9BkOnYvF0r74K0Fy-1q7hD7360KoOfq7ngU&s=10",
            searchUrl = "https://www.google.com/search?tbm=isch&q=Radikal%20Yusuf%20Emre%20Akb%C4%B1y%C4%B1k"
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
            avatarStyleSeed = "ibrahim_can",
            photoUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS7BXYvBBxX541f9GQTprjuRttpHwaQrPxQZzSFJ9ie4Ro4EEnlFDTg4uUZ&s=10",
            searchUrl = "https://www.google.com/search?tbm=isch&q=Radikal%20%C4%B0brahim%20Can%20Kaya"
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
        TPopSong("man_zamansizdik", "Zamansızdık", "Manifest", 2025, "Zamansızdık ilk başta, sandım hep iyi kalıcaz
Yetmiyo' hiçbi' iltifat hissettirmiyosan", "Manifest'in 2025 çıkış teklisi, duygusal ve akılda kalıcı pop marşı.", "https://genius.com/Manifest-zamanszdk-lyrics"),
        TPopSong("man_ariyo", "Arıyo", "Manifest", 2024, "Alışır kalbim sensiz yazlara, seni istemeye artık son verdim
Tenimi geceleri arıyo', olmuyo' aşkı bensiz arıyo'", "Manifest'in telefon melodisi temalı 2024 çıkış şarkısı.", "https://genius.com/Manifest-aryo-lyrics"),
        TPopSong("man_kts", "KTS", "Manifest", 2024, "İstese aşkına köle olurum, tek sözüne kendimi avuturum
Aşkın yaktı beni ya, söndürsene o zaman; kalbimin tek sahibi", "Manifest'in 'Kalbimin Tek Sahibi' temalı yüksek ritimli koreografi şarkısı.", "https://genius.com/Manifest-kts-lyrics"),
        TPopSong("man_snap", "Snap", "Manifest", 2025, "Sana alkış yok, anca finger snap, no thanks
Geleceğinden parlak lipstick sürdüm, sıfır gramsın yok kalsın", "Manifest'in 'finger snap' nakaratlı enerjik dans parçası.", "https://genius.com/Manifest-snap-lyrics"),
        TPopSong("man_ruya", "Rüya", "Manifest", 2025, "Rüyasında beni arıyormuş, güçlüyüz ve bunu biliyorsun
Sen vazgeçtin bizden, tek sen kaybettin cidden", "Manifest'in 'Tek sen kaybettin cidden' nakaratlı 2025 hiti.", "https://genius.com/Manifest-ruya-lyrics"),
        TPopSong("man_amator", "Amatör", "Manifest", 2025, "Sanıyo' ki herkes ona hayran, aynada kendine hodri meydan
Hep aynı şov hep aynı dans, ama ama amatör", "Manifest'in 'Sanıyo ki herkes ona hayran' nakaratlı pop ritimli şarkısı.", "https://genius.com/Manifest-amator-lyrics"),
        TPopSong("man_basrol_sensin", "Başrol Sensin", "Manifest", 2026, "Bi' hayalle geldik biz bu günlere, artık korkmak kaçmak yok bundan böyle
Bizimle gel sen de kır zincirleri, fark edersin başrol sensin bu filmde", "Manifest'in 1. yıl dönümü için yayınladığı özel marş.", "https://genius.com/Manifest-basrol-sensin-1-yl-ozel-lyrics"),
        TPopSong("man_daha_iyi", "Daha İyi", "Manifest", 2026, "Yalnız kalmadım işte, gör'ce'n sen bu gidişle
Sensiz daha iyi, sensiz bensiz daha iyi", "Manifest'in 'Sensiz daha iyi' temalı 2026 parçası.", "https://genius.com/Manifest-daha-iyi-lyrics"),
        TPopSong("man_hileli", "Hileli", "Manifest", 2026, "Senden kaçamadım, iyi ki bırakmadın peşimi
Sabaha kadar oyna at zarları hileli", "Manifest'in süperstar Ajda Pekkan ile ortak düeti.", "https://genius.com/Manifest-and-ajda-pekkan-hileli-lyrics"),
        TPopSong("man_toz_pembe", "Toz Pembe", "Manifest", 2026, "Bakıyo'sun niye çok toz pembe hislerle?
Kafayı bozdun sen o düşlerle, koz bende", "Manifest'in 'Toz pembe hislerle' temalı dans parçası.", "https://genius.com/Manifest-toz-pembe-lyrics"),
        TPopSong("man_tralala", "TRALALA", "Manifest", 2026, "Can't get your eyes off my, um, tra-la-la
Look like an angel, God bless, mashallah, mm-mm", "Manifest'in global tarzda İngilizce festival hiti.", "https://genius.com/Manifest-tralala-lyrics"),
        TPopSong("cru_crush", "CRUSH!", "Crush", 2026, "Gülümsemek ister misin? Yoksa durup izler misin?
Bildiklerim çok değil ama senin gibileri bilmez miyim?", "7 erkek üyeli Crush grubunun çıkış parçası.", "https://genius.com/Crush-tur-crush-lyrics"),
        TPopSong("cru_benim_olsana", "Benim Olsana", "Crush", 2026, "Geceden sabaha uyumuşum düşlerimde seni beklerken
Döndüm arkama kokun kalmış üzerimde onu koklarken", "Crush grubunun romantik hit teklisi.", "https://genius.com/Crush-tur-benim-olsana-lyrics"),
        TPopSong("kar_keske_benim_olsa", "Keşke Benim Olsa", "Karma", 2026, "Derdim var, geceler uzar da uzar; saymadım bi' gece kaç ömür yutar
Kana kana içsem, inadına sevsem; tadı damağımda, keşke benim olsa", "KARM6'nın serotonin dolu, co-ed hit parçası.", "https://genius.com/Karm6-keske-benim-olsa-lyrics"),
        TPopSong("kar_sirra_kadem", "Sırra Kadem", "Karma", 2026, "Bir anda sırra kadem, muhtemelen vazgeçtin benden dinlemeden
Çekip vurdun kalbimden, yüreğim acıyor inkar edemem", "Karma grubunun duygusal T-Pop balladı.", "https://genius.com/Karm6-srra-kadem-lyrics"),
        TPopSong("kar_crop_top", "Crop Top", "Karma", 2026, "Çek üstüne bi crop top, anında yıkılır TikTok
Hep mi hoş hep mi gol, tek bi doz yetmiyor", "Karma grubunun yaz temalı yüksek tempolu hit parçası.", "https://genius.com/Karm6-crop-top-lyrics"),
        TPopSong("kar_onumuz_yaz", "Önümüz Yaz", "Karma", 2026, "Düşür beni önüne, ben olmuşum sarhoş
Güz çiçeği dövmemi de soldurur güneş, zamanımız az bak önümüz yaz", "Karma grubunun Simge Sağın cover'ı olan yaz şarkısı.", "https://genius.com/Simge-onumuz-yaz-lyrics"),
        TPopSong("kar_blok_blok", "Blok Blok", "Karma", 2026, "Blok, blok, blok aklımdan fikrimden
Blok, blok, blok söktüm seni kalbimden", "Karma grubunun 'Blok Blok' nakaratlı trap-pop parçası.", "https://genius.com/Karm6-blok-blok-lyrics"),
        TPopSong("kar_ihtimal", "İhtimal", "Karma", 2026, "Denedim bütün ihtimalleri, değiştin bende normalleri
Karışık sensiz ruh hallerim, bu kuytudan hadi gel çıkar beni", "Karma grubunun vokal uyumuyla öne çıkan 'Serotonin' albüm teklisi.", "https://genius.com/Karm6-ihtimal-lyrics"),
        TPopSong("kar_ta_burama", "Ta Burama", "Karma", 2026, "Ta burama geldi katlandım, sussun diye sıradansın
Cilven kime? Ta burama geldi", "Karma ve Serdar Ortaç iş birliği olan hareketli şarkı.", "https://genius.com/Karm6-and-serdar-ortac-ta-burama-lyrics"),
        TPopSong("kar_karma", "KARMA", "Karma", 2026, "Karanlık ruhunu yorsa, kaygıların bi' gün ipleri alsa
Güneşten umutsuz olma, kalbini yorma, bulur seni karma", "Karma grubunun kendi ismini taşıyan motivasyonel marşı.", "https://genius.com/Karm6-karma-lyrics"),
        TPopSong("kar_iki_yuzlu", "İki Yüzlü", "Karma", 2026, "Ruma-ruma-rumama kanmam bu yalanlara, masken düştü sonunda
Ama sen gel yine bul beni bul, iki yüzlü olamam senin gibi", "Karma grubunun maskeleri düşüren enerjik parçası.", "https://genius.com/Karm6-iki-yuzlu-lyrics"),
        TPopSong("aur_yuh", "YUH!", "Aura", 2026, "Yuh sana gönülden inanana, yuh bi' sözüne bel bağlayana
Yuh hevesine kapılana, yuh ki ne yuh, yuh ki ne yuh", "4 kadın üyeli Aura grubunun viral çıkış şarkısı.", "https://genius.com/Aura-tur-yuh-lyrics"),
        TPopSong("aur_tuzak", "Tuzak", "Aura", 2026, "Korkma, tut sözünü, gitme benden uzağa; yeminlerimi boz, yaz adımı dağ taşa
Değdin bütün başıma, düştüm tuzağına gel kurtarsana", "Aura grubunun elektro-pop tarzındaki 2026 parçası.", "https://genius.com/Aura-tur-tuzak-lyrics"),
        TPopSong("aur_pes", "PES", "Aura", 2026, "Bu kadarına pes, bitti son heves; bağıra çağıra kalmadı nefes!
Yalana dolana alışkın olana rüzgârınla deli deli es!", "Aura'nın toksik ilişkilere meydan okuyan 'PES' hiti.", "https://genius.com/Aura-tur-pes-lyrics"),
        TPopSong("aur_2036", "2036", "Aura", 2026, "Bi' bakmışsın yıl 2036, silindi tüm anılar kalmadı sıkıntı
Derler buna Karma, sen hiç inanmasan da, yaz şimdi günlüğüne ağlaya ağlaya", "Aura'nın fütüristik 'Elemental' albüm parçası.", "https://genius.com/Aura-tur-2036-lyrics"),
        TPopSong("aur_we_are_aura", "We Are Aura!", "Aura", 2026, "Dediler 'Yavaşla', biz bastık hep gaza
A-U-R-A, A-U-R-A, we are AURA", "Aura grubunun intro sahne marşı.", "https://genius.com/Aura-tur-we-are-aura-lyrics"),
        TPopSong("aur_masum_kedi", "Masum Kedi", "Aura", 2026, "Kükrerdim aslan gibi herkese senden önce
Kaybettim kendimi, şimdi bir masum kedi", "Aura'nın tatlı ve sert vokal geçişli şarkısı.", "https://genius.com/Aura-tur-masum-kedi-lyrics"),
        TPopSong("aur_tempo", "Tempo", "Aura", 2026, "Bıkmadan usanmadan, yaş alırken yaşlanmadan
Eğilmeden bükülmeden, tempo tempo tempo tempo", "Aura'nın Sezen Aksu klasiğini yeniden yorumladığı dans hiti.", "https://genius.com/Aura-tur-tempo-lyrics"),
        TPopSong("aur_aura", "AURA", "Aura", 2026, "Bu aura başka, geldi seni yerinden sarsmaya!
Yine all eyes on us! Arttır ses çok az! Döndür şarkımı şimdi loop'ta", "Aura grubunun imza marşı.", "https://genius.com/Aura-tur-aura-lyrics"),
        TPopSong("aur_red_flag_aura", "Red Flag!", "Aura", 2026, "Üzülmem dökme göz yaşlarına, kaldın bak yine mi tek başına
İnanmam red flag tavırlarına!", "Aura grubunun modern flört kültürünü eleştiren şarkısı.", "https://genius.com/Aura-tur-red-flag-lyrics"),
        TPopSong("aur_iltifatlar", "İltifatlar", "Aura", 2026, "Çıkmadı aklımdan iltifatlar, hadi gelsin o zaman itiraflar
Tüm gün konuştum kızlarımla, alındı gerekli tüm onaylar", "Aura grubunun güçlü vokal melodisi.", "https://genius.com/Aura-tur-iltifatlar-lyrics"),
        TPopSong("aur_derbeder", "Derbeder", "Aura", 2026, "Oysa tek derdin bendim aslında, keşkelerle kalıcam hep o aklında!
Yakışmadı hiç sana bu haller, oldun tam bir derbeder", "Aura'nın 'Derbeder' nakaratlı enerjik parçası.", "https://genius.com/Aura-tur-derbeder-lyrics"),
        TPopSong("aur_parcali_bulutlu", "Parçalı Bulutlu", "Aura", 2026, "Buralar parçalı bulutlu, kaybetmedik hiç umudu
Gerekirse bin kere daha denerim ama gitmem yaşamadan bu gururu!", "Aura grubunun motivasyonel pop balladı.", "https://genius.com/Aura-tur-parcal-bulutlu-lyrics"),
        TPopSong("man_bi_kiss", "Bi Kiss", "Mantra", 2026, "Hadi bi' kiss, bi' kiss, yolun sonu belli içimde bi' his
Dökülür o dudaklarından zehir, yanıyorum kalmadı akıl fikir", "Mantra grubunun baştan çıkarıcı dans hiti.", "https://genius.com/Mantra-bi-kiss-lyrics"),
        TPopSong("man_toysun", "Toysun", "Mantra", 2026, "Henüz toysun, daha pişeceksin
Bebeğim düşe kalka öğreneceksin", "Mantra grubunun 'Daha pişeceksin' nakaratlı enerjik parçası.", "https://genius.com/Mantra-toysun-lyrics"),
        TPopSong("man_goygoy", "Goygoy", "Mantra", 2026, "Hava cıva goygoy goygoy, lafa söze kalsak işimiz çok zor
Nasıl bi muhabbet gel de sabret, görüntü var ses yok", "Mantra grubunun 'Goygoy' ritimli pop-rap şarkısı.", "https://genius.com/Mantra-goy-goy-lyrics"),
        TPopSong("man_tuttu_firlatti", "Tuttu Fırlattı", "Mantra", 2026, "Tuttu fırlattı kalbimi, ezdi üstünü çiğnedi
Zamanla geçer dedi, zamanla zamanla", "Mantra'nın Gökçe'nin efsanevi şarkısına getirdiği modern yorum.", "https://genius.com/Gokce-tuttu-frlatt-lyrics"),
        TPopSong("man_red_flag_mantra", "Red Flag", "Mantra", 2026, "Red flag net hem de Ultra Pro Max
Belli değil sağı solu hem de sırf kompleks, yok almayım ben canım no thanks", "Mantra grubunun 'Ultra Pro Max' sözlü viral parçası.", "https://genius.com/Mantra-red-flag-lyrics"),
        TPopSong("man_tek_basima", "Tek Başıma", "Mantra", 2026, "Tek başıma kurdum yaktım, tek başıma düştüm kalktım
Tek başıma ben başardım yar, o yar", "Mantra grubunun güçlü duruş sergileyen parçası.", "https://genius.com/Mantra-tek-basma-lyrics"),
        TPopSong("man_kaldim_ellerinde", "Kaldım Ellerinde", "Mantra", 2026, "Kaldım ellerinde, vurdun hedefi tam yerinden
Aşk gelince saklanamazsın, yakalar o yaka paça kurtulamazsın", "Mantra'nın 'Ateşimi harla' nakaratlı ritmik şarkısı.", "https://genius.com/Mantra-kaldm-ellerinde-lyrics"),
        TPopSong("rad_hayran", "Hayran", "Radikal", 2026, "Sana benden olmaz bi' hayran, koşmam peşinde darmaduman
Kaçsan da kovalamam, hayran, hiç boşuna çabalama olmam Mecnun'un Leyla'm", "Radikal grubunun iddialı çıkış şarkısı.", "https://genius.com/Radikal-hayran-lyrics"),
        TPopSong("rad_korkmam_ben", "Korkmam Ben", "Radikal", 2026, "Korkmam ben senin yalanlarından, işlemez anılarıma
Yalancılar giremez rüyalarıma", "Radikal grubunun güçlü ve cesur sözlere sahip şarkısı.", "https://genius.com/Radikal-korkmam-ben-lyrics")
    )

    fun getRandomSong(): TPopSong = songs.random()

    fun findSong(nameOrId: String): TPopSong? {
        val clean = nameOrId.trim()
        return songs.find { it.id.equals(clean, true) || it.title.equals(clean, true) }
    }
}
