package com.company;

public class Perro {
    String name;
    String race;
    int age;
    String tall;

    public void features(){
        System.out.println("Hi, my names is " + this.name + ", I'am " +
                this.race + " I'm " + this.age + " years and I´m " + this.tall);
    }

    public void eat(){
        System.out.println("Wouf, I am eating");
    }

    public void sleep(){
        System.out.println("I´m sleeping, zzzzz");
    }
}
