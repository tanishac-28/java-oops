/*
Topic: Encapsulation
Question 1: Employee Salary Management

Problem Statement:
Create an Employee class using the concept of encapsulation.

Requirements:
1. Create a class named Employee.
2. Declare two private variables:
   - name of type String
   - salary of type double
3. Create a getter and setter for name.
4. Create a getter and setter for salary.
5. Add validation in the salary setter:
   Salary must be greater than 0.
6. In the main() method:
   - Create an Employee object.
   - Set the name to "Tanisha".
   - Set the salary to 30000.
   - Try to update the salary to -5000.
   - Print the employee name and final salary.

Expected Output:
Employee Name: Tanisha
Employee Salary: 30000.0
Final Salary: 30000.0

Concepts Covered:
- Encapsulation
- Private Data Members
- Getters and Setters
- Data Validation
- Controlled Access

Task:
Write the complete Java program independently.
*/

package Encapsulation;


class Employee{

    private String name;
    private double salary;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSalary(double salary){
        if(salary > 0){
            this.salary = salary;
        }
    }

    public double getSalary(){
        return salary;
    }
}


public class Practice1 {
    public static void main(String[] args) {
        
        Employee emp = new Employee();
        emp.setName("Tanisha");
        emp.setSalary(30000);

        emp.setSalary(-500);

        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
    }
}
