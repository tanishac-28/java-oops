package Polymorphism.RunTimePolymorphism;

/*
 * TOPIC: instanceof Operator
 *
 * DEFINITION:
 * The instanceof operator checks whether an object is an
 * instance of a particular class or implements a particular
 * interface.
 *
 * IMPORTANT:
 * 1. It returns true or false.
 * 2. It is useful before downcasting.
 * 3. It checks the actual object's type.
 * 4. null instanceof AnyClass returns false.
 */

class Animal {
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class InstanceOfOperator {

    public static void main(String[] args) {

        Animal animal = new Dog();

        System.out.println(animal instanceof Animal);
        System.out.println(animal instanceof Dog);
        System.out.println(animal instanceof Cat);

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.bark();
        }

        Animal anotherAnimal = null;
        System.out.println(anotherAnimal instanceof Animal);
    }
}

/*
 * EXPECTED OUTPUT:
 *
 * true
 * true
 * false
 * Dog barks
 * false
 */