package oop_113454_NadineKayLudony.week13

import java.io.File
import java.io.FileNotFoundException

data class Student(
    val name: String,
    val age: Int,
    val gpa: Double
)

fun Student.toCsv(): String = "$name, $age, $gpa"

fun fromCsv(line: String): Student{
    val parts = line.split(",")
    return Student(parts[0], parts[1].toInt(), parts[2].toDouble())
}

fun main(){
    val students = listOf(
        Student("Alice", 20, 3.8),
        Student("Bob", 22, 3.5),
    )
    saveStudents(students, "students.csv")

    val loaded = loadStudents("student.csv")
    println("=== LOADED STUDENT DATA ===")
    loaded.forEach { println(it) }
}