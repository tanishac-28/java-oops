/*
Multilevel Inheritance :-

Multilevel inheritance occurs when a class inherits
from a child class, forming a chain of inheritance.

The 'extends' keyword is used to establish inheritance.

Example:
A is the parent class of B.
B is the parent class of C.
Therefore, C can inherit accessible members from both
B and A through the inheritance chain.

Advantages:
1. Code reusability
2. Reduces code duplication
3. Organizes related classes into levels.
*/

package Inheritance;

// GrandParent class :-
class Animal{

    void eat(){
        System.out.println("Animal is eating...");
    }
}

// Parent class :-
class Dog extends Animal{
    
    void bark(){
        System.out.println("Dog is barking...");
    }
}

// Child class :-
class Puppy extends Dog{

    void weep(){
        System.out.println("Puppy is weeping...");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        
        Puppy puppy = new Puppy();

        puppy.eat();
        puppy.bark();
        puppy.weep();
    }
}
