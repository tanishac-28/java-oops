/*
Topic: Encapsulation

Definition:
Encapsulation is an OOP concept that combines data
and methods into a single unit called a class and
controls access to that data.

Advantages:
1. Data Hiding
2. Controlled Access
3. Data Validation
4. Better Maintainability
*/

package Encapsulation;

class Student {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class EncapsulationBasics {

    public static void main(String[] args) {

        Student student = new Student();

        student.setName("Tanisha");
        student.setAge(18);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}

/*
Output:
Namr: Tanisha 
Age: 18

*/