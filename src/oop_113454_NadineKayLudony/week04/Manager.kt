package oop_113454_NadineKayLudony.week04

class Manager(name: String, baseSalary: Int): Employee(name, baseSalary) {
    override fun work(){
        println("$name sedang memimpin rapat")
    }

    override fun calculateBonus(): Int {
        return super.calculateBonus() + 500000
    }
}