package oop_113454_NadineKayLudony.week03

fun main(){
    val e = Employee("Nadine")

    e.salary = -1000
    e.salary = 50000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")
}