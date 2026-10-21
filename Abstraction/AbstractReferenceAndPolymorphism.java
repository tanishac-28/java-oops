/*
Topic: Abstract Class Reference and Polymorphism

Definition:
An abstract class cannot be instantiated directly,
but its reference can point to an object of a concrete
child class. The overridden method is selected at runtime.

Question 5: Abstract Class Reference

Requirements:
1. Create an abstract class named Appliance.
2. Declare an abstract method named turnOn().
3. Create a concrete class named Fan that extends Appliance.
4. Implement turnOn() in Fan to print:
   "Fan is turned on"
5. Create an abstract class reference:
   Appliance appliance = new Fan();
6. Call turnOn() using the appliance reference.

Expected Output:
Fan is turned on
*/


package Abstraction;

abstract class Appliance{

    // Abstract method
    abstract void turnOn();
}

class Fan extends Appliance{

    // Implementing the abstract method
    @Override 
    void turnOn(){
        System.out.println("Fan is turned on");
    }
}

public class AbstractReferenceAndPolymorphism {
    public static void main(String[] args) {
        
        // Abstract class references pointing to Fan object
        Appliance appliance = new Fan();

        appliance.turnOn();
    }
}
