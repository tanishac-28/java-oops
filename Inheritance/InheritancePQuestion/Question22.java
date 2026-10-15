/*
Q22. Abstract Class with Constructor and Method Overriding

Question:
Create an abstract class Vehicle.

1. Add a constructor that prints "Vehicle constructor".
2. Add a concrete method start() that prints
   "Vehicle is starting".
3. Add an abstract method move().

Create a child class Car that extends Vehicle.

1. Add a constructor that prints "Car constructor".
2. Override the start() method to print "Car is starting".
3. Implement the move() method to print "Car is moving".

In the main() method:
1. Create a Vehicle reference pointing to a Car object.
2. Call start().
3. Call move().

Expected Output:
Vehicle constructor
Car constructor
Car is starting
Car is moving

Concept:
An abstract class can have constructors, concrete methods,
and abstract methods.

The parent constructor executes before the child constructor.
Overridden methods are selected according to the actual
object at runtime.
*/


package Inheritance.InheritancePQuestion;

abstract class Vehicle{
    Vehicle(){
        System.out.println("Vehicle constructor");
    }

    void start(){
        System.out.println("Vehicle is  starting");
    }

    abstract void move();
}

class Car extends Vehicle{
    Car(){
        System.out.println("Car constructor");
    }
    @Override 
    void start(){
        System.out.println("Car is starting");
    }
    @Override 
    void move(){
        System.out.println("Car is moving");
    }
    
}


public class Question22 {
    public static void main(String[] args) {
        
        Vehicle v = new Car();
        v.start();
        v.move(); 
    }
}
