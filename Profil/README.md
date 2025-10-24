# BINUS Student Profile Android App

## Deskripsi
Aplikasi Android untuk menampilkan profil mahasiswa BINUS University dengan desain yang menarik dan modern.

## Fitur
- ✅ Profil mahasiswa dengan nama dan NIM
- ✅ Foto profil dengan placeholder
- ✅ Informasi universitas BINUS
- ✅ Section "Tentang Saya" 
- ✅ Keahlian dan minat
- ✅ Informasi kontak (email, LinkedIn, GitHub)
- ✅ Desain modern dengan gradient dan animasi
- ✅ Responsive layout untuk berbagai ukuran layar

## Struktur Project

```
app/
├── src/main/
│   ├── java/com/binus/studentprofile/
│   │   └── MainActivity.java
│   ├── res/
│   │   ├── layout/
│   │   │   └── activity_main.xml
│   │   ├── values/
│   │   │   ├── colors.xml
│   │   │   ├── strings.xml
│   │   │   └── themes.xml
│   │   ├── drawable/
│   │   │   ├── gradient_background.xml
│   │   │   ├── header_background.xml
│   │   │   ├── card_background.xml
│   │   │   ├── circle_background.xml
│   │   │   ├── university_background.xml
│   │   │   ├── skill_tag_background.xml
│   │   │   ├── contact_background.xml
│   │   │   └── ic_*.xml (icons)
│   │   └── xml/
│   │       ├── backup_rules.xml
│   │       └── data_extraction_rules.xml
│   └── AndroidManifest.xml
├── build.gradle
└── proguard-rules.pro
```

## Cara Menggunakan

1. **Buka Android Studio**
2. **Import Project** - Pilih folder project ini
3. **Sync Project** - Tunggu hingga Gradle sync selesai
4. **Run App** - Jalankan aplikasi di emulator atau device

## Kustomisasi

### Mengubah Data Profil
Edit file `MainActivity.java` pada method `loadProfileData()`:

```java
studentName.setText("Nama Lengkap Anda");
studentNim.setText("NIM: 2702330123");
emailText.setText("email@binus.ac.id");
```

### Mengubah Foto Profil
1. Tambahkan gambar ke folder `app/src/main/res/drawable/`
2. Edit `activity_main.xml`:
```xml
<ImageView
    android:id="@+id/profile_image"
    android:src="@drawable/nama_gambar_anda" />
```

### Mengubah Warna Tema
Edit file `app/src/main/res/values/colors.xml`:

```xml
<color name="primary_color">#667eea</color>
<color name="primary_dark">#764ba2</color>
```

## Requirements
- Android Studio Arctic Fox atau lebih baru
- Android SDK 21 (Android 5.0) atau lebih tinggi
- Java 8 atau lebih tinggi

## Dependencies
- AndroidX AppCompat
- Material Design Components
- ConstraintLayout

## Lisensi
© 2024 BINUS University Student Profile
