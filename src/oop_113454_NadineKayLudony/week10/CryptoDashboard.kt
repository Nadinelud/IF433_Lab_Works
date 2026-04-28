package oop_113454_NadineKayLudony.week10

fun main (){
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 0.7))
    coinRepo.add(Coin("ETH", 0.45))
    coinRepo.add(Coin("USDT", 0.85))

    val response = ApiResponse("200 OK", coinRepo.getAll())
    response.data.forEach {println("Koin: $coinRepo") }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("01", 250000.0))
    txRepo.add(Transaction("02", 300000.0))
    txRepo.add(Transaction("03", -150000.0))

    txRepo.getAll().forEach { tx->
        println("ID: ${tx.id} || amount: ${tx.amount}")
    }
}