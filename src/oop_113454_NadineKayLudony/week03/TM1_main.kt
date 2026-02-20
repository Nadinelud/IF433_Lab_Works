package oop_113454_NadineKayLudony.week03

fun main(){
    val wp = Weapon()

    wp.damage = -50
    println(wp.tier + ", Damage: ${wp.damage}")
    wp.damage = 100
    println(wp.tier + ", Damage: ${wp.damage}")
    wp.damage = 600
    println(wp.tier + ", Damage: ${wp.damage}")
    wp.damage = 1200
    println(wp.tier + ", Damage: ${wp.damage}")
}