package com.example.lekcjapierwsza


//fun main() {
//
//
//    var napis = readLine() ?: ""
//    var dlugosc = napis.length
//    println("Dlugosc napisu $dlugosc")
//
//    print("pomidor czy truskawka")
//    val owoc = readLine()
//    when (owoc) {
//        "pomidor" -> print("pomidor")
//        "truskawka" -> print("truskawka")
//        else -> print("To nie jest ani truskawka ani pomidor")
//    }
//}
//fun main(){
//    val nullableValue : String? = null
//    val valueOfString : String = nullableValue ?:"Tsdawsdaw"
//
//    println(valueOfString)
//
//    if (nullableValue==null){
//        "wafsjadnwjansd"
//    }else{
//        nullableValue
//    }
//    val summary = sumTwoNumbers(10,24)
//    println(summary)
//}
//
//
//
//
//fun addItem(list:List<String>){
//
//}
//fun sumTwoNumbers(x:Int,y:Int) :Int {
//    return x+y
//}

fun main() {




    data class Vegetable(val name: String, val age: Int, val originCountry: String) {


    }
    val w1 = Vegetable("Tomato", 10, "Spain")
    val w2 = Vegetable("Cabbage", 3, "Japan")
    val w3 = Vegetable("Cucumber", 11, "Great Britain")
    val warzywa = mutableListOf(w1, w2, w3)
    for (Vegetable in warzywa) {
        println(Vegetable.name)

    }
    val najstarsze = warzywa.maxBy { it.age }
        println(najstarsze)
    for (Vegetable in warzywa){
        println("${Vegetable.name} pochodzi z ${Vegetable.originCountry} i ma ${Vegetable.age} lat ")

    }
    }

