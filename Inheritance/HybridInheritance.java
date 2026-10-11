/*
Hybrid Inheritance :-

Hybrid inheritance is a combination of two or more
types of inheritance.

Java does not support hybrid inheritance directly
through classes because multiple inheritance through
classes is not allowed.

However, hybrid inheritance can be achieved by combining
class inheritance and interfaces.

Advantages:
1. Code reusability
2. Flexibility in class design
3. Combines different inheritance structures
*/

package Inheritance;

// Parent class :-
class Animal{

    void eat(){
        System.out.println("Animal is eating....");
    }
}

// Interface 1 
interface Pet{
    void play();
}

// Interface 2
interface Guard{
    void protect();
}

// Child class : Inherits a class and implements two interfaces
class Dog extends Animal implements Pet , Guard{

    @Override 
    public void play(){
        System.out.println("Dog is playing");
    }

    @Override 
    public void protect(){
        System.out.println("Dog is protecting the house");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        
        Dog dog = new Dog();

        dog.eat();
        dog.play();
        dog.protect();
    }
}
