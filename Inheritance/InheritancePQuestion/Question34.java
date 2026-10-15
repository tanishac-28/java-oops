package Inheritance.InheritancePQuestion;

/*
Q34. Find and Fix the Error
Topic: Method Overriding and Runtime Polymorphism

WRONG CODE:

class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}

class Developer extends Employee {
    void work(int hours) {
        System.out.println("Developer is writing code");
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Developer();
        e.work();
    }
}

ERROR:
Developer class mein work(int hours) method hai,
jo parent ke work() method ko override nahi karta.
Dono methods ke parameters different hain.

CORRECT CODE:
*/

class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}

class Developer extends Employee {

    @Override
    void work() {
        System.out.println("Developer is writing code");
    }
}

class Designer extends Employee {

    @Override
    void work() {
        System.out.println("Designer is designing UI");
    }
}

public class Question34 {
    public static void main(String[] args) {

        Employee e = new Developer();
        e.work();

        e = new Designer();
        e.work();
    }
}

/*
OUTPUT:

Developer is writing code
Designer is designing UI

CONCEPTS:
1. Inheritance
2. Method Overriding
3. @Override annotation
4. Runtime Polymorphism
*/