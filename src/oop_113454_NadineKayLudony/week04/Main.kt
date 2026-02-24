package oop_113454_NadineKayLudony.week04

fun main(){
    println("--- Testing Vehicle ---")
    val generateVehicle = Vehicle("Avanza")
    generateVehicle.honk()
    generateVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Xpander", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()
}