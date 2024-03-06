package com.example.appkotlin

class Biodata(val nama: String, val umur: Int, val hobi: String) {
    fun tampilkanBiodata() {
        println("Nama: $nama")
        println("Umur: $umur tahun")
    }

    fun tampilkanHobi() {
        println("Hobi: $hobi")
    }
}

fun main() {
    val biodataSaya = Biodata("Laduni prada", 19, "Membaca buku")
    biodataSaya.tampilkanBiodata()
    biodataSaya.tampilkanHobi()
}