package oop_113454_NadineKayLudony.week05

class EWallet(name: String, var balance: Double) : PaymentMethod(name) {
    override fun processPayment(amount: Double) {
        if(amount < balance) {
            balance -= amount
        } else {
            println("Saldo tidak cukup !")
        }
    }

    fun topUp(amount: Double){
        balance += amount
    }
}