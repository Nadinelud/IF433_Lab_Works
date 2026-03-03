package oop_113454_NadineKayLudony.week05

class creditCard(
    name: String,
    val limit: Double,
    var usedAmount: Double = 0.0
) : PaymentMethod(name) {
    override fun processPayment(amount: Double) {
        if(usedAmount + amount < limit){
            usedAmount += amount
            println("Berhasil bayar sebesar $amount")
        } else {
            println("CANCELED: Credit card reach limit !")
        }
    }
}