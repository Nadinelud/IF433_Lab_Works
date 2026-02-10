package oop_113454_NadineKayLudony.week02

class student(val name: String, val nim: String, val major: String){
    init{
        if(nim.length != 5){
            println("WARNING: NIM $nim TIDAK VALID!")
            println("Data mahasiswa $name akan menjadi tidak valid!")
        } else {
            println("LOG: Student $name berhasil ditambahkan")
        }
    }
}