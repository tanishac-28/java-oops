/*Q29. Inheritance and Constructor Chaining

Problem Statement:

1. Create a parent class "Vehicle" with a constructor that prints ""Vehicle constructor"".
2. Create a child class "Car" that extends "Vehicle".
3. The constructor of "Car" should print ""Car constructor"".
4. In the "main()" method, create an object of the "Car" class.
5. Observe the order in which the constructors execute.

Expected Output:

Vehicle constructor
Car constructor
Vehicle method
Car method

Concepts Covered:

- Inheritance
- Constructor Chaining
- Parent and Child Constructor Execution Order
- "super()" and its role in constructor chaining
*/

package Inheritance.InheritancePQuestion;

class Vehicle{

    Vehicle(){
        System.out.println("Vehicle Constructor called");
    }

    void display(){
        System.out.println("Vehicle method");
    }
}

class Car extends Vehicle{
    Car(){
        System.out.println("Car constructor called");
    }

    void show(){
        System.out.println("Car method");
    }
}

public class Question29 {
    public static void main(String[] args) {
        
        Car c = new Car();

        c.display();
        c.show();
        
    }
}
