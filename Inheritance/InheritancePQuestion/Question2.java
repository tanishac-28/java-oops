/*
Q2. Method Inheritance

Create a parent class Vehicle with a start()
method that prints "Vehicle is starting".

Create a child class Car that extends Vehicle.
Create a Car object and call the inherited
start() method.

Output:
Vehicle is starting
*/


package Inheritance.InheritancePQuestion;

class Vehicle{

    void start(){
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle{
    // Inherits start() from vehicle
}


public class Question2 {
    public static void main(String[] args) {
        
        Car c = new Car();
        c.start();
    }
}



