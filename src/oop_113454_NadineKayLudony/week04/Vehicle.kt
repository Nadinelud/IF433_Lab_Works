package oop_113454_NadineKayLudony.week04

open class Vehicle(val brand: String) {
    var speed: Int = 0
    open fun accelerate(){
        speed += 10
        println("$brand melaju dengan kecepatan $speed km/jam")
    }
    open fun honk(){
        println("Beep beeppp")
    }
}