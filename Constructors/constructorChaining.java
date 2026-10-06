package Constructors;

class Student4{
    String name;
    int age;

    Student4(){
        this("Unknown");
    }

    Student4(String name){
        this(name , 0);   // this(name, 18)  => you can write any value
    }

    Student4(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Agr: " + age);
    }
}

public class constructorChaining {
    public static void main(String[] args) {
        
        Student4 s1 = new Student4();
        Student4 s2 = new Student4("Tanisha");
        Student4 s3 = new Student4("Tanisha",18);

        s1.display();
        s2.display();
        s3.display();
    }
}
