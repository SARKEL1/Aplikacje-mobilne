package com.example.lekcjapierwsza


fun main() {


    var napis = readLine() ?: ""
    var dlugosc = napis.length
    println("Dlugosc napisu $dlugosc")

    print("pomidor czy truskawka")
    val owoc = readLine()
    when (owoc) {
        "pomidor" -> print("pomidor")
        "truskawka" -> print("truskawka")
        else -> print("To nie jest ani truskawka ani pomidor")
    }
}

