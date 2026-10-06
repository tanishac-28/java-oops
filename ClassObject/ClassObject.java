package ClassObject;


class Student{
    String name;
    int age;

    void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
public class ClassObject {

    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.name = "Tanisha Choyal";
        s1.age = 18;

        s1.display();
    }
}