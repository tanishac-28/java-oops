package Constructors;

class Student3{
    String name;
    int age;

    Student3(){
        name = "Unknown";
        age = 0;
    }

    Student3(String name){
        this.name = name;
        this.age = 0;
    }

    Student3(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class constructorOverloading {
    public static void main(String[] args) {
     
        Student3 s1 = new Student3();
        Student3 s2 = new Student3("Tanisha");
        Student3 s3 = new Student3("Tanisha", 18);

        s1.display();
        s2.display();
        s3.display();
    }
}