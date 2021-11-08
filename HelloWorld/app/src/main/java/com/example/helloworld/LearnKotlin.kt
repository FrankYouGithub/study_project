package com.example.helloworld

import java.lang.Math.max


fun main(){
    val a = 10
    val b = 20
    val maxVal = largerNumber(a, b)
    println("the larger number is : $maxVal")
    println("thie score is :" + getScore("Tim"))
    // 不可变集合
    val list = listOf<String>("apple", "banana", "orange", "pear", "grape")
    val newList = list.filter { it.length <= 5 }.map { it.uppercase() }
    for (fluit in newList) {
        println(fluit)
    }
    val anyResult = list.any { it.length >= 5 }
    val allResult = list.all { it.length >= 5 }
    println("anyResult is : $anyResult , allResult is : $allResult")
    println("-------------------------------------------------")
    // 可变集合
    val list1 = mutableListOf<String>("apple", "banana", "orange", "pear", "grape")
    list1.add("test")
    for (fluit in list1) {
        println(fluit)
    }
    println("-------------------------------------------------")
    // set
    val setList = mutableSetOf<String>("apple", "banana", "apple", "banana")
    setList.add("orange")
    for (fluit in setList) {
        println(fluit)
    }
    // map
    println("-------------------------------------------------")
    val mapList = HashMap<String, Int>()
    mapList.put("apple", 1)
    mapList.put("apple", 2)
    mapList.put("orange", 3)
    mapList.put("banana", 4)
    for ((key, value)in mapList) {
        println("$key -> $value")
    }
    println("-------------------------------------------------")
    Thread {
        println("thread is runing")
    }.start()
}


fun largerNumber(num1: Int, num2:Int): Int = if (num1 > num2) num1 else num2

fun getScore(name: String) = when {
    name == "Tom" -> 80
    name == "Tim" -> 90
    name == "Frank" -> 85
    name == "Jack" -> 50
    else -> 0
}