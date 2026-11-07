# Popdle – Yeni Nesil T-Pop Tahmin Oyunu (Mobile Programming Vize Projesi)

Popdle, yeni nesil Türk pop (T-Pop) gruplarını ve grup üyelerini tanımaya yönelik, **LoLdle ve Wordle benzeri bir yerel mobil tahmin oyunudur.** Kullanıcılar başta **Manifest** olmak üzere yeni nesil T-Pop gruplarının üyelerini ipuçları, fotoğraflar ve kişisel özelliklerden (Rol, Yaş, Çıkış Yılı, Burç, Cinsiyet) yararlanarak tahmin eder.

---

## 📱 Proje Klasör Yapısı

```
popdle/
├── android/                             # Tam Kapsamlı Yerel Android Studio (Kotlin) Projesi
│   ├── app/
│   │   ├── build.gradle.kts             # Gradle bağımlılıkları ve ViewBinding ayarı
│   │   ├── src/main/
│   │   │   ├── AndroidManifest.xml      # Uygulama izinleri ve Activity tanımları
│   │   │   ├── java/com/tpop/popdle/    # Kotlin kaynak kodları
│   │   │   │   ├── data/                # Model, Repository (TPopDatabase) ve SharedPreferences
│   │   │   │   ├── engine/              # PopdleEngine (Karşılaştırma) & DailyChallengeManager
│   │   │   │   ├── ui/                  # MainActivity, ClassicGameActivity, ClueModeActivity
│   │   │   │   └── util/                # Sound & Haptic yardımcı sınıfları
│   │   │   └── res/                     # Material 3 XML tasarımları, renkler, ikonlar
│   ├── build.gradle.kts
│   ├── settings.gradle.kts
│   └── gradlew.bat
├── web_preview/                         # Anında Test Edilebilir İnteraktif Mobil Web Önizlemesi
│   └── index.html                       # Tek dosya, bağımlılık gerektirmeyen canlı prototip
├── PROJE_RAPORU.md                      # Akademik Vize Proje Raporu (Teslimat için hazır)
├── VIZE_MULAKAT_SORU_CEVAP_REHBERI.md   # Sınavda hocanın soracağı tüm sorular & cevapları
└── README.md                            # Bu belge
```

---

## 🚀 Projeyi Çalıştırma Yöntemleri

### Yöntem 1: Android Studio ile Çalıştırma (Resmi Teslimat)
1. **Android Studio** uygulamasını açın.
2. `File` > `Open...` menüsüne tıklayın.
3. Klasör seçiminde şu yolu seçin:  
   `C:\Users\nerdy\.gemini\antigravity\scratch\popdle\android`
4. Android Studio projeyi Gradle ile eşitleyecektir (Sync Project with Gradle Files).
5. Üst bardan telefonunuzu (USB Hata Ayıklama açıkken) veya bir Emulator (AVD) seçip yeşil **Run (`Shift + F10`)** butonuna basın.

### Yöntem 2: Anında İnteraktif Önizleme (Tarayıcıda / Telefonda)
Hiçbir kurulum beklemeden oyunun tüm mantığını ve animasyonlarını hemen test etmek için:
- `C:\Users\nerdy\.gemini\antigravity\scratch\popdle\web_preview\index.html` dosyasını Google Chrome, Edge veya telefonunuzun tarayıcısında çift tıklayarak açın.
- Günlük mod, Pratik modu ve Şarkı Sözü İpucu modunu canlı olarak oynayabilirsiniz.

---

## 📦 Vize Sistemi İçin Projeyi ZIP Olarak Paketleme

Hocanızın vize teslim sistemine yüklemek için:
1. `C:\Users\nerdy\.gemini\antigravity\scratch\popdle` klasörüne gidin.
2. Klasöre sağ tıklayıp **"Sıkıştırılmış klasöre gönder (zip)"** veya 7-Zip ile `Popdle_Vize_Projesi.zip` olarak sıkıştırın.
3. Üniversite öğrenci bilgi sistemine / LMS'e (Moodle, Teams vb.) bu zip dosyasını yükleyin.

---

## 🎓 Sınav Zamanı İçin Önemli Notlar
Sınav öncesinde lütfen klasördeki **`VIZE_MULAKAT_SORU_CEVAP_REHBERI.md`** dosyasını mutlaka okuyunuz. Hocanın sorabileceği tarih tohumlama algoritması, ViewBinding avantajı, SharedPreferences mekanizması ve LoLdle karşılaştırma matrisine dair tüm cevaplar hazır olarak bulunmaktadır.
