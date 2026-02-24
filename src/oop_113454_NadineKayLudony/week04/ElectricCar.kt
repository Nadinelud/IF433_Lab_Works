package oop_113454_NadineKayLudony.week04

class ElectricCar(
    brand: String,
    numberOfDoors: Int,
    batteryCapacity: Int
): Car(brand, numberOfDoors) {
    final override fun accelerate() {
        println("\$brand\n berakselerasi dalam sunyi. Kapasitas baterai: \$batteryCapacity%.")
    }
}