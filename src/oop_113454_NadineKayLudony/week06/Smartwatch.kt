package oop_113454_NadineKayLudony.week06

class Smartwatch: Watch(), BluetoothConnectable, Rechargeable {
    override fun showTime() {
        println("Layar OLED menyala: 14:00 WIB")
    }

    override fun connectToBluetooth() {
        println("Mencari koneksi...")
    }

    override fun chargeBattery() {
        println("Mengisi batre")
    }
}