package oop_113454_NadineKayLudony.week11

fun main(){
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Nadien"
    val length = name?.let{
        println("Nama: $it")
        it.length
    }
    println("Panjang nama: $length")
}