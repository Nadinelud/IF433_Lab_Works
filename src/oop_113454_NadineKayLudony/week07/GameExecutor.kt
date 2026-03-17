package oop_113454_NadineKayLudony.week07

fun processEvent(event: BattleState){
    when(event){
        is BattleState.GameOver ->{
            println("Mati karena ${event.reason}")
        }
        is BattleState.LootDropped -> {
            println("Item ${event.item} rarity ${event.item.rarity} dropped")
        }
        is BattleState.MonsterEncounter -> {
            println("${event.monsterName} muncul")
        }
        BattleState.SafeZone -> {
            println("AMAN")
        }
    }

}