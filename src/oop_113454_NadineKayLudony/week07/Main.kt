package oop_113454_NadineKayLudony.week07

fun main(){
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1)
    println("Sama? ${reg1 == reg2}")

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println(data1)
    println("Sama? ${data1 == data2}")

    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")

    val (username, userAge) = data1
    println("Destructured: $username berumur $userAge")

    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")
    val uiMessage = when(response){
        is ApiResponse.Success -> "Tempilkan: ${response.data}"
        is ApiResponse.Error -> "Muncul alert: ${response.message}"
        ApiResponse.Loading -> "Loading..."
    }

    println("\n === GAME ===")
    GameManager.startGame()
    GameManager.startGame()
    println("LEGENDARY CHANCE: ${ItemRarity.LEGENDARY}")
    val weapon = Weapon.forgeStarterSword()
    println(weapon.item)

    val upgradedWeapon = weapon.item.copy(damage = 15)
    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedWeapon))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))

}