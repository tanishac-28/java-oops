package Constructors;

class  Student2{
    String name;
    int age;

    Student2(String name, int age){
        this.name = name;
        this.age = age;
    }

    Student2(Student2 student){
        this.name = student.name;
        this.age = student.age;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class copyConstructor {
    public static void main(String[] args) {
    
        Student2 s1 = new Student2("Tanisha", 18);
        Student2 s2 = new Student2(s1);

        s1.display();
        s2.display();
    }   
}
