package com.example.appkotlin

class Aquarium(var width: Int = 20, var height: Int = 40, var length: Int = 100) {
    fun volume() = width * height * length / 1000
    fun waterNeeded() = volume() * 0.9
}

fun main() {
    val myAquarium = Aquarium()
    println("Volume: ${myAquarium.volume()} liter")
    println("Air yang dibutuhkan: ${myAquarium.waterNeeded()} liter")
}