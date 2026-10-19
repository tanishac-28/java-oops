package Polymorphism.CompileTimePolymorphism;

/*
 * Topic: Primitive Widening in Method Overloading
 *
 * Definition:
 * Primitive widening means converting a primitive value
 * into another compatible primitive type.
 *
 * Examples:
 * byte -> short -> int -> long -> float -> double
 * char -> int -> long -> float -> double
 *
 * Important Rules:
 * 1. Java can widen a primitive argument automatically.
 * 2. An exact match is preferred over widening.
 * 3. When multiple overloads are applicable, Java applies
 *    method overload resolution rules.
 * 4. Widening from int to long is allowed, but narrowing
 *    from int to byte is not automatic.
 */

class NumberDemo {

    void show(long number) {
        System.out.println("Long method: " + number);
    }

    void show(double number) {
        System.out.println("Double method: " + number);
    }

    void display(int number) {
        System.out.println("Int method: " + number);
    }

    void display(double number) {
        System.out.println("Double method: " + number);
    }

    void print(char value) {
        System.out.println("Char method: " + value);
    }

    void print(int value) {
        System.out.println("Int method: " + value);
    }
}

public class PrimitiveWidening {

    public static void main(String[] args) {

        NumberDemo obj = new NumberDemo();

        // int widens to long
        obj.show(10);

        // Exact int match is preferred over widening to double
        obj.display(20);

        // Exact char match is preferred over widening to int
        obj.print('A');
    }
}

/*
 * Expected Output:
 *
 * Long method: 10
 * Int method: 20
 * Char method: A
 */