/*
Topic: Abstract Class — Abstract Method Implementation

Definition:
An abstract method has no body in the parent class.
A concrete child class must override and implement
all inherited abstract methods.

Question 3: Implement Multiple Abstract Methods

Requirements:
1. Create an abstract class named Shape.
2. Declare two abstract methods:
   - calculateArea()
   - displayShape()
3. Create a Circle class that extends Shape.
4. Implement both abstract methods in Circle.
5. In calculateArea(), print:
   "Calculating circle area"
6. In displayShape(), print:
   "Shape is Circle"
7. Create a Circle object in main().
8. Call both methods.

Expected Output:
Calculating circle area
Shape is Circle
*/


package Abstraction;

abstract class Shape{

    // Abstract class
    abstract void calculateArea();
    abstract void displayShape();
}

class Circle extends Shape{

    // Implementing the first abstract method
    @Override 
    void calculateArea(){
        System.out.println("Calculating circle area");
    }

    // Implementing the Second abstract method
    @Override 
    void displayShape(){
        System.out.println("Shape is Circle");
    }
}


public class AbstractMethodImplementation {
    public static void main(String[] args) {

        // Creating a circle object:    
        Circle circle = new Circle();

        // Calling implemented methods
        circle.calculateArea();
        circle.displayShape();
    }   
}
