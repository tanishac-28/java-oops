package Polymorphism.RunTimePolymorphism;

/*
 * TOPIC: Method Overriding
 *
 * DEFINITION:
 * Method overriding occurs when a child class provides its own
 * implementation of an inherited instance method with a
 * compatible method signature.
 *
 * RULES:
 * 1. Inheritance is required.
 * 2. The method name and parameter list must match.
 * 3. The return type must be the same or covariant.
 * 4. Access visibility cannot be reduced.
 * 5. Static methods are hidden, not overridden.
 * 6. Private methods are not overridden.
 */

class Vehicle {

    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with a button");
    }
}

public class MethodOverriding {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.start();

        Car car = new Car();
        car.start();

        Vehicle vehicle2 = new Car();
        vehicle2.start();
    }
}

/*
 * EXPECTED OUTPUT:
 *
 * Vehicle starts
 * Car starts with a button
 * Car starts with a button
 */