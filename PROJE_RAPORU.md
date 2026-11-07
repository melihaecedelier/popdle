# POPDLE: YENİ NESİL T-POP GRUP ÜYELERİNİ TAHMİN ETME MOBİL OYUNU
## MOBİL PROGRAMLAMA DERSİ VİZE PROJE RAPORU

---

* **Ders:** Mobil Programlama (Mobile Programming)
* **Proje Adı:** Popdle – T-Pop Edition
* **Proje Türü:** Yerel Mobil Uygulama (Native Android) & İnteraktif Mobil Önizleme
* **Platform & Dil:** Android Studio, Kotlin, Jetpack Material Design 3, SharedPreferences
* **Hedef Sürüm:** Android 7.0+ (API 24 - 34)
* **Tarih:** 2026

---

## 1. Proje Özeti ve Problem Tanımı

### 1.1. Projenin Amacı
Son yıllarda Türkiye'de müzik endüstrisi, global idol gruplarından ve pop koreografilerinden ilham alan yeni bir dalga ile tanışmıştır. Hypers New Media çatısı altında kurulan **Manifest** gibi Türkiye'nin ilk modern **T-Pop (Türk Pop)** kız grupları, genç kitleler ve müzikseverler arasında hızla büyüyen bir hayran kitlesi oluşturmuştur.

**Popdle**, LoLdle ve Wordle gibi dünya çapında milyonlarca oyuncuya ulaşan zeka ve tahmin oyunlarının dinamiklerini modern Türk Popu kültürüne uyarlayan, yerel bir mobil tahmin oyunudur. Projenin temel hedefleri:
1. Manifest ve modern T-Pop temsilcilerini (KÖFN, Madrigal, Dolu Kadehi Ters Tut, Grup Hepsi vb.) eğlenceli ve interaktif bir mobil oyun formatında tanıtmak,
2. Kullanıcıların müzik hafızalarını, grup üyelerinin rollerini (Lider, Ana Vokal, Dansçı, Rapçi, Visual, Maknae), doğum yıllarını, burçlarını ve çıkış tarihlerini test etmek,
3. Günlük seri (Streak), puanlama ve başarı istatistikleri ile kullanıcı bağlılığını ve oyunlaştırma (gamification) etkisini en üst düzeye çıkarmaktır.

---

## 2. Sistem Mimarisi ve Teknoloji Yığını

Uygulama, Google tarafından önerilen modern Android mimari prensiplerine uygun olarak **Modüler Katmanlı Mimari (Clean & MVVM Pattern)** ile geliştirilmiştir.

```
com.tpop.popdle/
├── data/
│   ├── model/           # TPopMember, GuessResult, UserStats
│   ├── repository/      # TPopDatabase (Veri Deposu)
│   └── local/           # PreferencesManager (SharedPreferences & JSON Serileştirme)
├── engine/              # PopdleEngine (Karşılaştırma & Puan), DailyChallengeManager (Hash Tohumu)
├── ui/
│   ├── MainActivity.kt  # Ana Gösterge Paneli & Mod Seçimi
│   ├── ClassicGameActivity.kt # LoLdle Matris Oyunu
│   ├── ClueModeActivity.kt    # Şarkı Sözü & Kademeli İpucu Oyunu
│   ├── adapter/         # GuessAdapter, MemberSearchAdapter
│   └── dialogs/         # WinDialog, StatsDialog, HowToPlayDialog
└── util/                # SoundAndHapticHelper (Titreşim & Bildirim Sesleri)
```

### 2.1. Kullanılan Kütüphaneler ve Bileşenler
* **Kotlin (v1.9.24 / 2.0):** Null-güvenliği (Null-safety), veri sınıfları (data class) ve genişletme fonksiyonları (extensions) için temel dil olarak kullanılmıştır.
* **Android ViewBinding:** Klasik `findViewById` yaklaşımının yol açtığı çalışma zamanı (runtime) `NullPointerException` risklerini derleme aşamasında (compile-time) engelleyen güvenli görünüm bağlama mekanizması.
* **Google Material Design 3:** Modern koyu neon concert teması, yuvarlatılmış köşeli kartlar (CardView) ve dinamik renk paleti.
* **SharedPreferences & Gson:** Oyuncunun günlük serilerini, kazanma oranını, tahmin dağılım grafiğini ve bugünün oyununun tamamlanıp tamamlanmadığını kalıcı olarak cihazda saklayan yerel depolama katmanı.
* **Android Vibrator API:** Doğru tahminde zafer ritmi, yanlış tahminde uyarı vuruşu sağlayan dokunsal (haptic) geri bildirim mekanizması.

---

## 3. Oyun Mekanikleri ve Algoritmalar

### 3.1. Günlük Gizli Üye Algoritması (Date-Hashing Modular Arithmetic)
Uygulamanın en kritik gereksinimlerinden biri, **"Her gün kullanıcılara yeni bir grup üyesi sunulması ve tüm kullanıcıların aynı gün tamamen AYNI gizli üyeyi tahmin etmesi"** dir.

Bu gereksinim için harici bir sunucuya bağımlı olmadan deterministik bir tarih tohumlama algoritması geliştirilmiştir:

$$\text{Seed} = |\text{hashCode}(\text{"YYYY-MM-DD"})|$$
$$\text{Hedef Üye İndeksi} = \text{Seed} \pmod{N}$$

*Burada $N$, TPopDatabase içindeki toplam üye sayısıdır.* Bu sayede 8 Kasım günü uygulamayı açan tüm oyuncular aynı gizli üyeyi ararken, gece 00:00'ı geçtiğinde yeni tarihe ait hash kodu otomatik olarak bir sonraki üyeyi seçmektedir.

### 3.2. LoLdle Özellik Karşılaştırma Matrisi (PopdleEngine)
Kullanıcı bir tahmin yaptığında, girilen üye ile günün hedef üyesi 7 farklı parametrede karşılaştırılır:

| Parametre | Yeşil (MATCH) 🟩 | Sarı (PARTIAL) 🟨 | Kırmızı (MISMATCH) 🟥 |
| :--- | :--- | :--- | :--- |
| **Grup Adı** | Birebir aynı grup | - | Farklı grup |
| **Cinsiyet** | Birebir eşleşme | - | Farklı cinsiyet |
| **Rol / Görev** | Tüm roller birebir aynı | Ortak en az bir rol paylaşıyor | Hiçbir ortak rol yok |
| **Yaş** | Birebir aynı yaş | Fark $\le 3$ yaş (▲ / ▼ Ok ile) | Fark $> 3$ yaş (▲ / ▼ Ok ile) |
| **Çıkış Yılı** | Birebir aynı yıl | Fark $\le 3$ yıl (▲ / ▼ Ok ile) | Fark $> 3$ yıl (▲ / ▼ Ok ile) |
| **Burç** | Birebir aynı burç | - | Farklı burç |

*Ok Göstergeleri:* Hedef üye tahmin edilen üyeden daha yaşlı veya daha sonra çıkış yapmışsa yukarı ok (**▲**), daha genç veya daha eski çıkışlıysa aşağı ok (**▼**) gösterilerek oyuncuya mantıksal yönlendirme sağlanır.

### 3.3. Puanlama ve Seri (Streak) Sistemi
Oyuncunun başarı performansını ödüllendirmek amacıyla hamle sayısına dayalı dinamik puanlama matrisi kurgulanmıştır:

* **1. Tahminde Bilme:** 1.000 Puan *(Mükemmel T-Pop Bilgisi)*
* **2. Tahminde Bilme:** 800 Puan
* **3. Tahminde Bilme:** 600 Puan
* **4. Tahminde Bilme:** 450 Puan
* **5. Tahminde Bilme:** 300 Puan
* **6 ve Üzeri:** 150 Puan

Günlük mod her başarıyla tamamlandığında `currentStreak` değişkeni 1 artırılır ve `maxStreak` ile karşılaştırılarak güncellenir. Eğer gün atlanırsa seri sıfırlanır.

---

## 4. Veri Modeli ve T-Pop İdol Kadrosu

Projede nesne yönelimli programlama ilkelerine uygun olarak `TPopMember` veri modeli oluşturulmuştur.

### 4.1. Manifest Grubu Temsili
Türkiye'nin ilk T-Pop kız grubu Manifest'in 6 resmi üyesi tüm karakteristik nitelikleriyle veri setine işlenmiştir:
1. **Sueda Uluca:** Manifest Lideri ve Ana Vokali, Koç Burcu, 22 yaşında.
2. **Hilal Yelekçi:** Ana Dansçı ve Vokal, Boğa Burcu, 21 yaşında.
3. **Lidya Pınar:** Ana Rapçi ve Vokal, Aslan Burcu, 20 yaşında.
4. **Mina Solak:** Visual ve Lead Vokal, Terazi Burcu, 21 yaşında.
5. **Esin Bahat:** Vokal ve Dansçı, İkizler Burcu, 23 yaşında.
6. **Zeynep Sude Oktay:** Grubun en genç üyesi (Maknae), Balık Burcu, 19 yaşında.

Ayrıca pop kültür çeşitliliğini artırmak amacıyla **KÖFN** (Salman Tin, Bilge Kağan Etil), **Madrigal** (Anıl Erbil, Ceyhun Kırdemir), **Dolu Kadehi Ters Tut** (Uğurhan Özay, Mürsel Oğulcan Ava) ve nostaljik Türk kız grubu referansı olarak **Grup Hepsi** (Gülçin Ergül, Cemre Kemer) veri setine eklenmiştir.

---

## 5. Oyun Modları

1. **Günün T-Pop Üyesi (Daily Mode):** Tarih tohumuna bağlı günde bir defa oynanabilen rekabetçi mod.
2. **Sonsuz Pratik Modu (Practice Mode):** Rastgele üyeler seçilerek oyuncunun istediği kadar pratik yapabildiği mod.
3. **Şarkı Sözü & Kademeli İpucu Modu (Clue Mode):** Üyenin ikonik bir şarkı sözü ya da sahne alıntısı sunulur. Her yanlış tahminde ek ipuçları (Burç, Grup, Eğlenceli Gerçek) açılarak 5 tahmin hakkı içinde üyenin bulunması hedeflenir.

---

## 6. Test Senaryoları ve Hata Yönetimi

* **Boş veya Hatalı Giriş Kontrolü:** Kullanıcı geçerli bir üye seçmeden butona bastığında arayüz kilitlenmez, Toast uyarısı ile bilgilendirilir.
* **Mükerrer Tahmin Koruması:** `guessedMemberIds: MutableSet<String>` yapısı ile aynı üyenin iki kez tahmin edilerek hak kaybı yaşanması engellenir.
* **Yapılandırma Değişiklikleri (Orientation):** Android manifest dosyasında ekran yönü dikey (portrait) olarak kilitlenmiş, böylece döndürme esnasında oyun durumunun kaybolması önlenmiştir.
* **Depolama Dayanıklılığı:** Bozuk JSON veya ilk yükleme durumlarında `try-catch` blokları ile varsayılan `UserStats()` nesnesi döndürülerek uygulamanın çökmesi (crash) imkansız kılınmıştır.

---

## 7. Sonuç
**Popdle**, mobil programlama dersi vize gereksinimlerini eksiksiz şekilde karşılayan; modern Android mimarisi, zengin veri modellemesi, LoLdle tabanlı algoritmik karşılaştırma motoru ve yerel veri saklama mekanizmalarıyla donatılmış eksiksiz bir mobil tahmin oyunudur. Proje, hem Android Studio üzerinden yerel olarak hem de web ortamında anında test edilebilecek şekilde teslim edilmektedir.
