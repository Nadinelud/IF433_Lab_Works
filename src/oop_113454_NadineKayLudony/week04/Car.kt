package oop_113454_NadineKayLudony.week04

class Car (brand: String, val numberOfDoors: Int): Vehicle(brand){
    fun openTrunk(){
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }
}