# POPDLE: YENİ NESİL T-POP GRUP ÜYELERİNİ TAHMİN ETME MOBİL OYUNU
## MOBİL PROGRAMLAMA DERSİ VİZE PROJE RAPORU

---

* **Ders:** Mobil Programlama (Mobile Programming)
* **Proje Adı:** Popdle – T-Pop Edition
* **Proje Türü:** Yerel Mobil Uygulama (Native Android) & İnteraktif Görsel Web Prototipi
* **Platform & Dil:** Android Studio, Kotlin, Jetpack Material Design 3, SharedPreferences
* **Hedef Gruplar:** Sadece 6 Yetkili Grup (**Manifest, Crush, Karma, Aura, Mantra, Radikal**)
* **Hedef Sürüm:** Android 7.0+ (API 24 - 34)
* **Tarih:** 2026

---

## 1. Proje Özeti ve Kapsam

### 1.1. Projenin Amacı
Türkiye'de gelişmekte olan yeni nesil Türk Pop (T-Pop) akımını ve özellikle Big5 yarışmasıyla doğan **Manifest** başta olmak üzere dinamik 6 T-Pop grubunu (**Manifest, Crush, Karma, Aura, Mantra, Radikal**) odağa alan, LoLdle ve Wordle benzeri bir mobil tahmin ve bilgi oyunudur.

Kullanıcılar; grup üyelerini **görsel avatarlar, bulanıklaşan silüet fotoğrafları, kişisel özellikler (Cinsiyet, Rol, Yaş, Çıkış Yılı, Burç)** ve şarkı sözü ipuçlarından yararlanarak tahmin ederler.

---

## 2. Kapsamdaki 6 T-Pop Grubu ve Görsel Kimlikleri

Uygulamada yalnızca aşağıdaki 6 modern T-Pop grubu ve bu gruplara ait 26 üye yer almaktadır:

| Grup Adı | Konsept & Müzik Tarzı | Görsel İkon & Tema | Temsilci Üyeler |
| :--- | :--- | :--- | :--- |
| **Manifest** | T-Pop Kız Grubu (Big5 / Hypers) | ✨ Pembe / Fuşya | Sueda Uluca, Hilal Yelekçi, Lidya Pınar, Mina Solak, Esin Bahat, Zeynep Sude Oktay |
| **Crush** | Dinamik & Enerjik Sokak Popu | ⚡ Kızıl / Turuncu | Derin Aksoy, Bora Yılmaz, Selin Deniz, Arda Çetin |
| **Karma** | Gizemli Mistik & Fütüristik Synth | 🔮 Koyu Mor / İndigo | Melis Doğan, Emirhan Kaya, Nilsu Güler, Kaan Yıldız |
| **Aura** | Zarif & Parlak Akustik Vokal | 🌟 Camgöbeği / Turkuaz | Duru Aydın, Berk Saner, İrem Şahin, Mert Koç |
| **Mantra** | Spiritüel & Etnik Pop Fusion | 🪷 Altın / Amber | Rüzgar Yalçın, Aslı Demir, Caner Öztürk, Zehra Tan |
| **Radikal** | Asi & Rock-Pop Başkaldırı | 🔥 Koyu Ateş / Kömür | Barış Keskin, Aylin Erdem, Doruk Korkmaz, Ece Vural |

---

## 3. Eklenen Görsel Öğeler ve Mekanikler

Kullanıcı deneyimini güçlendirmek ve görsel zenginlik sunmak amacıyla projeye şu görsel bileşenler entegre edilmiştir:

1. **Görsel Avatarlar ve Grup Rozetleri:**
   - Her üyenin kendi grup rengi ve ikonunu taşıyan görsel avatar rozeti tasarlanmıştır.
   - Arama kutusunda autocomplete önerileri görsel kartlarla sunulmaktadır.
   - LoLdle tahmin tablosunda her üyenin avatarı ve grup ikonu yer almaktadır.

2. **Kademeli Görsel Silüet & Bulanık Fotoğraf Modu (Silhouette Photo Mode):**
   - Şarkı Sözü ve İpucu modunda üyenin görseli ilk başta tamamen bulanık (`blur-md brightness-50`) ve kilitli olarak sunulur.
   - Her yapılan yanlış tahminde görsel kademeli olarak netleşir (`blur-sm` $\to$ `blur-none`), böylece kullanıcı sadece metinsel değil görsel hafızasıyla da üyeyi teşhis edebilir.

3. **Zafer Görsel Kartı (Win Modal):**
   - Oyuncu doğru üyeyi bulduğunda üyenin ışıltılı görsel avatarı, grup rozeti, sahne özelliği ve konfeti animasyonları ile ödüllendirilir.

---

## 4. Sistem Mimarisi ve Algoritmik Çözümler

### 4.1. Günlük Deterministik Hashing
$$\text{Seed} = |\text{hashCode}(\text{"YYYY-MM-DD"})| \pmod{26}$$
Her gün gece 00:00'da tarih değiştiğinde tüm oyuncular için ortak yeni bir T-Pop idolü seçilir.

### 4.2. LoLdle Karşılaştırma Matrisi
* **Yeşil (🟩):** Birebir eşleşme.
* **Sarı (🟨):** Roller arası ortaklık veya yaş/çıkış yılı farkı $\le 3$ yıl.
* **Kırmızı (🟥):** Eşleşmeme durumu.
* **Oklar (▲ / ▼):** Hedef üyenin yaşı/çıkış yılı daha büyük (▲) ya da daha küçük (▼).

---

## 5. Sonuç
Proje, gereksiz gruplardan arındırılarak sadece istenen 6 T-Pop grubuna odaklanmış, görsel avatarlar ve silüet açma mekaniğiyle modern bir mobil oyun deneyimine kavuşturulmuştur.
