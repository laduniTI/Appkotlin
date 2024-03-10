package com.example.appkotlin

fun main(){
    var dirtyLevel = 20
    val waterFilter = { dirty : Int -> dirty / 2}
    println("==== 1 ====")
    println(waterFilter(dirtyLevel))
    println("==== 2 ====")

    println(waterFilters(dirtyLevels))
}

var dirtyLevels = 30
val waterFilters: (Int) -> Int = { dirty -> dirty / 2 }