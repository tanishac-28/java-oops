package Polymorphism.RunTimePolymorphism;

/*
 * TOPIC: Covariant Return Type
 *
 * DEFINITION:
 * When a child class overrides a parent method, it can return
 * a more specific reference type than the parent method.
 *
 * QUICK REVISION:
 *
 * Parent return type : Animal
 * Child return type  : Dog
 * Condition          : Dog extends Animal
 *
 * VALID   : Animal -> Dog
 * INVALID : int -> long
 *
 * IMPORTANT RULES:
 * 1. Method name and parameters must match.
 * 2. Child return type must be a subtype of the parent return type.
 * 3. Primitive return types cannot be changed.
 *
 * INTERVIEW SHORTCUT:
 * Parent type -> Child type = Valid, if Child extends Parent.
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

class AnimalFactory {

    Animal getAnimal() {
        return new Animal();
    }
}

class DogFactory extends AnimalFactory {

    @Override
    Dog getAnimal() {
        return new Dog();
    }
}

public class CovariantReturnType {

    public static void main(String[] args) {

        DogFactory factory = new DogFactory();

        Dog dog = factory.getAnimal();

        dog.sound();
    }
}

/*
 * EXPECTED OUTPUT:
 *
 * Dog barks
 */