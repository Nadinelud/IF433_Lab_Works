package oop_113454_NadineKayLudony.week04

fun main(){
    val manager = Manager("Nadine", 1500000)
    manager.work()
    manager.calculateBonus()

    val developer = Developer("Alto", 1000000, "Kotlin")
    developer.work()
    developer.calculateBonus()
}