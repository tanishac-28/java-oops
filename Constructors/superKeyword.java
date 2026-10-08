/*
Theory:
The super() keyword is used to call the constructor of the parent class.

It must be the first statement inside the child constructor.
*/

package Constructors;

class Person{
    String name;

    Person(String name){
        this.name = name;
    }
}

class Student7 extends Person{
    int age;

    Student7(String name , int age){
        super(name);
        this.age = age;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class superKeyword {
    public static void main(String[] args) {
        
        Student7 s1 = new Student7("Tanisha", 18);
        s1.display();
    }    
}
