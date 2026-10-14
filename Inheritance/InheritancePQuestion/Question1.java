/*
Q1. Basic Inheritance

Create a parent class Animal with an eat() method
that prints "Animal is eating".

Create a child class Dog that extends Animal.
Create a Dog object in main() and call the
inherited eat() method.
 */


package Inheritance.InheritancePQuestion;

class Animal{

    void eat(){
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal{

    void barks(){
        System.out.println("Dog barks...");
    }
}

public class Question1 {

    public static void main(String[] args) {

       Dog d = new Dog();
       d.eat(); 

    }
}


/*

OUTPUT:

Animal is eating...

*/