/*
Q19. Dynamic Method Dispatch with Constructor Execution

Question:
Create a parent class Animal.

1. Add a constructor that prints "Animal constructor".
2. Add a method sound() that prints "Animal makes a sound".

Create a child class Dog that extends Animal.

1. Add a constructor that prints "Dog constructor".
2. Override the sound() method to print "Dog barks".

In the main() method:
1. Create an Animal reference pointing to a Dog object.
2. Call the sound() method.

Expected Output:
Animal constructor
Dog constructor
Dog barks

Concept:
When a child object is created, the parent constructor
executes before the child constructor.

Dynamic Method Dispatch selects the overridden method
according to the actual object at runtime.
*/

package Inheritance.InheritancePQuestion;

class Animal{
    Animal(){
        System.out.println("Animal constructor");
    }
    void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    Dog(){
        System.out.println("Dog constructor");
    }
    @Override 
    void sound(){
        System.out.println("Dog barks");
    }
}

public class Question19 {
    public static void main(String[] args) {
        
        Animal a = new Dog();
        a.sound();
    }
}