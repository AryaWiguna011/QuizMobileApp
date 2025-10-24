package com.example.profilapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.profilapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    
    private lateinit var binding: ActivityMainBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set up profile data
        setupProfileData()
    }
    
    private fun setupProfileData() {
        binding.nameText.text = getString(R.string.profile_name)
        binding.nimText.text = getString(R.string.profile_nim)
        binding.aboutText.text = getString(R.string.about_me_text)
        binding.emailText.text = getString(R.string.email)
        binding.phoneText.text = getString(R.string.phone)
        binding.locationText.text = getString(R.string.location)
        
//         You can also set custom data here
//         binding.nameText.text = "Nama Anda"
//         binding.nimText.text = "NIM Anda"
//         binding.aboutText.text = "Deskripsi tentang Anda"
//         binding.emailText.text = "email@anda.com"
//         binding.phoneText.text = "+62 812 3456 7890"
//         binding.locationText.text = "Kota Anda"
    }
}
