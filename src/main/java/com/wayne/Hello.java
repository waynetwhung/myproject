package com.wayne;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        new Person().hello();
        Person person = new Person();
        person.hello();
        person.weight = 66.5f;
        person.height = 1.7f;
        System.out.println(person.bmi());
    }
}
