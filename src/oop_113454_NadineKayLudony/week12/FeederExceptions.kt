package oop_113454_NadineKayLudony.week12

sealed class FeederExceptions(msg: String): Exception(msg)

class FoodEmptyException(requested: Int, available: Int): FeederExceptions("Kibble tidak cukup! Diminta $requested gr, sisa $available gr")

class DispenserJamException: FeederExceptions("Dispenser macet!")