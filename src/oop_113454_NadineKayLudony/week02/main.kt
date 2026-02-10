package oop_113454_NadineKayLudony.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ----")

    print("Masukkan nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine()

    if(nim.length != 5) {
        println("ERROR: Pendaftaran batal. NIM tidak valid")
    } else {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        val s1 = student(name, nim, major)
        println("Status: Pendaftaran selesai")
    }
}