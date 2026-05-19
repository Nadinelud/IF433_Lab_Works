package oop_113454_NadineKayLudony.week13

import java.io.File

fun main(){
    println("=== TEST WRITE TEXT ===")
    val file = File("notes.txt")
    file.writeText("Line 1: Inisialisasi Sistem \n")
    println("File berhasil ditulis")
}