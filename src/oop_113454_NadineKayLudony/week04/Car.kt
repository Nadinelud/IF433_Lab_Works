package oop_113454_NadineKayLudony.week04

open class Car (brand: String, val numberOfDoors: Int): Vehicle(brand){
    fun openTrunk(){
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }
    override fun honk(){
        println("TIN TINN Mobil $brand lewatttt")
    }

    override fun accelerate() {
        super.accelerate()
        println("Mobil $brand menggunakan transmisi gigi untuk menambah kecapatan.")
    }
}