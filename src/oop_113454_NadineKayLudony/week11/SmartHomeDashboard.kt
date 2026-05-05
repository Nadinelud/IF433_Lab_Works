package oop_113454_NadineKayLudony.week11

fun main(){
    val homeDevices = mutableListOf<SmartDevice>()
    SmartDevice("Philips Wiz Living Room", "Smart Lamp").apply{
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }

    SmartDevice(
        "Ezviz Outdoor",
        "Camera",
        true,
        5
    ).also {
        println("(LOG) Kamera Terhubung")
        homeDevices.add(it)
    }

    val ac = run{
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
    }
    homeDevices.add(ac)
    homeDevices.add(SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10))

    val searchResult = homeDevices.find {
        it.category == "Camera"
    }
    searchResult?.let {
        println(it.diagnose())
    }

    with(homeDevices){
        println("total Perangkat: ${this.size}")
    }

    val totalPower = homeDevices.run { sumOf { it.powerLoad } }
}