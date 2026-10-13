/*
Concept: Upcasting

Definition:
Upcasting means storing a Child class object
in a Parent class reference.

Rules:
1. A Parent reference can refer to a Child object.
2. Upcasting happens automatically.
3. Parent reference directly access kar sakta hai
   sirf Parent class ke available members ko.
4. If a method is overridden, the Child's version
   executes at runtime.
5. Child-specific methods cannot be called directly
   through a Parent reference.
*/


package Inheritance;

// Parent class
class AnimalUp{

    void eat(){
        System.out.println("Animal is eating...");
    }
}

// Child class
class DogUp extends AnimalUp{

    @Override 
    void eat(){
        System.out.println("Dog is eating...");
    }

    void bark(){
        System.out.println("Dog is barking...");
    }
}

// Main class
public class Upcasting {
    public static void main(String[] args) {
        
        // Upcasting
        AnimalUp animal = new DogUp();
        animal.eat();


        // animal.bark();    // Compiler-time error
    }   
}
