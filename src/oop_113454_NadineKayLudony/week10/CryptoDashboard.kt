package oop_113454_NadineKayLudony.week10

fun main (){
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 0.7))
    coinRepo.add(Coin("ETH", 0.45))
    coinRepo.add(Coin("USDT", 0.85))

    val response = ApiResponse("200 OK", coinRepo.getAll())

}