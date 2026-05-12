package oop_113454_NadineKayLudony.week12

fun main(){
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }

    val safeValue = result.getOrElse { -1 }
    println("Safe value: $safeValue")

    val recovered = result.recover { 0 }.getOrNull()
    println("Recovered value: $recovered")
}