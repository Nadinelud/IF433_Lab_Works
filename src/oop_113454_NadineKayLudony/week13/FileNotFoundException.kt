package oop_113454_NadineKayLudony.week13

import java.io.File
import java.io.FileNotFoundException

fun saveStudents(students: List<Student>, path: String) {
    File(path).writeText(students.joinToString("\n"){it.toCsv()})
}

fun loadStudents(path: String): List<Student> {
    return try {
        File(path).readLines().map {fromCsv(it)}
    } catch (e: FileNotFoundException){
        println("Error: File not found")
        emptyList()
    }
}