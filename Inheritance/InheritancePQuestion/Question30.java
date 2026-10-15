/*
Q30. Constructor Chaining Using super()

Question:

1. Create a parent class Person.
2. Person ka parameterized constructor ho jo ek String name
   accept kare aur print kare:
   "Person: " + name

3. Create a child class Student that extends Person.
4. Student ka constructor ek String name aur int rollNo accept kare.
5. Student ke constructor se parent constructor ko name pass karo
   using super(name).
6. Student ka constructor print kare:
   "Roll No: " + rollNo

7. main() method mein Student ka object banao:
   name = "Rahul"
   rollNo = 101

Expected Output:

Person: Rahul
Roll No: 101

Concepts:
- Inheritance
- Parameterized Constructor
- super()
- Constructor Chaining
- Parent constructor ko arguments pass karna
*/


package Inheritance.InheritancePQuestion;

class Person{

    String name;

    Person(String name){
        this.name = name;
        System.out.println("Person: " + name);
    }
}

class Student extends Person{

    Student(String name, int rollNo){
       super(name);
       System.out.println("Roll no: " + rollNo);
    }
}

public class Question30 {

    public static void main(String[] args) {
        
        Student s = new Student("Tanisha", 14);

    }
}