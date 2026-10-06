package Constructors;


class Student1{
    String name;
    int age;

    Student1(String name , int age){
        this.name = name;
        this.age = age; 
    }

    void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}
public class parameterized{
    public static void main(String[] args) {
        
        Student1 s1 = new Student1("Tanisha", 18);
        Student1 s2 = new Student1("Bhavya", 17);

        s1.display();
        s2.display();
    }
}



/*
Using Student1 because Student class is already used in DefaultConstructor.java */