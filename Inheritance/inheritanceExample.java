/*
Inheritance in Java :-

Inheritance is an OOP concept in which a child class
acquires accessible fields and methods from a parent class.

The 'extends' keyword is used to inherit a class.

Parent Class: The class whose properties and methods are inherited.
Child Class: The class that inherits from another class.

Advantages:
1. Code reusability
2. Less code duplication
3. Easier code maintenance

Example:
Animal is the parent class.
Dog is the child class.
Dog can use the eat() method inherited from Animal.

Note:
Java supports single, multilevel, and hierarchical inheritance
through classes. Multiple inheritance through classes is not supported.
*/


package Inheritance;

class Animal{
    
    void eat(){
        System.out.println("Animal is eating....");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking....");
    }
}

public class inheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}



// Second Example :-

// class Person{

//     String name = "Tanisha";
//     int age = 18;

//     void displayInfo(){
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//     }
// }

// class Student extends Person{

//     String course = "B Tech";

//     void displayCourse(){
//         System.out.println("Course: " + course);
//     }
// }

// public class inheritanceExample {
//     public static void main(String[] args) {
//         Student student = new Student();

//         // Inherited properties :-
//         System.out.println(student.name);
//         System.out.println(student.age);

//         // Inherited Method :-
//         student.displayInfo();

//         // Student's own property and method
//         System.out.println(student.course);
//         student.displayCourse();
//     }
// }