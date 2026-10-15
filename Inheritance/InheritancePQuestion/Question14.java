/*
Q14. Downcasting in Inheritance

Question:
Create a parent class Animal with a method
eat() that prints "Animal is eating".

Create a child class Dog that extends Animal
and has a method bark() that prints "Dog is barking".

In the main() method, create an Animal reference
that points to a Dog object.

Perform downcasting to convert the Animal
reference into a Dog reference.

Call both eat() and bark() using the Dog reference.

Expected Output:
Animal is eating
Dog is barking

Concept:
Downcasting means converting a parent class
reference into a child class reference.

Explicit casting is required for downcasting.
The actual object must be an instance of the
child class for the cast to succeed at runtime.
*/


package Inheritance.InheritancePQuestion;

class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{

    void bark(){
        System.out.println("Dog is barking");
    }
}

public class Question14 {
    public static void main(String[] args) {
        
        Animal a = new Dog();    // Upcasting

        Dog d = (Dog)a;         // Downcasting

        d.eat();
        d.bark();
    }
}
