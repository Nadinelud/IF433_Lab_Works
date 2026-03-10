package oop_113454_NadineKayLudony.week06

class Button(override val name: String): Clickable {
    override fun click() {
        println("Tombol $name berhasil diklik")
    }
}