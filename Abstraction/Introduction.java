/*
Topic: Abstraction — Introduction

Definition:
Abstraction means hiding implementation details
and showing only essential features.

Question 1: Create an Abstract Class

Requirements:
1. Create an abstract class named Animal.
2. Declare an abstract method sound().
3. Create a concrete method eat() that prints:
   "Animal eats"
4. Create a Dog class that extends Animal.
5. Override sound() in Dog to print:
   "Dog barks"
6. In the main() method:
   - Create an object of Dog.
   - Call eat().
   - Call sound().

Important:
- An abstract method has no body.
- A concrete child class must implement inherited
  abstract methods.
- Use @Override for the overridden method.

Expected Output:
Animal eats
Dog barks


*/

package Abstraction;

abstract class Animal{

    // Abstract method: no body
    abstract void sound();

    // Concrete method: Has a body
    void eat(){
        System.out.println("Animal eats...");
    }
}

class Dog extends Animal{

    // Implementing the abstract method
    @Override 
    void sound(){
        System.out.println("Dog barks...");
    }
}


public class Introduction {

    public static void main(String[] args) {
     
        Dog d = new Dog();

        d.eat();
        d.sound();
    }
}