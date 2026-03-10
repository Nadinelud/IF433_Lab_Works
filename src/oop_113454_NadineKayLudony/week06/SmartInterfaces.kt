package oop_113454_NadineKayLudony.week06

interface SmartDevice{
    val id: String
    val name: String
}

interface Switchable{
    fun turnOn()
    fun turnOff()
}

interface Recordable{
    fun startRecord()
    fun stopRecord(){
        println("Rekaman berhenti dan disimpan di cloud")
    }
}