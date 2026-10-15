/*
Q27. Method Overriding with Access Modifiers

Question:
Create a parent class Animal.

1. Add a protected method eat() that prints
   "Animal is eating".

Create a child class Dog that extends Animal.

1. Override the eat() method using the public modifier.
2. Print "Dog is eating".

Create another child class Cat that extends Animal.

1. Override the eat() method using the private modifier.
2. Print "Cat is eating".

In the main() method:
1. Create objects of Dog and Cat.
2. Call the eat() method on both objects.

Tasks:
1. Determine whether the code compiles successfully.
2. Identify which method declaration causes a compilation error.
3. Correct the code so that it compiles successfully.
4. Explain why public is allowed but private is not.

Expected Output After Correction:
Dog is eating
Cat is eating

Interview Follow-up:
Can an overriding method increase the visibility
of the inherited method?

Concept:
An overriding method cannot reduce the visibility
of the inherited method. It can maintain or increase
the visibility.
*/

package Inheritance.InheritancePQuestion;

class Animal{

    protected void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{

    @Override 
    public void eat(){
        System.out.println("Dog is eating");
    }
}

class Cat extends Animal{

    @Override 
    public void eat(){
        System.out.println("Cat is eating");
    }
}

public class Question27 {
    public static void main(String[] args) {
        
        Animal a = new Dog();
        a.eat();

        Animal b = new Cat();
        b.eat();
    }
}
