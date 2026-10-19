package Polymorphism.CompileTimePolymorphism;

/*
 * Topic: Varargs in Method Overloading
 *
 * Definition:
 * Varargs allows a method to accept a variable number
 * of arguments of the same type.
 *
 * Syntax:
 * returnType methodName(dataType... variableName)
 *
 * Rules:
 * 1. A method can have only one varargs parameter.
 * 2. The varargs parameter must be the last parameter.
 * 3. Varargs can accept zero, one, or multiple arguments.
 * 4. Fixed-arity methods are preferred over varargs methods
 *    when applicable in an earlier overload-resolution phase.
 */

class VarargsDemo {

    // Fixed-arity method
    void show(int number) {
        System.out.println("Fixed int method");
    }

    // Varargs method
    void show(int... numbers) {
        System.out.println("Varargs method");
    }

    // Varargs with a calculation
    void sum(int... numbers) {
        int total = 0;

        for (int number : numbers) {
            total += number;
        }

        System.out.println("Sum: " + total);
    }
}

public class Varargs {

    public static void main(String[] args) {

        VarargsDemo obj = new VarargsDemo();

        // Fixed-arity method is selected
        obj.show(10);

        // Varargs method is selected
        obj.show(10, 20);

        // Varargs accepts zero arguments
        obj.sum();

        obj.sum(10, 20, 30);
    }
}


/*
 * Expected Output:
 *
 * Fixed int method
 * Varargs method
 * Sum: 0
 * Sum: 60
 *
 * Interview Points:
 *
 * 1. show(10) selects show(int), not show(int...).
 * 2. show(10, 20) selects show(int...).
 * 3. sum() is valid because varargs can accept zero arguments.
 */