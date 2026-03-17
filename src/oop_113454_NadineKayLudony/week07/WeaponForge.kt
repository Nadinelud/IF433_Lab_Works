package oop_113454_NadineKayLudony.week07

class Weapon private constructor(val item: GameItem, val durability: Int){
    companion object{
        fun forgeStarterSword(): Weapon{
            val item = GameItem("Pedang kayu", 5, ItemRarity.COMMON )
            return (Weapon(item, 50))
        }

        fun forgeEpicSword(): Weapon{
            val item = GameItem("Pedang Emas", 100, ItemRarity.EPIC )
            return Weapon(item, 200)
        }
    }
}