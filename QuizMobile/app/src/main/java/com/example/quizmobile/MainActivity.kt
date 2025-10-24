package com.example.quizmobile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.quizmobile.ui.theme.QuizMobileTheme // Pastikan nama tema ini benar

class MainActivity : ComponentActivity() {

    // Inisialisasi ViewModel menggunakan 'by viewModels()'
    private val viewModel: ActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Menggunakan tema bawaan dari proyek
            QuizMobileTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Memanggil Composable utama dan memberikan instance ViewModel
                    MainScreen(viewModel = viewModel)
                }
            }
        }
    }
}

class ActivityViewModel {

}
