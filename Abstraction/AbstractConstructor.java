/*
Topic: Abstract Class Constructor

Definition:
An abstract class can have a constructor.
When a child class object is created, the parent
constructor executes before the child constructor.

Question 2: Constructor Execution

Requirements:
1. Create an abstract class named Animal.
2. Add a constructor that prints:
   "Animal constructor"
3. Create a Dog class that extends Animal.
4. Add a Dog constructor that prints:
   "Dog constructor"
5. In main(), create an object of Dog.

Expected Output:
Animal constructor
Dog constructor
*/


package Abstraction;

abstract class Animal{

    // Constructor of Parent class
    Animal(){
        System.out.println("Animal Constructor");
    }
}

class Dog extends Animal{

    // Constructor of Child class
    Dog(){
        System.out.println("Dog Constructor");
    }
}


public class AbstractConstructor {
    public static void main(String[] args) {
        
        // Creating an object of Dog
        Dog d = new Dog();
    }
}
