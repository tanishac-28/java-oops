package Polymorphism.RunTimePolymorphism;

/*
 * TOPIC: Dynamic Method Dispatch
 *
 * DEFINITION:
 * Dynamic Method Dispatch is the mechanism through which Java
 * determines at runtime which overridden method to execute.
 *
 * IMPORTANT:
 * 1. It requires inheritance and method overriding.
 * 2. A parent reference can refer to a child object.
 * 3. The actual object's overridden method executes at runtime.
 * 4. The reference type determines which methods are accessible.
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

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class DynamicMethodDispatch {

    public static void main(String[] args) {

        Animal animal1 = new Dog();
        animal1.sound();

        Animal animal2 = new Cat();
        animal2.sound();

        Animal animal3 = new Animal();
        animal3.sound();
    }
}

/*
 * EXPECTED OUTPUT:
 *
 * Dog barks
 * Cat meows
 * Animal makes a sound
 */