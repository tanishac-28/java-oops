/*
Topic: Abstract Class Without Abstract Methods

Definition:
An abstract class can contain zero abstract methods.
It can still have concrete methods and cannot be
instantiated directly.

Question 4: Abstract Class Without Abstract Methods

Requirements:
1. Create an abstract class named Vehicle.
2. Do not declare any abstract methods inside it.
3. Create a concrete method named start() that prints:
   "Vehicle starts"
4. Create a Car class that extends Vehicle.
5. In main(), create a Car object.
6. Call the start() method using the Car object.

Expected Output:
Vehicle starts
*/


package Abstraction;

abstract class Vehicle{

    // Concrete method
    void start(){
        System.out.println("Vehicle Starts");
    }
}

class Car extends Vehicle{

    //  Inherits the start() method from vehicle
}

public class AbstractClassWithoutAbstractMethod {
    public static void main(String[] args) {
        
        // Creating a Car object
        Car car = new Car();
        
        // calling the inherited method
        car.start();
    }
}
