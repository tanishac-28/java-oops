/*
Topic: Abstract Class — super Keyword

Definition:
The super keyword can call a concrete method from the
parent class. An abstract class can contain both abstract
and concrete methods.

Question 10: Calling Parent Method Using super

Requirements:
1. Create an abstract class named Machine.
2. Declare an abstract method named start().
3. Create a concrete method named displayInfo() that prints:
   "This is a machine"
4. Create a class named WashingMachine that extends Machine.
5. Implement start() to print:
   "Washing machine started"
6. Override displayInfo() in WashingMachine.
7. Inside the overridden method, call super.displayInfo().
8. Then print:
   "Type: Washing Machine"
9. Create a WashingMachine object in main().
10. Call start() and displayInfo().

Expected Output:
Washing machine started
This is a machine
Type: Washing Machine
*/


package Abstraction;

abstract class Machine{

    abstract void start();

    void displayInfo(){
        System.out.println("This is a Machine");
    }
}

class WashingMachine extends Machine{

    @Override 
    void start(){
        System.out.println("Washing Machine started");
    }

    @Override 
    void displayInfo(){
        
        super.displayInfo();

        System.out.println("Type: Washing Machine");
    }
}

public class AbstractClassSuperKeyword {
    public static void main(String[] args) {
        
        WashingMachine wamac = new WashingMachine();
        
        wamac.start();
        wamac.displayInfo();
    }
}
