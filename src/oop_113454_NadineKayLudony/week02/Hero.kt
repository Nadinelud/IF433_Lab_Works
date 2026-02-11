package oop_113454_NadineKayLudony.week02

class Hero(
    val name: String,
    val hp: Int,
    val damage: Int = 100
){
    fun attack (targetName: String) =
        println("$name attack $targetName!")

    fun takeDamage(damage: Int): Int =
        if (damage > hp)
            0
        else
            hp - damage

    fun isAlive(): Boolean =
        if (hp > 0)
            true
        else
            false
}