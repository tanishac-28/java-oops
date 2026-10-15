/*
Q13. Upcasting in Inheritance

Question:
Create a parent class Animal with a method
eat() that prints "Animal is eating".

Create a child class Dog that extends Animal
and has a method bark() that prints "Dog is barking".

In the main() method, create a Dog object and
store its reference in an Animal variable.

Call the eat() method using that reference.

Expected Output:
Animal is eating

Concept:
Upcasting means storing a child class object
reference in a parent class variable.

After upcasting, you can directly access only
the methods available through the parent reference.
*/

package Inheritance.InheritancePQuestion;

class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}


public class Question13 {
    public static void main(String[] args) {
        
        Animal d = new Dog();
        d.eat();
    }
}
