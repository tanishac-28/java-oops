package Constructors;

class Student{
    String name;
    int age;

    Student(){
        name = "Tanisha";
        age = 18;
    }

    void display(){
        System.out.println("Name : " + name);
        System.out.println("age : " + age);
    }
}
public class defaultConstructor {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.display();
    }
}
