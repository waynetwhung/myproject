package com.wayne

fun main(args: Array<String>) {
//    println("Hello Kotlin!");
    val human = Human();
    human.hello();
}

class Human{
    fun hello(){
        println("Hello Kotlin World!");
    }
}