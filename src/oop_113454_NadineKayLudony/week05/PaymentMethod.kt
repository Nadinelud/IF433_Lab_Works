package oop_113454_NadineKayLudony.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}