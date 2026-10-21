/*
Topic: Abstract Class — Constructor Chaining

Definition:
When a concrete child object is created, the abstract
parent class constructor executes first. Constructor
execution follows the inheritance hierarchy.

Question 7: Constructor Chaining

Requirements:
1. Create an abstract class named Employee.
2. Add a constructor that prints:
   "Employee constructor"
3. Create a class named Developer that extends Employee.
4. Add a constructor that prints:
   "Developer constructor"
5. Create a class named JavaDeveloper that extends Developer.
6. Add a constructor that prints:
   "JavaDeveloper constructor"
7. In main(), create a JavaDeveloper object.

Expected Output:
Employee constructor
Developer constructor
JavaDeveloper constructor
*/

package Abstraction;

abstract class Employee{

    Employee(){
        System.out.println("Employee Constructor");
    }
}

class Developer extends Employee{

    Developer(){
        System.out.println("Developer constructor");
    }
}

class JavaDeveloper extends Developer{

    JavaDeveloper(){
        System.out.println("Java Constructor");
    }
}

public class AbstractClassConstructorChaining {
    public static void main(String[] args) {
        
        JavaDeveloper dev = new JavaDeveloper();

    }
}
