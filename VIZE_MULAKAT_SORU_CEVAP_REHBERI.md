# POPDLE PROJESİ – VİZE MÜLAKAT VE SINAV SORU-CEVAP HAZIRLIK REHBERİ

> **Hocanın Sınav Kuralı:**  
> *"On the exam time you must come to the class. You may be asked about your project. Do your project yourself. be ready to answer any question on the project."*

Bu rehber, sınavda hocanın projeniz hakkında sorabileceği soruları ve vermeniz gereken en etkili cevapları içerir.

---

## 📌 1. KONSEPT VE GRUPLAR

### Soru: "Uygulamada hangi gruplar var ve neden bu grupları seçtin?"
**Cevabınız:**
> *"Hocam, projemde yeni nesil Türk Pop (T-Pop) akımını temsil eden **6 özel grubu** modelledim:
> 1. **Manifest (✨):** Big5 Türkiye yarışmasıyla kurulan Türkiye'nin ilk T-Pop kız grubu (Sueda, Hilal, Lidya, Mina, Esin, Zeynep).
> 2. **Crush (⚡):** Enerjik ve dans odaklı grup (Derin, Bora, Selin, Arda).
> 3. **Karma (🔮):** Mistik ve elektronik konsept grubu (Melis, Emirhan, Nilsu, Kaan).
> 4. **Aura (🌟):** Vokal ve zarafet odaklı grup (Duru, Berk, İrem, Mert).
> 5. **Mantra (🪷):** Etnik ezgilerle modern popu buluşturan grup (Rüzgar, Aslı, Caner, Zehra).
> 6. **Radikal (🔥):** Rock-pop ve asi sahne grubu (Barış, Aylin, Doruk, Ece).
> Toplam 26 üyenin yaş, çıkış yılı, cinsiyet, burç, rol ve görsel sahne özelliklerini veritabanına işledim."*

### Soru: "Uygulamadaki görsel öğeler ve mekanikler nelerdir?"
**Cevabınız:**
> *"Hocam projede sadece metin karşılaştırması değil, güçlü görsel unsurlar kurguladım:
> 1. **Görsel Avatarlar ve Grup İkonları:** Her grubun kendine has tematik rengi, ikonu (✨, ⚡, 🔮, 🌟, 🪷, 🔥) ve üyelerin renkli avatarları hem arama kutusunda hem de tahmin satırlarında yer alıyor.
> 2. **Görsel Silüet / Bulanık Fotoğraf Modu (Clue Mode):** Üyenin görseli ilk başta tamamen bulanık ve kilitli açılıyor. Kullanıcı yanlış tahmin yaptıkça bulanıklık kademeli olarak kalkıyor (`blur` filtresi temizleniyor) ve fotoğraf netleşiyor.
> 3. **Zafer Görsel Kartı:** Doğru bilindiğinde üyenin ışıltılı görsel avatarı, grup rozeti ve sahne kostüm detaylarıyla zenginleştirilmiş bir tebrik ekranı ve konfeti animasyonu çıkıyor."*

---

## 📌 2. TEKNİK & MİMARİ SORULARI

### Soru: "Günlük gizli üye algoritması nasıl çalışıyor?"
**Cevabınız:**
> *"Hocam, harici bir sunucu kurmadan tüm kullanıcıların aynı gün aynı üyeyi bulabilmesi için **Date-Hashing Modular Arithmetic** kullandım:
> `Math.abs("YYYY-MM-DD".hashCode()) % 26` formülü ile günün tarihi bir tohum sayıya dönüştürülüp 26 üyemize modülo ediliyor. Gece 00:00 olunca tarih string'i değiştiği için otomatik yeni gizli üye seçilmiş oluyor."*

### Soru: "LoLdle karşılaştırmasını nasıl yaptın?"
**Cevabınız:**
> *"Hocam, `PopdleEngine.compare()` fonksiyonuyla:
> - Grup, Cinsiyet, Burç birebir eşitse Yeşil (🟩), değilse Kırmızı (🟥).
> - Roller ortak paylaşıyorsa Sarı (🟨), birebir aynıysa Yeşil.
> - Yaş ve Çıkış Yılında hedef kişi büyükse yukarı ok (▲), küçükse aşağı ok (▼) çıkıyor. Fark 3 yıl veya daha az ise kullanıcıya yakın olduğunu belirtmek için Sarı renkle işaretleniyor."*

### Soru: "Verileri nerede saklıyorsun?"
**Cevabınız:**
> *"Android'in yerel `SharedPreferences` mekanizması ve Google `Gson` kütüphanesini kullanarak `UserStats` nesnesini JSON olarak kaydediyorum. Oyuncunun günlük serisi, kazanma yüzdesi ve puanı cihaz kapansa bile silinmiyor."*
