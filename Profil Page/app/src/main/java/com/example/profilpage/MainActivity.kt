package com.example.profilpage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profilpage.ui.theme.ProfilPageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfilPageTheme {
                ProfilPage()
            }
        }
    }
}

@Composable
fun ProfilPage() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Foto Profil
        Image(
            painter = painterResource(id = R.drawable.profil_placeholder), // Ganti dengan nama file gambar Anda di folder `res/drawable`
            contentDescription = "Foto Profil",
            modifier = Modifier
                .size(150.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Informasi Pribadi
        Text(
            text = "I Putu gede Arya Cahya Wiguna", // Ganti dengan nama Anda
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp
        )
        Text(
            text = "NIM: 2702330123", // Ganti dengan NIM Anda
            fontSize = 16.sp,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
        Text(
            text = "i.wiguna003@binus.ac.id", // Ganti dengan email Anda
            fontSize = 16.sp,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
        Text(
            text = "Mahasiswa Jurusan: Computer Science", // Ganti dengan jurusan Anda
            fontSize = 16.sp,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Bagian "Tentang Saya"
        Card(
            modifier = Modifier.fillMaxWidth(),
            elevation = CardDefaults.cardElevation(4.dp)
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = "Tentang Saya",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Saya adalah mahasiswa yang bersemangat dalam mempelajari pengembangan aplikasi mobile, khususnya menggunakan Android dan Jetpack Compose. Saya suka memecahkan masalah dan terus belajar hal-hal baru.", // Ganti dengan deskripsi "Tentang Saya"
                    fontSize = 14.sp
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfilPagePreview() {
    ProfilPageTheme {
        ProfilPage()
    }
}