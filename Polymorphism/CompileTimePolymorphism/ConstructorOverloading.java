package Polymorphism.CompileTimePolymorphism;

/*
 * TOPIC: Constructor Overloading
 *
 * DEFINITION:
 * Constructor overloading means defining multiple constructors
 * in the same class with different parameter lists.
 *
 * Constructors can differ by:
 * 1. Number of parameters
 * 2. Types of parameters
 * 3. Order of parameter types
 *
 * IMPORTANT:
 * - Constructors do not have a return type.
 * - Constructors are called when objects are created.
 * - Java selects the matching constructor based on the arguments.
 */

class Person {

    String name;
    int age;

    // No-argument constructor
    Person() {
        name = "Unknown";
        age = 0;
    }

    // Constructor with one parameter
    Person(String name) {
        this.name = name;
        age = 0;
    }

    // Constructor with two parameters
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " - " + age);
    }
}

public class ConstructorOverloading {

    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person("Tanisha");
        Person p3 = new Person("Rahul", 21);

        p1.display();
        p2.display();
        p3.display();
    }
}

/*
 * EXPECTED OUTPUT:
 *
 * Unknown - 0
 * Tanisha - 0
 * Rahul - 21
 */