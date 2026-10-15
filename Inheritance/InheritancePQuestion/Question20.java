/*
Q20. Method Overriding with Upcasting and Downcasting

Question:
Create a parent class Employee with a method
work() that prints "Employee is working".

Create a child class Developer that extends Employee.

Override the work() method in Developer to print
"Developer is coding".

In the main() method:
1. Create a Developer object using an Employee reference.
2. Call the work() method.
3. Use instanceof to check whether the object
   is an instance of Developer.
4. If true, downcast the Employee reference to
   Developer and call the work() method again.

Expected Output:
Developer is coding
Object is a Developer
Developer is coding

Concept:
Upcasting stores a child object in a parent reference.
Downcasting converts a parent reference back to
a child reference.

Dynamic Method Dispatch executes the overridden
method based on the actual object at runtime.
*/

package Inheritance.InheritancePQuestion;

class Employee {

    void work(){
        System.out.println("Employee is working");
    }
}

class Developer extends Employee{

    @Override 
    void work(){
        System.out.println("Developer is coding");
    }
}

public class Question20 {
    public static void main(String[] args) {
        
        Employee e = new Developer();
        e.work();

        if(e instanceof Developer){
           System.out.println("Object is Developer");

           Developer dev = (Developer)e;
           dev.work();
        }
    }   
}
