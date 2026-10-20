package Polymorphism.RunTimePolymorphism;

/*
 * TOPIC: Upcasting
 *
 * DEFINITION:
 * Upcasting means storing a child class object in a parent
 * class reference.
 *
 * IMPORTANT:
 * 1. Upcasting can happen implicitly.
 * 2. A parent reference can access only members available
 *    through the parent class at compile time.
 * 3. If a method is overridden, the child's implementation
 *    executes at runtime.
 * 4. Upcasting is commonly used in runtime polymorphism.
 */

class Animal {

    void eat() {
        System.out.println("Animal eats");
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void fetch() {
        System.out.println("Dog fetches the ball");
    }
}

public class Upcasting {

    public static void main(String[] args) {

        // Upcasting: Dog object assigned to Animal reference
        Animal animal = new Dog();

        animal.eat();
        animal.sound();

        // animal.fetch(); // Compilation error
    }
}

/*
 * EXPECTED OUTPUT:
 *
 * Animal eats
 * Dog barks
 */