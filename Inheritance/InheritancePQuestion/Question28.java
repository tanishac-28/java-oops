/*
Q28. Predict the Output

Question:
Create a parent class Animal with a method sound()
that prints "Animal makes a sound".

Create two child classes:
1. Dog — overrides sound() and prints "Dog barks".
2. Cat — overrides sound() and prints "Cat meows".

Inside main():
- Create an Animal reference pointing to a Dog object.
- Call sound().
- Change the reference to point to a Cat object.
- Call sound() again.

Expected Output:
Dog barks                                                                       
Cat meows

Concepts:
1. Inheritance
2. Method Overriding
3. Runtime Polymorphism
4. Parent reference with child object
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

public class Question28 {
    public static void main(String[] args) {
        
        Animal a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();
    }
}
