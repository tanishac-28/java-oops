package Polymorphism.CompileTimePolymorphism;

/*
 * TOPIC: Tricky Method Overloading Interview Questions
 *
 * IMPORTANT RULES:
 *
 * 1. Exact match is preferred over widening.
 * 2. Widening is generally preferred over boxing.
 * 3. A more specific reference type is preferred.
 * 4. Passing null to unrelated reference types can cause ambiguity.
 * 5. Varargs is considered after applicable fixed-arity methods.
 */

class OverloadingDemo {

    // Case 1: Exact match vs widening
    void show(int number) {
        System.out.println("int method");
    }

    void show(double number) {
        System.out.println("double method");
    }

    // Case 2: More specific reference type
    void display(Object value) {
        System.out.println("Object method");
    }

    void display(String value) {
        System.out.println("String method");
    }

    // Case 3: Related reference types
    void print(Number value) {
        System.out.println("Number method");
    }

    void print(Integer value) {
        System.out.println("Integer method");
    }
}

public class TrickyMethodOverloading {

    public static void main(String[] args) {

        OverloadingDemo obj = new OverloadingDemo();

        obj.show(10);
        obj.display("Java");
        obj.display(null);
        obj.print(100);
    }
}

/*
 * EXPECTED OUTPUT:
 *
 * int method
 * String method
 * String method
 * Integer method
 */