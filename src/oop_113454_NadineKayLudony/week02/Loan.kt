package oop_113454_NadineKayLudony.week02

class Loan (
    val title: String,
    val borrower: String,
    var duration: Int = 1
){
    fun calculateFine(): Int =
        if (duration > 3){
            (duration - 3) * 2000
        } else {
            0
        }
}