package oop_113454_NadineKayLudony.week07

object DatabaseManager {
    var connectionStatus: String = "Disconnected"

    fun connect(){
        connectionStatus = "Connected to server"
        println("Database is ready")
    }
}