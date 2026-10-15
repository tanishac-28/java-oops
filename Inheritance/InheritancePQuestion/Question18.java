/*
Q18. Method Overriding with Dynamic Method Dispatch

Question:
Create a parent class Animal with a method sound()
that prints "Animal makes a sound".

Create two child classes:
Dog and Cat.

Override the sound() method:
Dog prints "Dog barks".
Cat prints "Cat meows".

In the main() method:
1. Create an Animal reference pointing to a Dog object.
2. Call sound().
3. Change the reference to point to a Cat object.
4. Call sound() again.

Expected Output:
Dog barks
Cat meows

Concept:
Dynamic Method Dispatch allows Java to decide
at runtime which overridden method to execute,
based on the actual object.
*/


package Inheritance.InheritancePQuestion;

class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    @Override 
    void sound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    @Override 
    void sound(){
        System.out.println("Cat meows");
    }
}


public class Question18 {
    public static void main(String[] args) {
        
        Animal a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();

    }
}
