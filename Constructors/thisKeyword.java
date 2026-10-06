/*
Theory:
The 'this' keyword refers to the current object.
In a constructor, it is commonly used to distinguish
instance variables from constructor parameters.

Example:
this.name = name;
Here, this.name refers to the object's variable,
while name refers to the constructor parameter.
*/

package Constructors;

class Student6{
    String name;
    int age;

    Student6(String name , int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class thisKeyword {
    public static void main(String[] args) {
        
        Student6 s1 = new Student6("Tanisha",18);
        s1.display();
    }
}


