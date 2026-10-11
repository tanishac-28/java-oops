/*
Hierarchical Inheritance :-

Hierarchical inheritance occurs when two or more child
classes inherit from the same parent class.

The 'extends' keyword is used to achieve inheritance in Java.

Example:
Animal is the parent class.
Dog and Cat are child classes.

Both Dog and Cat can access the inherited eat() method
from the Animal class.

However, Dog's bark() method cannot be directly accessed
through a Cat object, and Cat's meow() method cannot be
directly accessed through a Dog object.

Advantages:
1. Code reusability
2. Reduces code duplication
3. Improves code organization
*/

package Inheritance;

// Parent class :-
class Animal{

    void eat(){
        System.out.println("Animal is eating...");
    }
}

// Child class 1 :-
class Dog extends Animal{

    void bark(){
        System.out.println("Dog is barking");
    }
}

// Child class 2 :-
class Cat extends Animal{

    void meow(){
        System.out.println("Cat is meowing");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        
        Dog dog = new Dog();

        dog.eat();
        dog.bark();

        Cat cat = new Cat();

        cat.eat();
        cat.meow();
        
        
        // cat.bark(); // Compile-time error
        // dog.meow(); // Compile-time error
    }
}



/*
Important Note:
A Cat object cannot access the bark() method because
bark() belongs to the Dog class, not the Animal class.

Reason:
Dog and Cat are sibling classes. They inherit from the
same parent class, but they do not inherit from each other.

Therefore:
cat.bark(); // Compile-time error
dog.meow(); // Compile-time error
*/