/*
Q24. Abstract Class with Multiple Levels of Inheritance

Question:
Create an abstract class Employee.

1. Add a constructor that prints "Employee constructor".
2. Add an abstract method work().
3. Add a concrete method salary() that prints
   "Employee receives salary".

Create a class Developer that extends Employee.

1. Add a constructor that prints "Developer constructor".
2. Implement work() to print "Developer writes code".

Create a class SeniorDeveloper that extends Developer.

1. Add a constructor that prints
   "SeniorDeveloper constructor".
2. Override work() to print "Senior Developer designs systems".

In the main() method:
1. Create an Employee reference pointing to a
   SeniorDeveloper object.
2. Call work().
3. Call salary().

Expected Output:
Employee constructor
Developer constructor
SeniorDeveloper constructor
Senior Developer designs systems
Employee receives salary

Concept:
Multilevel inheritance allows a class to inherit
through multiple levels.

Constructors execute from the topmost parent to
the child, while overridden methods are selected
according to the actual object at runtime.
*/


package Inheritance.InheritancePQuestion;

abstract class Employee{

    Employee(){
        System.out.println("Employee constructor");
    }

    abstract void work();

    void Salary(){
        System.out.println("Employee receives salary");
    }
}

class Developer extends Employee{

    Developer(){
        System.out.println("Developer Constructor");
    }

    @Override
    void work() {
       System.out.println("Developer writes code");
    }
}

class SeniorDeveloper extends Developer{
    SeniorDeveloper(){
        System.out.println("SeniorDeveloper constructor");
    }

    @Override 
    void work(){
        System.out.println("Senior developer designs systems");
    }
}

public class Question24 {

    public static void main(String[] args) {
        
        Employee e = new SeniorDeveloper();
        e.work();
        e.Salary();
    }
}