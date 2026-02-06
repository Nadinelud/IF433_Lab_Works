package oop_113454_NadineKayLudony.week01

fun main(){
    val gameTitle: String
    val price: Int
    price = calculateDiscount(price = 500000)
    printReceipt(gameTitle = "Minecraft", price)
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000)
        price - (price * 20/100)
    else
        price - (price * 10/100)

fun printReceipt(gameTitle: String, price:Int){
    println(gameTitle)
    println("Price: Rp. $price")
}