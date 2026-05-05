package oop_113454_NadineKayLudony.week11

fun main(){
    println("=== TEST EXTENSION FUNCTIONS ===")
    println("Alexs".addGreeting())
    println("Hi ".repeatTimes(3))

    val text: String? = null
    println("Apakah null? ${text.isNullorEmptyCustom()}")

    println("=== TEST RUN FUNCTION ===")
    val result = "kotlin".run{
        println("Memproses kata: ${this}")
        length * 2
    }
    println("Hasil kalkulasi run: $result")

    println("=== TEST APPLY ===")
    val user = User().apply {
        name = "Alex"
        age = 25
    }
    println(user)

    println("=== TEST ALSO ===")
    val numbers = mutableListOf(1,2,3)
    numbers.also{
        println("Log sebelum ditambah $it")
    }.add(4)
    println("Setelah ditambah: $numbers")

    println("===TEST WITH ===")
    with(user){
        println("User detail -> name: $name, umur: $age")
    }

    val newUser = User("Budi", 20).apply {
        age = 21
    }.also{
        println("User baru berhasil dibuat: $it")
    }
}