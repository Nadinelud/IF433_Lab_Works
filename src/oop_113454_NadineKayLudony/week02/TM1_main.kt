package oop_113454_NadineKayLudony.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    println("--- SISTEM PINJAM BUKU ---")
    print("Judul buku: ")
    val judul = scanner.nextLine()
    print("Peminjam: ")
    val borrower = scanner.nextLine()
    print("Lama pinjam (Lebih dari 1): ")
    var durasi = scanner.nextInt()
    if(durasi < 1) durasi = 1

    scanner.nextLine()

    val loan = Loan(judul, borrower, durasi)

    println("--- DETAIL PINJAMAN ---")
    println("Judul buku: $judul")
    println("Peminjam: $borrower")
    println("Lama pinjam: $durasi")
    println("Denda: Rp.${loan.calculateFine()}")

}