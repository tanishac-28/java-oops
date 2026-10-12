/*
Concept: super() - Calling Parent Class Constructor

The super() keyword is used to call the constructor
of the immediate parent class.

It must be the first statement in the child constructor.

It can pass arguments to a parameterized parent constructor.
*/


package Inheritance;

// Parent class
class Person{

    String name;

    Person(String name){
        this.name = name;
        System.out.println("Parent class constructor called");
    }
}

// Child class
class Student extends Person{

    int age;

    Student(String name, int age){
        super(name);
        this.age = age;
        System.out.println("Child class constructor called");
    }
}

// Main class 
public class SuperConstructor {
    public static void main(String[] args) {

        Student student = new Student("Tanisha", 18);

        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
    }
}
