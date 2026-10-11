/*
Multiple Inheritance :-

Multiple inheritance occurs when one child class inherits
from two or more parent classes.

Java does not support multiple inheritance through classes
to avoid ambiguity when multiple parent classes have
methods with the same signature.

However, Java supports multiple inheritance through interfaces.

Example:
A class cannot extend two classes simultaneously,
but it can implement multiple interfaces.

Advantages:
1. Provides a way to combine multiple behaviours.
2. Promotes code reusability through interfaces.
*/

package Inheritance;

// Parent class 1
class A{
    void showA(){
        System.out.println("Parent A");
    }
}

// Parent class 2
class B{
    void showB(){
        System.out.println("Parent B");
    }
}

// Child Class
// Java does not allow : class C extends A , B

public class MultipleInheritance {
    public static void main(String[] args) {
        System.out.println("Java does not support multiple inheritance through classes");
    }
}
