package oop_113454_NadineKayLudony.week11

fun main(){
    val homeDevices = mutableListOf<SmartDevice>()
    SmartDevice("Philips Wiz Living Room", "Smart Lamp").apply{
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }

    SmartDevice("Ezviz Outdoor", "Camera").apply{
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera Terhubung")
        homeDevices.add(it)
    }
}