/*
Q11. Inherited Method with Constructor

Question:
Create a parent class Employee with a constructor
that prints "Employee constructor called".

Create a method work() in Employee that prints
"Employee is working".

Create a child class Developer that extends Employee
and has a constructor that prints
"Developer constructor called".

Create a Developer object in main() and call
the work() method.

Output:
Employee constructor called
Developer constructor called
Employee is working

Concept:
A child class can use an inherited method from
its parent class, and the parent constructor
executes before the child constructor.
*/



package Inheritance.InheritancePQuestion;

class Employee{

    Employee(){
        System.out.println("Employee constructor called");
    }
    void work(){
        System.out.println("Employee is working");
    }
}

class Developer extends Employee{
    Developer(){
        System.out.println("Developer constructor called");
    }
}


public class Question11 {
    public static void main(String[] args) {
        
        Developer d = new Developer();
        d.work();
    }
}
