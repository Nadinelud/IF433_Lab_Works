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

    println("Pilih jalur (1. Reguler, 2. Umum): ")
    val type = scanner.nextInt()
    scanner.nextLine()

    if(type == 1){
        print("Masukkan jurursan: ")
        val major = scanner.nextLine()

        val s1 = student(name, nim, major)
        println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
    } else if (type == 2){
        val s2 = student(name, nim)
        println("Terdaftar di ${s2.major} dengan GPA awal: ${s2.gpa}")
    } else {
        println("Pilih yang bener!")
    }
}