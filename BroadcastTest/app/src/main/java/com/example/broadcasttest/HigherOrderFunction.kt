package com.example.broadcasttest

import kotlin.text.StringBuilder

fun num1AndNum2(num1: Int, num2: Int, operation: (Int, Int) -> Int): Int {
    val result = operation(num1, num2)
    return result
}

fun plus(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun minus(num1: Int, num2: Int) : Int {
    return num1 - num2
}

fun main() {
    val num1 = 100
    val num2 = 50
    val result1 = num1AndNum2(num1, num2, ::plus)
    val result2 = num1AndNum2(num1,num2,::minus)
    println(result1)
    println(result2)




    val list = listOf<String>("apple", "banana", "orange", "pear", "grape")
    val result = StringBuilder().build {
        append("Start eat fruits. \n")
        for (fruit in list) {
            append(fruit).append("\n")
        }
        append("eat all finish")
    }
    println(result)


    val res3 = StringBuilder().apply {
        append("Start eat fruits. \n")
        for (fruit in list) {
            append(fruit).append("\n")
        }
        append("eat all finish")
    }
    println(res3.toString())
}

fun StringBuilder.build(block: StringBuilder.() -> Unit) : StringBuilder {
    block()
    return this
}