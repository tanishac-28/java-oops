/*
Q12. Method Overriding with super

Question:
Create a parent class Animal with a method sound()
that prints "Animal makes a sound".

Create a child class Dog that extends Animal
and overrides the sound() method.

Inside the child's sound() method, first call
the parent's sound() method using super.sound(),
then print "Dog barks".

Create a Dog object in main() and call sound().

Output:
Animal makes a sound
Dog barks

Concept:
Method overriding allows a child class to provide
its own implementation of a parent class method.

The super keyword can call the parent's version
of an overridden method.
*/


package Inheritance.InheritancePQuestion;

class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    
    @Override 
    void sound() {
        super.sound();
        System.out.println("Dog barks");
    }
}


public class Question12 {
    public static void main(String[] args) {
        
        Dog d = new Dog();
        d.sound();
    }
}
