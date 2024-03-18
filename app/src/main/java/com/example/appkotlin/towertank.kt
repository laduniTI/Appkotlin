package com.example.appkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val panjangAkuarium = 5.0 // Panjang akuarium dalam satuan tertentu (misalnya, dalam meter)
        val tinggiAkuarium = 2.0 // Tinggi akuarium dalam satuan yang sama dengan panjang (misalnya, meter)

        val luasLebar = hitungLuasLebarAkuarium(panjangAkuarium, tinggiAkuarium)
        println("Luas lebar akuarium adalah: $luasLebar satuan persegi")
    }

    // Fungsi untuk menghitung luas lebar akuarium
    fun hitungLuasLebarAkuarium(panjang: Double, tinggi: Double): Double {
        return panjang * tinggi
    }
}
