package Polymorphism.CompileTimePolymorphism;

/*
 * Topic: Method Overloading
 *
 * Definition:
 * Method overloading allows multiple methods in the same class
 * to have the same name but different parameter lists.
 *
 * Methods can be overloaded by changing:
 * 1. Number of parameters.
 * 2. Types of parameters.
 * 3. Order of parameter types.
 *
 * Changing only the return type or parameter names
 * does not achieve method overloading.
 */

class Calculator {

    // Different number of parameters
    void add(int a, int b) {
        System.out.println("Sum of two numbers: " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum of three numbers: " + (a + b + c));
    }

    // Different parameter types
    void show(int number) {
        System.out.println("Integer: " + number);
    }

    void show(double number) {
        System.out.println("Double: " + number);
    }

    // Different order of parameter types
    void display(int number, String text) {
        System.out.println(number + " " + text);
    }

    void display(String text, int number) {
        System.out.println(text + " " + number);
    }
}

public class MethodOverloading {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.add(10, 20);
        calculator.add(10, 20, 30);

        calculator.show(100);
        calculator.show(10.5);

        calculator.display(1, "Java");
        calculator.display("Java", 2);
    }
}