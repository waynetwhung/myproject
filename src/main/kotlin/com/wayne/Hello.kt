package com.wayne

fun main(args: Array<String>) {
//    println("Hello Kotlin!");
//    Human().hello();
    val human = Human(66.5f, 1.7f);
    human.hello();
    println(human.bmi());
}

class Human(var weight:Float, var height:Float){
    fun bmi() : Float {
        val bmi = weight / (height*height);
        return bmi;
    }

    fun hello(){
        println("Hello Kotlin World!");
    }
}