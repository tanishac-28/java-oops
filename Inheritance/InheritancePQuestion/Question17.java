/*
Q17. Method Overriding and Access Modifiers

Question:
Create a parent class Employee with a protected
method work() that prints "Employee is working".

Create a child class Developer that extends Employee.

Override the work() method in Developer using
the private access modifier.

Check whether the code compiles.
If it produces a compilation error, correct the code
and call the work() method using a Developer object.

Expected Output:
Developer is coding

Concept:
An overriding method cannot reduce the visibility
of the inherited method.

A protected method cannot be overridden as private,
but its visibility can be increased to public.
*/


package Inheritance.InheritancePQuestion;


class Employee{
    protected void work(){
        System.out.println("Employee is working");
    }
}

class Developer extends Employee{

    @Override 
    public void work(){
        System.out.println("Developer is working");
    }
}


public class Question17 {
    public static void main(String[] args) {
     
        Developer d = new Developer();
        d.work();
    }
}