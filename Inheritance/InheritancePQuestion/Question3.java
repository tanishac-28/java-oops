/*
Q3. Method Overriding

Create a parent class Person with an introduce()
method that prints "I am a person".

Create a child class Student that extends Person
and overrides introduce() to print "I am a student".

Create a Student object and call introduce().

Output:
I am a student
*/


package Inheritance.InheritancePQuestion;

class Person{

    void introduce(){
        System.out.println("I am a person");
    }
}

class Student extends Person{

    @Override 
    void introduce(){
        System.out.println("I am a student");
    }
}


public class Question3 {
    public static void main(String[] args) {
        
        Student s = new Student();
        s.introduce();
    }
}
