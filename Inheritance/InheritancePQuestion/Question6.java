/*
Q6. Hierarchical Inheritance

Create a parent class Shape with a display()
method that prints "This is a shape".

Create two child classes Circle and Rectangle
that extend Shape.

Create objects of both child classes and call
the display() method.

Output:
This is a shape
This is a shape
*/


package Inheritance.InheritancePQuestion;

class Shape{
    void display(){
        System.out.println("This is a shape");
    }
}

class Circle extends Shape{
    // Inherits display() from shape
}

class Rectangle extends Shape{
    // Inherits display() from shape   
}


public class Question6 {

    public static void main(String[] args) {
        
        Circle c = new Circle();
        c.display();

        Rectangle r = new Rectangle();
        r.display();
    }
}