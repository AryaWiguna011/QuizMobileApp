package com.example.quizmobile

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.ktx.toObjects
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await

/**
 * ViewModel ini bertanggung jawab untuk semua logika bisnis dan interaksi dengan data.
 * Ini menjadi perantara antara UI (Compose) dan sumber data (Firestore).
 */
class ActivityViewModel : ViewModel() {

    // Mendapatkan instance Firestore dan menunjuk ke koleksi 'activities'
    private val db = Firebase.firestore.collection("activities")

    // StateFlow untuk menampung daftar kegiatan yang akan diobservasi oleh UI.
    // Data yang ada di sini akan selalu sinkron dengan Firestore secara real-time.
    private val _activities = MutableStateFlow<List<Activity>>(emptyList())
    val activities = _activities.asStateFlow()

    init {
        // Mengaktifkan listener real-time saat ViewModel pertama kali dibuat.
        // Data akan diurutkan berdasarkan timestamp (waktu).
        db.orderBy("timestamp").addSnapshotListener { snapshot, error ->
            if (error != null) {
                // Idealnya, di sini ada penanganan error yang lebih baik, misal menampilkan pesan ke user.
                println("Listen failed: $error")
                return@addSnapshotListener
            }

            if (snapshot != null) {
                // Konversi snapshot Firestore menjadi daftar objek 'Activity'.
                _activities.value = snapshot.toObjects()
            }
        }
    }

    /**
     * Menambahkan kegiatan baru ke Firestore.
     */
    fun addActivity(name: String, timestamp: Long) {
        viewModelScope.launch {
            val newActivity = Activity(name = name, timestamp = timestamp, isCompleted = false)
            db.add(newActivity).await() // `await()` memastikan operasi selesai sebelum melanjutkan.
        }
    }

    /**
     * Memperbarui status 'isCompleted' dari sebuah kegiatan di Firestore.
     */
    fun updateActivityStatus(activityId: String, isCompleted: Boolean) {
        viewModelScope.launch {
            db.document(activityId).update("completed", isCompleted).await()
        }
    }
}