package com.example.quizmobile

import com.google.firebase.firestore.DocumentId

/**
 * Data class ini merepresentasikan satu item kegiatan dalam aplikasi.
 *
 * @property id ID unik dokumen dari Firestore, diisi otomatis.
 * @property name Nama dari kegiatan.
 * @property timestamp Waktu kegiatan dalam format Unix Milliseconds untuk memudahkan pengurutan.
 * @property isCompleted Status apakah kegiatan sudah selesai atau belum.
 */
data class Activity(
    @DocumentId // Anotasi ini penting agar ID dokumen Firestore otomatis terisi ke field ini.
    val id: String = "",
    val name: String = "",
    val timestamp: Long = 0L,
    val isCompleted: Boolean = false
)