/*
Q10. Constructor Execution in Inheritance

Question:
Create a parent class Animal with a constructor
that prints "Animal constructor called".

Create a child class Dog that extends Animal
and has a constructor that prints
"Dog constructor called".

Create an object of Dog in the main() method.

Expected Output:
Animal constructor called
Dog constructor called

Concept:
When a child class object is created, the parent
class constructor executes before the child class
constructor.
*/


package Inheritance.InheritancePQuestion;

class Animal{
    Animal(){
        System.out.println("Animal Constructor called");
    }
}

class Dog extends Animal{

    Dog(){
        System.out.println("Dog Constructor called");
    }
}


public class Question10 {
    public static void main(String[] args) {
        
        Dog d = new Dog();
        
    }
}
