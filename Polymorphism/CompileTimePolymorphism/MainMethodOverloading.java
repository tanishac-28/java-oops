package Polymorphism.CompileTimePolymorphism;

/*
 * TOPIC: Main Method Overloading
 *
 * DEFINITION:
 * In Java, we can define multiple main() methods with different
 * parameter lists in the same class.
 *
 * IMPORTANT:
 * 1. The JVM starts execution from:
 *    public static void main(String[] args)
 *
 * 2. Overloaded main() methods are not automatically called
 *    by the JVM.
 *
 * 3. We can call overloaded main() methods explicitly.
 */

public class MainMethodOverloading {

    public static void main(String[] args) {

        System.out.println("Original main method");

        main(10);
        main("Java");
    }

    // Overloaded main method with int parameter
    public static void main(int number) {
        System.out.println("Integer main: " + number);
    }

    // Overloaded main method with String parameter
    public static void main(String text) {
        System.out.println("String main: " + text);
    }
}

/*
 * EXPECTED OUTPUT:
 *
 * Original main method
 * Integer main: 10
 * String main: Java
 */