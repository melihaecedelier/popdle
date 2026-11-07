# POPDLE PROJESİ – VİZE MÜLAKAT VE SINAV SORU-CEVAP HAZIRLIK REHBERİ

> **Hocanın Sınav Kuralı:**  
> *"On the exam time you must come to the class. You may be asked about your project. Do your project yourself. be ready to answer any question on the project."*

Bu rehber, derste hocanın projenizi incelerken size sorabileceği tüm teorik, mimari, algoritmik ve pratik soruları ve vermeniz gereken **en net, profesyonel cevapları** içermektedir. Bu rehberi okuyarak sınava girdiğinizde hocanın soracağı her soruyu kendinizden emin bir şekilde yanıtlayabilirsiniz.

---

## 📌 BÖLÜM 1: GENEL VE KONSEPT SORULARI

### Soru 1: "Popdle nedir ve bu projeyi neden geliştirdin?"
**Cevabınız:**
> *"Hocam, Popdle yeni nesil Türk pop (T-Pop) gruplarını ve grup üyelerini tanıtmayı amaçlayan, dünyaca ünlü LoLdle ve Wordle oyunlarının mantığıyla çalışan bir mobil tahmin oyunudur. Özellikle Big5 yarışmasıyla kurulan Türkiye'nin ilk modern T-Pop kız grubu Manifest ve diğer yeni nesil müzik temsilcilerini (KÖFN, Madrigal, Dolu Kadehi Ters Tut vb.) genç kitlelere eğlenceli ve interaktif bir mobil oyun formatında tanıtmak istedim. Uygulama içinde günlük mod, pratik modu, şarkı sözü ipucu modu, seri (streak) takibi ve puanlama sistemi bulunmaktadır."*

### Soru 2: "Hangi mobil platformu ve programlama dilini kullandın? Neden?"
**Cevabınız:**
> *"Hocam, Native Android platformunu ve Google'ın Android için resmi olarak önerdiği modern programlama dili olan **Kotlin**'i kullandım.  
> Kotlin'i tercih etme sebeplerim:
> 1. **Null-Safety:** Kodda `NullPointerException` hatalarını derleme zamanında (compile-time) engelliyor.
> 2. **Data Class:** Model sınıflarını (örneğin `TPopMember`) getter/setter yazmadan çok temiz ve okunabilir tanımlamamı sağladı.
> 3. **Modern Android Kütüphaneleri:** Material Design 3, ViewBinding ve Kotlin Extension fonksiyonları sayesinde kod kalitesi ve performansı çok daha yüksek oldu."*

---

## 📌 BÖLÜM 2: MİMARİ VE KOD YAPISI SORULARI

### Soru 3: "Uygulamanın mimarisi nedir? Kodları nasıl organize ettin?"
**Cevabınız:**
> *"Hocam, projeyi katmanlı ve modüler bir mimari (Clean Architecture prensipleri) ile organize ettim:
> - **data/model:** `TPopMember`, `GuessResult`, `UserStats` gibi veri yapılarını tutuyor.
> - **data/repository:** `TPopDatabase` ile Manifest ve T-Pop üyelerinin tüm özelliklerini statik veri kaynağında yönetiyorum.
> - **data/local:** `PreferencesManager` ile SharedPreferences ve Gson kullanarak kullanıcının serilerini ve istatistiklerini yerel bellekte saklıyorum.
> - **engine:** Oyunun mantığını UI'dan tamamen izole ettim. `PopdleEngine` tahmin karşılaştırmasını ve puan hesaplamasını, `DailyChallengeManager` ise günün gizli üyesini belirliyor.
> - **ui:** Aktiviteler (`MainActivity`, `ClassicGameActivity`, `ClueModeActivity`), RecyclerView Adaptörleri (`GuessAdapter`, `MemberSearchAdapter`) ve Dialog pencerelerinden oluşuyor.  
> Bu sayede UI katmanı ile iş mantığı (business logic) birbirine karışmıyor."*

### Soru 4: "Neden findViewById yerine ViewBinding kullandın?"
**Cevabınız:**
> *"Hocam, `findViewById` yaklaşımında ID yanlış yazıldığında veya XML'de o eleman bulunmadığında uygulama çalışma zamanında (runtime) çökebilir (NullPointerException veya ClassCastException).  
> `ViewBinding` ise her XML layout'u için derleme esnasında tür-güvenli (type-safe) ve null-güvenli (null-safe) bir binding sınıfı oluşturur (`ActivityClassicGameBinding` gibi). Bu hem performansı artırıyor hem de hata payını sıfıra indiriyor."*

---

## 📌 BÖLÜM 3: ALGORİTMA VE OYUN MANTIĞI SORULARI (EN KRİTİK BÖLÜM!)

### Soru 5: "Günün gizli üyesini (Daily Challenge) nasıl belirliyorsun? Herkesin telefonunda aynı gün aynı üye nasıl çıkıyor?"
**Cevabınız (Hocanın en çok seveceği algoritma açıklaması):**
> *"Hocam, harici bir sunucu veya backend API kurmaya gerek kalmadan, **Tarih Tabanlı Deterministik Hashing (Date-Hashing)** algoritması tasarladım:
> 1. `DailyChallengeManager.getTodayDateString()` fonksiyonu ile bugünün tarihini `"YYYY-MM-DD"` formatında (örneğin `"2026-11-08"`) alıyorum.
> 2. Bu metnin hash kodunun mutlak değerini alıyorum: `Math.abs(dateStr.hashCode())`.
> 3. Bu değeri veritabanındaki toplam üye sayısına modülo ediyorum: `seed % members.size`.
> 
> Bu matematiksel yaklaşım sayesinde dünyanın neresinde olursa olsun, aynı gün uygulamayı açan her kullanıcı tamamen **AYNI** gizli T-Pop üyesini tahmin etmeye çalışıyor. Gece saat 00:00 olduğunda tarih string'i değiştiği için yeni bir üye otomatik olarak seçilmiş oluyor."*

### Soru 6: "LoLdle / Wordle tarzı kutucuk karşılaştırma mantığını nasıl kodladın?"
**Cevabınız:**
> *"Hocam, `PopdleEngine.compare()` metodunda tahmin edilen üye ile hedef üye 7 farklı kritere göre karşılaştırılıyor:
> 1. **Grup, Cinsiyet ve Burç:** Metinsel birebir eşitse `MatchStatus.MATCH` (Yeşil 🟩), değilse `MatchStatus.MISMATCH` (Kırmızı 🟥).
> 2. **Roller:** Eğer roller kümesi tamamen eşitse Yeşil, en az bir ortak rol paylaşıyorlarsa `MatchStatus.PARTIAL` (Sarı 🟨), hiç ortak yoksa Kırmızı.
> 3. **Yaş ve Çıkış Yılı:** 
>    - Tam eşitse Yeşil (`NumericDirection.EQUAL`).
>    - Hedef kişi daha büyükse yukarı ok (**▲** - `HIGHER`), daha küçükse aşağı ok (**▼** - `LOWER`) atanıyor.
>    - Ayrıca yaş veya yıl farkı $\le 3$ ise kullanıcıya yakın olduğunu belirtmek için Sarı (Kısmi), fark 3'ten büyükse Kırmızı renge boyanıyor.
> 
> RecyclerView içindeki `GuessAdapter`, bu sonuç nesnesini alıp ilgili kartın arkaplanını dinamik olarak `bg_card_correct`, `bg_card_partial` veya `bg_card_wrong` drawable'ları ile renklendiriyor."*

### Soru 7: "Puanlama ve günlük seri (Streak) mekanizması nasıl çalışıyor?"
**Cevabınız:**
> *"Hocam, oyuncu ilk tahminde bilirse 1000 puan, 2. tahminde 800, 3. tahminde 600, 4. tahminde 450, 5. tahminde 300, 6 ve sonrasında 150 puan kazanıyor.  
> Günlük seri için `UserStats` sınıfında `currentStreak` ve `maxStreak` tutuluyor. Oyuncu günün oyununu kazandığında serisi 1 artıyor ve bugünün tarihi `lastDailyDate` olarak kaydediliyor. Eğer kullanıcı bir gün oyunu kaçırırsa serisi sıfırlanıyor."*

---

## 📌 BÖLÜM 4: ANDROID BİLEŞENLERİ VE VERİ DEPOLAMA

### Soru 8: "Verileri yerel bellekte nasıl saklıyorsun?"
**Cevabınız:**
> *"Hocam, `PreferencesManager` sınıfında Android'in `SharedPreferences` mekanizmasını kullandım. Oyuncunun oyun sayısı, kazanma oranı, serileri ve tahmin dağılımını `UserStats` nesnesi içinde tutuyorum. Bu nesneyi Google'ın `Gson` kütüphanesi ile JSON formatına serileştirip (`toJson`) SharedPreferences'a String olarak kaydediyorum. Uygulama açıldığında da bu JSON'ı geri deserileştiriyorum (`fromJson`). Ayrıca `key_daily_completed_date` anahtarıyla kullanıcının bugünün oyununu tamamlayıp tamamlamadığını kontrol ediyorum."*

### Soru 9: "Arama kutusundaki otomatik tamamlama (AutoComplete) nasıl çalışıyor?"
**Cevabınız:**
> *"Hocam, `AutoCompleteTextView` bileşeni için özel bir `MemberSearchAdapter` yazdım. Bu adaptör `Filterable` arayüzünü uyguluyor. Kullanıcı arama kutusuna 1 harf bile yazdığında (`completionThreshold = 1`), `performFiltering` metodu hem üye isimlerinde hem de grup isimlerinde büyük/küçük harf duyarsız (`contains(query, ignoreCase)`) arama yapıyor ve eşleşenleri özel `item_search_dropdown.xml` tasarımıyla listeliyor."*

### Soru 10: "Titreşim ve ses efektlerini nasıl ekledin?"
**Cevabınız:**
> *"Hocam, `SoundAndHapticHelper` sınıfı oluşturdum:
> - Titreşim için Android `Vibrator` ve Android 8.0+ için `VibrationEffect` API'lerini kullandım. Doğru tahminde zafer ritmi dalgası (`createWaveform`), tekil tahminde ise kısa tek atımlık titreşim (`createOneShot`) üretiyorum. Bunun için `AndroidManifest.xml`'e `<uses-permission android:name="android.permission.VIBRATE" />` iznini ekledim.
> - Ses için Android'in düşük gecikmeli yerel `ToneGenerator` sınıfını kullanarak harici MP3 dosyası yükleme ihtiyacı olmadan sistem bildirim seslerini tetikledim."*

---

## 📌 BÖLÜM 5: SINAVDA HOCANIN KARŞISINDA 2 DAKİKADA CANLI DEMO YAPMA REHBERİ

Derste hoca *"Uygulamanı göster bakalım"* dediğinde şu adımları izleyin:

1. **Giriş (15 saniye):**
   - Uygulama ana ekranını açın.
   - *"Hocam, bu Popdle ana ekranımız. Burada bugünün tarihi (8 Kasım 2026), mevcut serimiz ve puanımız görünüyor. Üstteki butonlardan 'Nasıl Oynanır' rehberi ve detaylı oyuncu istatistikleri açılabiliyor."*

2. **Günün Oyununu Gösterme (45 saniye):**
   - **"Günün Oyununu Başlat"** butonuna basın.
   - Arama kutusuna **"Sueda"** yazın. Çıkan autocomplete kartına tıklayın.
   - Satırın eklendiğini gösterin:
     - *"Hocam bakın; Sueda Uluca tahminini yaptığımızda Grup, Cinsiyet, Rol, Yaş, Çıkış Yılı ve Burç değerleri karşılaştırıldı. Eşleşen özellikler Yeşil, yakın olanlar Sarı ve ok işaretleriyle (▲/▼) hedefin daha büyük ya da küçük olduğu gösterildi."*

3. **Zafer ve Modal Gösterimi (30 saniye):**
   - Doğru cevabı tahmin edin (veya pratik modunda hızlıca doğru üyeyi seçin).
   - Zafer modalı açıldığında:
     - *"Bildiğimiz anda titreşim ve ses çalıyor, kaç tahminde bildiğimiz ve kazandığımız puan rozet olarak gösteriliyor. İstersek 'Sonucu Paylaş' diyerek WhatsApp üzerinden Wordle tarzı paylaşabiliyoruz."*

4. **Kapanış (15 saniye):**
   - Ana ekrana dönüp **"İstatistikler"** ikonuna tıklayın:
     - *"Oynanan oyun, kazanma yüzdesi ve seri SharedPreferences'a otomatik kaydedildi ve gösterge paneline yansıdı."*

Bu sunumla hocanın derste tam puan (100) vermemesi imkansızdır! Başarılar dileriz! 🎉
