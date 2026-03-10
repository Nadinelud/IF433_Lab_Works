package oop_113454_NadineKayLudony.week06

fun main(){
    val lamp = SmartLamp("1","Ruang Tamu")
    val speaker = SmartSpeaker("1","Google Nest Dapur")
    val CCTV = SmartCCTV("1", "Ezviz Garasi")

    val hub = SmartHomeHub()
    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(CCTV)

    hub.activateSecurityMode()
    hub.turnOffAllSwitches()

}