/*
Q5. Multilevel Inheritance

Create an Animal class with eat().
Create a Dog class that extends Animal and has bark().
Create a Puppy class that extends Dog.

Create a Puppy object and call both eat() and bark().

Output:
Animal eats
Dog barks
*/


package Inheritance.InheritancePQuestion;

class Animal{
    void eat(){
        System.out.println("Animal eats...");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks.");
    }
}

class Puppy extends Dog{
    
}

public class Question5 {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();

    }
}
