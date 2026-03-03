package oop_113454_NadineKayLudony.week05

fun main(){
    val eWallet = EWallet("Nadine", 50000.0)
    val cc = creditCard("nadine", 100000.0)

    val paymentMethod: List<PaymentMethod> = listOf(eWallet, cc)

    for(method in paymentMethod){
        method.processPayment(75000.0)

        when(method){
            is EWallet -> {
                method.topUp(50000.0)
                method.processPayment(75000.0)
            }
        }
    }
}