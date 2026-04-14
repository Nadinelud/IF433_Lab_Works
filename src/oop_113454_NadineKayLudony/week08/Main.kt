package oop_113454_NadineKayLudony.week08

fun main(){
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota tidak diketahui"
    println("Tujuan pengiriman: $destination")

    println("\n=== TEST LET BLOCK ===")
    val validOrder = Order(null, 250000)

    val receipt = validOrder.totalPrice?.let{ price ->
        val tax = price * 0.11
        "Transaksi valid. Harga Rp$price, Pajak: Rp$tax"
    }?: "Transaksi harga belum di-set"

    println("=== TEST SAFE CASTING ===")
    val mixedData: List<Any> = listOf(
        "Samrtphone",
        150000,
        UserProfile("Andi", null)
        "Laptop",
        4500000.0
    )
}