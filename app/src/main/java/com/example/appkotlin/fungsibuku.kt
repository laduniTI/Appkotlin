package com.example.appkotlin

class Buku(
    val judul: String,
    val penulis: String,
    val tahunTerbit: Int,
    val harga: Double) {
    // Properties atau atribut lainnya bisa ditambahkan sesuai kebutuhan, seperti ISBN, jumlah halaman, dll.

    // Fungsi untuk menampilkan informasi buku
    fun tampilkanInformasi() {
        println("Judul: $judul")
        println("Penulis: $penulis")
        println("Tahun Terbit: $tahunTerbit")
        println("Harga: Rp. $harga")
    }
}

fun main() {
    // Membuat objek buku
    val buku1 = Buku("cerita anak desa", "andika", 1997, 150000.0)
    buku1.tampilkanInformasi()
}

