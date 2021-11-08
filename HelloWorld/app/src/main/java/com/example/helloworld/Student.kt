package com.example.helloworld

import org.json.JSONStringer

class Student(val sno: String, val grade: Int, name: String, age: Int): Person(name, age) {
    constructor(name: String, age: Int) : this("",0, name, age) {

    }
    constructor() : this("", 0) {

    }
}

class Stu : Person, Study {
    constructor(name: String, age: Int) : super(name, age) {

    }

    override fun readBook() {
        println("$name is reading")
    }
}

fun main() {
    val student1 = Student();
    val student2 = Student("frank", 20)
    val student = Student("123213", 3, "frank", 27)
    println("==============>")
    println(student1.toString())
    println(student2.toString())
    println(student.toString())
    println("==============>")
    val stu = Stu("frank", 18);
    study(null)
    println("==============>")
    val single = Singleton
    println(single.text())
    println("==============>")
    val a = null
    val b = 2
    var c = if (a != null) a else b
    println("c is $c")

    var d = a ?: b
    println("d is $d")
}

fun study(study: Study?) {
    study?.readBook()
    study?.doHomework()
}