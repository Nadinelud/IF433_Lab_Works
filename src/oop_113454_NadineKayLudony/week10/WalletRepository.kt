package oop_113454_NadineKayLudony.week10

import java.util.function.Predicate

class WalletRepository<T>  {
    private val items = mutableListOf<T>()
    fun add(item: T){
        items.add(item)
    }
    fun getAll(): List<T>{
        return items
    }
    fun search(predicate: (T) -> Boolean): List<T>{
        return items.filter(predicate)
    }

}