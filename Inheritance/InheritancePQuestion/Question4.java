/*
Q3. Method Overriding

Create a parent class Person with an introduce()
method that prints "I am a person".

Create a child class Student that extends Person
and overrides introduce() to print "I am a student".

Create a Student object and call introduce().

Output:
I am a student
Cat meows

*/


package Inheritance.InheritancePQuestion;

class Animal{

    void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal{

    @Override 
    void sound(){
        super.sound();
        System.out.println("Cat meows");
    }
}


public class Question4 {
    public static void main(String[] args) {
        
        Cat c = new Cat();
        c.sound();
    }
}
