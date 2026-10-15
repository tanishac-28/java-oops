/*
Q15. instanceof Operator in Inheritance

Question:
Create a parent class Animal.

Create a child class Dog that extends Animal.

In the main() method, create a Dog object and
store its reference in an Animal variable.

Use the instanceof operator to check whether
the object belongs to the Animal class and
the Dog class.

Print the result of both checks.

Expected Output:
true
true

Concept:
The instanceof operator checks whether an object
is an instance of a particular class or its
subclass.
*/

package Inheritance.InheritancePQuestion;

class Animal{
}

class Dog extends Animal{
}

public class Question15 {
    public static void main(String[] args) {
        
        Animal a = new Dog();

        System.out.println(a instanceof Dog);
        System.out.println(a instanceof Animal);
    }
}
