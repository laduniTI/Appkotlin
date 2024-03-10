package com.example.appkotlin

fun main(){
    println(updateDirty(30, waterFilter))
    println(updateDirty(15, ::increaseDirty))

    var dirtyLevel = 19
    dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23}
    println(dirtyLevel)
}

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }

fun increaseDirty( start: Int ) = start + 1