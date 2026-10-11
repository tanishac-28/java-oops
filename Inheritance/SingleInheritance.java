/*
Single Inheritance :-

Single inheritance is a type of inheritance in which
one child class inherits from one parent class.

The 'extends' keyword is used to achieve inheritance in Java.

Advantages:
1. Code reusability
2. Reduces code duplication
3. Easy code maintenance

Example:
Vehicle is the parent class.
Car is the child class.

Car inherits the 'brand' property and 'start()' method
from Vehicle, while 'model' and 'display()' belong to Car.

Thus, the Car object can access both inherited members
and its own members.
*/


package Inheritance;

// Parent class:-
class Vehicle{

    String brand = "Toyota";

    void start(){
        System.out.println("Vehicle is starting");
    }
}

// Child class :-
class Car extends Vehicle{
    
    String model = "Fortuner";

    void display(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.display();
    }    
}