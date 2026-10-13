/*
==================================================
CONCEPT: DOWNCASTING IN JAVA
==================================================

Definition:
Downcasting means converting a Parent class reference
into a Child class reference.

Syntax:
Child reference = (Child) parentReference;

RULES:
1. Explicit casting is required.
2. Downcasting is safe when the reference points
   to an object of the target Child class.
3. Incorrect downcasting can cause
   ClassCastException at runtime.
4. Use instanceof to check the object's type
   before downcasting.
*/


package Inheritance;

// Parent class
class AnimalDown{

    void eat(){
        System.out.println("Animal is eating....");
    }
}

// Child class
class DogDown extends AnimalDown{

    void bark(){
        System.out.println("Dog is eating...");
    }
}

// Main class
public class Downcasting {
    public static void main(String[] args) {
        
        // Upcasting
        AnimalDown animal = new DogDown();

        // Downcasting
        DogDown dog = (DogDown) animal;

        dog.eat();
        dog.bark();
    }
}
