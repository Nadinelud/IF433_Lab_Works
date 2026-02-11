package oop_113454_NadineKayLudony.week02

class Hero(
    val name: String,
    var hp: Int,
    var damage: Int = 100
){
    fun attack (targetName: String, ) =
        println("$name attack $targetName!")

    fun takeDamage(damage: Int): Int {
        println("$name take $damage damage")
        if (damage > hp)
            hp = 0
        else
            hp -= damage
        return hp
    }

    fun isAlive(): Boolean =
        if (hp > 0)
            true
        else
            false
}