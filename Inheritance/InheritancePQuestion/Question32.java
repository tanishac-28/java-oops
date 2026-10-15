package Inheritance.InheritancePQuestion;

/* 
Q32. Method Overriding and Private Methods

Problem Statement

Given a parent class "Parent" with a private method "display()" and a child class "Child" that attempts to override it using the "@Override" annotation.

Identify the compilation error and correct the code.

Original Code (Compilation Error)

class Parent {
    private void display() {
        System.out.println("Parent display");
    }
}

class Child extends Parent {
    @Override
    public void display() {
        System.out.println("Child display");
    }
}

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}

// Reason for the Error

// The "display()" method in "Parent" is private, so it is not inherited by "Child". Therefore, the method in "Child" does not override the parent method, and the "@Override" annotation causes a compilation error.

// Corrected Code

*/


class Parent {
    public void display() {
        System.out.println("Parent display");
    }
}

class Child extends Parent {
    @Override
    public void display() {
        System.out.println("Child display");
    }
}

public class Question32 {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}

// Output

// Child display

// Concepts Covered

// - Inheritance
// - Method Overriding
// - "private" and "public" access modifiers
// - "@Override" annotation
// - Compilation errors