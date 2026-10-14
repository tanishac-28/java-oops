/*
Q8. super Keyword with Variables

Question:
Create a parent class Vehicle with speed = 60.

Create a child class Car that extends Vehicle
and declares its own speed = 120.

Create a showSpeed() method in Car that prints
the parent's speed using super.speed and the
child's speed using this.speed.

Call showSpeed() using a Car object.

Expected Output:
Parent speed: 60
Child speed: 120
*/


package Inheritance.InheritancePQuestion;

class Vehicle{
    int speed = 60;
}

class Car extends Vehicle{
    int speed = 120;

    void showSpeed(){
        System.out.println("Parent speed: " + super.speed);
        System.out.println("Child speed: " + this.speed);
    }
}

public class Question8 {

    public static void main(String[] args) {
        Car c = new Car();
        c.showSpeed();
    }
}