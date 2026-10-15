package Inheritance.InheritancePQuestion;

/*
Q33. Find and Fix the Error

Question:

WRONG CODE:

class Animal {
    protected void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    private void eat() {
        System.out.println("Dog eats");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}

ERROR:
Child class mein eat() method ko private banaya gaya hai,
jabki parent class mein ye protected hai.

Overriding ke time child method ki visibility ko
parent method se kam nahi kar sakte.

Therefore, compilation error occurs.

--------------------------------------------------

CORRECT CODE:
*/

class Animal {
    protected void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("Dog eats");
    }
}

public class Question33 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}

/*
OUTPUT:

Dog eats

CONCEPTS:
1. Inheritance
2. Method Overriding
3. Access Modifiers
4. Visibility Rules

INTERVIEW POINT:
Child class ka overridden method parent method ki
visibility same rakh sakta hai ya increase kar sakta hai,
lekin decrease nahi kar sakta.
*/