package oop_113454_NadineKayLudony.week11

fun main(){
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Nadien"
    val length = name?.let{
        println("Nama: $it")
        it.length
    }
    println("Panjang nama: $length")

    println("=== TEST RUN FUNCTION ===")
    val result = "kotlin".run{
        println("Memproses kata: ${this}")
        this.length * 2
    }
    println("Hasil kalkulasi run: $result")
}