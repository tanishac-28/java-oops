package Inheritance.InheritancePQuestion;

/*
Q35. Find and Fix the Error
Topic: Inheritance and Constructor Chaining

QUESTION — WRONG CODE:

class Parent {
    Parent(int x) {
        System.out.println("Parent: " + x);
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
    }
}

ERROR EXPLANATION:

1. Parent class mein sirf parameterized constructor hai.
2. Parent class mein no-argument constructor available nahi hai.
3. Child constructor mein explicitly super(...) nahi likha hai.
4. Java implicitly super() call karta hai.
5. Parent class mein Parent() available nahi hone ke karan
   compilation error aata hai.

--------------------------------------------------

CORRECT CODE:
*/

class Parent {
    Parent(int x) {
        System.out.println("Parent: " + x);
    }
}

class Child extends Parent {

    Child() {
        super(10); // Calls the parameterized parent constructor
        System.out.println("Child constructor");
    }
}

public class Question35 {
    public static void main(String[] args) {
        Child c = new Child();
    }
}

/*
OUTPUT:

Parent: 10
Child constructor

CONCEPTS COVERED:
1. Inheritance
2. Parameterized Constructor
3. Constructor Chaining
4. super()
5. Compilation Errors

INTERVIEW POINT:

If the parent class does not have a no-argument constructor,
the child constructor must explicitly call an available
parent constructor using super(arguments).
*/