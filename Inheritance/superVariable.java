/*
super Keyword - Accessing Parent Class Variable

The 'super' keyword in Java refers to the immediate
parent class object.

When the parent and child classes have variables
with the same name, the 'super' keyword is used
to access the parent class variable.

Without 'super', the child class variable is accessed
when the variable is declared in the child class.

Example:
Parent Class: Vehicle
Child Class: Car

Both classes contain a variable named 'color'.

The 'super.color' expression accesses the color
variable declared in the parent class.

Advantages:
1. Accesses parent class variables.
2. Resolves confusion when parent and child classes
   have variables with the same name.

Important:
'super.color' is not a new variable.
It accesses the existing variable of the parent class.
*/


package Inheritance;

// Parent class
class Vehicle{

    String color = "White";
}

// Child class 
class Car extends Vehicle{
    String color = "Black";

    void display(){
        System.out.println("Car color: " + color);
        System.out.println("Vehicle color: " + super.color );
    }
}

public class superVariable {
    public static void main(String[] args) {
        
        Car car = new Car();
        car.display();
    }
}