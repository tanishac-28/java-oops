package Inheritance;

// Abstract Parent class
abstract class AnimalAbstract{

    // Abstract method: no method body
    abstract void sound();

    // Concrete method: has a method body
    void eat(){
        System.out.println("Animal is eating...");
    }
}

// Child class extends the abstract class
class DogAbstract extends AnimalAbstract{

    @Override 
    void sound(){
        System.out.println("Dog barks...");
    }
}

// Interface
interface PetInterface{

    // Abstract method
    void play();
}

// class extends a parent class and implements an interface
class PetDog extends AnimalAbstract implements PetInterface{

    @Override 
    void sound(){
        System.out.println("Pet dog barks...");
    }

    @Override 
    public void play(){
        System.out.println("Pet Dog is playing");
    }
}

// Main class
public class AbstractClassInterface {
    public static void main(String[] args) {
        
        // Abstract class reference pointing to child object
        AnimalAbstract animal = new DogAbstract();

        animal.sound();
        animal.eat();

        // Interface reference pointing to implementing object
        PetInterface pet = new PetDog();
        pet.play();
    }
}



/*
output:

Dog barks...
Animal is eating...
Pet Dog is playing

*/