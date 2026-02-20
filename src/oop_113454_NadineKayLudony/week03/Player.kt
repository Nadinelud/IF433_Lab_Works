package oop_113454_NadineKayLudony.week03

class Player {
    var username: String = "Dinalud"
    private var xp: Int = 0
    val level: Int
        get() = (xp/100) + 1

    fun addXp(amount: Int){
        if(amount < 0){
            println("Xp tidak valid!")
        } else {
            val currLevel = level
            xp += amount
            if(level > currLevel){
                println("Level Up! Selamat $username naik ke level $level")
            } else {
                println("Add $amount xp. Level: $level")
            }
        }


    }
}