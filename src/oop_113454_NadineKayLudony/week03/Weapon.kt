package oop_113454_NadineKayLudony.week03

class Weapon {
    private var name: String = "NPC"
    var damage: Int = 0
        set(value){
            if (value < 0){
                println("Damage not valid")
            } else if (value > 1000){
                println("Damage overpower. Set damage to 1000")
                field = 1000
            } else {
                println("Damage: $value")
                field = value
            }
        }

    val tier: String
        get() {
            return if(damage > 800){
                "Legendary"
            } else if(damage > 500) {
                "Epic"
            } else {
                "Common"
            }
        }


}