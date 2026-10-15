/*
Q23. Abstract Class vs Concrete Class — Compilation Error

Question:
Create an abstract class Shape with:
1. An abstract method area().
2. A concrete method display() that prints
   "Calculating area".

Create a child class Circle that extends Shape.

Inside Circle:
1. Override area() to print "Area of Circle".
2. Do not create any other methods.

In the main() method:
1. Create a Shape reference pointing to a Circle object.
2. Call display().
3. Call area().

Now answer these questions:
1. Will the code compile successfully?
2. Why can we create a Circle object even though
   Shape is abstract?
3. What happens if Circle does not implement area()
   and is not declared abstract?

Expected Output:
Calculating area
Area of Circle

Concept:
A concrete child class must implement all inherited
abstract methods. Otherwise, the child class must
also be declared abstract.
*/


package Inheritance.InheritancePQuestion;

abstract class Shape{


    abstract void area();

    void display(){
        System.out.println("Calculating area");
    }
}

class Circle extends Shape{

    @Override 
    void area(){
        System.out.println("Area of circle");
    }
}

public class Question23 {
    public static void main(String[] args) {
        
        Shape s = new Circle();
        s.display();
        s.area();
    }
}
