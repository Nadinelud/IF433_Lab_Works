package oop_113454_NadineKayLudony.week12

fun dispenseKibble(
    requestedGram: Int,
    availableGram: Int,
    isJammed: Boolean
): Int {
    require(requestedGram > 0){
        "Porsi kibble harus lebih dari 0 gr"
    }
    if(isJammed)
        throw DispenserJamException()
    if(requestedGram > availableGram)
        throw FoodEmptyException(requestedGram, availableGram)
    println("Kibble berhasil dikeluarkan!")
    return availableGram-requestedGram
}

fun main(){
    var currentKibbleStock = 50;

    try{
        dispenseKibble(80, currentKibbleStock)
    }catch (e: FoodEmptyException){
        println(e.message)
    }catch (e: DispenserJamException){
        println(e.message)
    }catch (e: Exception){
        println("Error: terjadi kesalahan tak terduga!")
    }
}