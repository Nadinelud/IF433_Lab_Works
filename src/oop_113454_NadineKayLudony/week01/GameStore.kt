package oop_113454_NadineKayLudony.week01

fun main(){
    val gameTitle: String = "Minecraft"
    val price: Int = 300000
}

fun calculateDiscount(price: Int): Double =
    if (price > 500000)
        price - (price * 0.2)
    else
        price - (price * 0.1)