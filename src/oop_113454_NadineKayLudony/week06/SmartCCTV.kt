package oop_113454_NadineKayLudony.week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("CCTV $name menyala")
        startRecord()
    }
    override fun turnOff() {
        println("CCTV $name dimatikan")
    }
    override fun startRecord() {
        println("CCTV $name Recording...")
    }
}