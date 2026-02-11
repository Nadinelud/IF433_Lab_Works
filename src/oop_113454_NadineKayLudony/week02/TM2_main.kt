package oop_113454_NadineKayLudony.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    var enemy_hp = 500

    println("Nama Hero: ")
    val name = scanner.nextLine()

    val hero = Hero(name,hp = 500 )

    while(hero.isAlive()){
        println("1. Serang   2. Kabur")
        print("Pilih aksi anda: ")
        val choice = scanner.nextInt()

        if(choice == 1){
            hero.attack("Voldemort")
            enemy_hp -= 100

            println("Voldemort hp: $enemy_hp")

            if(enemy_hp > 0){
                hero.takeDamage((80..150).random())
                println("$name hp: ${hero.hp}")
            } else {
                break
            }
        } else if (choice == 2){
            break
        } else
            println("Aksi tidak tersedia")
    }

    if(hero.hp > enemy_hp)
        println("YOU WIN!")
    else
        println("YOU LOSE")
}