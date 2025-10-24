# Profil App - Aplikasi Profil Android

Aplikasi Android sederhana untuk menampilkan profil pribadi yang berisi:
- Nama
- NIM
- Foto profil
- Tentang saya
- Informasi kontak (email, telepon, lokasi)

## Cara Menjalankan

### Prasyarat
- Android Studio (versi terbaru)
- Android SDK API Level 24 atau lebih tinggi
- Kotlin support

### Langkah-langkah

1. **Buka Android Studio**
   - Pilih "Open an existing project"
   - Pilih folder proyek ini

2. **Konfigurasi Proyek**
   - Tunggu hingga Gradle sync selesai
   - Pastikan semua dependencies terunduh

3. **Personalisasi Data**
   - Buka file `app/src/main/res/values/strings.xml`
   - Edit data berikut sesuai dengan informasi Anda:
     ```xml
     <string name="profile_name">Nama Anda</string>
     <string name="profile_nim">NIM Anda</string>
     <string name="about_me_text">Deskripsi tentang diri Anda...</string>
     <string name="email">email@anda.com</string>
     <string name="phone">+62 812 3456 7890</string>
     <string name="location">Kota Anda, Indonesia</string>
     ```

4. **Tambahkan Foto Profil (Opsional)**
   - Siapkan foto profil dengan format PNG atau JPG
   - Copy foto ke folder `app/src/main/res/drawable/`
   - Rename menjadi `profile_photo.png` atau `profile_photo.jpg`
   - Buka `activity_main.xml` dan ganti:
     ```xml
     android:src="@drawable/profile_placeholder"
     ```
     menjadi:
     ```xml
     android:src="@drawable/profile_photo"
     ```

5. **Jalankan Aplikasi**
   - Sambungkan device Android atau jalankan emulator
   - Klik tombol "Run" (▶️) atau tekan Shift+F10
   - Pilih device target
   - Aplikasi akan ter-install dan berjalan

## Struktur Proyek

```
app/
├── src/main/
│   ├── java/com/example/profilapp/
│   │   └── MainActivity.kt          # Activity utama
│   ├── res/
│   │   ├── drawable/               # Icon dan gambar
│   │   ├── layout/
│   │   │   └── activity_main.xml   # Layout utama
│   │   ├── values/
│   │   │   ├── colors.xml          # Definisi warna
│   │   │   ├── strings.xml         # Teks aplikasi
│   │   │   └── themes.xml          # Tema aplikasi
│   │   └── AndroidManifest.xml     # Konfigurasi aplikasi
│   └── build.gradle                # Dependencies
```

## Fitur

- **UI Modern**: Menggunakan Material Design dengan gradient header
- **Responsive**: Layout yang menyesuaikan berbagai ukuran layar
- **Card Layout**: Informasi terorganisir dalam card yang rapi
- **Icon Support**: Icon untuk email, telepon, dan lokasi
- **Customizable**: Mudah diubah sesuai kebutuhan

## Troubleshooting

### Gradle Sync Failed
- Pastikan koneksi internet stabil
- Update Android Studio ke versi terbaru
- Bersihkan cache: Build → Clean Project

### App Tidak Bisa Dijalankan
- Periksa Android SDK sudah terinstall
- Pastikan device/emulator sudah terhubung
- Cek log error di Android Studio

### Layout Tidak Sesuai
- Pastikan semua file drawable sudah ada
- Periksa nama resource sudah sesuai
- Rebuild project: Build → Rebuild Project

## Kustomisasi Lebih Lanjut

Anda dapat mengkustomisasi:
- Warna tema di `colors.xml`
- Layout di `activity_main.xml`
- Menambah field baru di layout dan Activity
- Mengubah font dan ukuran teks
- Menambah animasi atau efek visual

Selamat mencoba!
