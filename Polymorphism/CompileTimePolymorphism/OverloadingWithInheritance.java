package Polymorphism.CompileTimePolymorphism;

/*
 * TOPIC: Method Overloading with Inheritance
 *
 * DEFINITION:
 * A child class can inherit overloaded methods from its parent
 * class and can also define its own overloaded methods.
 *
 * IMPORTANT:
 * 1. Overloading is resolved at compile time.
 * 2. The compiler selects a method based on argument types.
 * 3. A child class can overload an inherited method.
 */

class Parent {

    void display(int number) {
        System.out.println("Parent int: " + number);
    }

    void display(String text) {
        System.out.println("Parent String: " + text);
    }
}

class Child extends Parent {

    // Overloading an inherited method
    void display(double number) {
        System.out.println("Child double: " + number);
    }
}

public class OverloadingWithInheritance {

    public static void main(String[] args) {

        Child obj = new Child();

        obj.display(10);
        obj.display("Java");
        obj.display(5.5);
    }
}

/*
 * EXPECTED OUTPUT:
 *
 * Parent int: 10
 * Parent String: Java
 * Child double: 5.5
 */
