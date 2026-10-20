package Polymorphism.RunTimePolymorphism;

/*
 * TOPIC: Introduction to Runtime Polymorphism
 *
 * DEFINITION:
 * Runtime polymorphism occurs when an overridden method is
 * selected at runtime based on the actual object.
 *
 * It is achieved through:
 * 1. Inheritance
 * 2. Method Overriding
 * 3. Dynamic Method Dispatch
 *
 * IMPORTANT:
 * Reference type determines which methods are accessible.
 * Actual object determines which overridden method executes.
 */

class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Introduction {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.sound();

        Animal dog = new Dog();
        dog.sound();
    }
}

/*
 * EXPECTED OUTPUT:
 *
 * Animal makes a sound
 * Dog barks
 */