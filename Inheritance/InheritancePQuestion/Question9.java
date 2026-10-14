/*
Q9. final Method in Inheritance

Question:
Create a parent class Vehicle with a final method
start() that prints "Vehicle is starting".

Create a child class Car that extends Vehicle.

Try to override the start() method in the Car
class and make it print "Car is starting".

Create a Car object in main() and call start().

Expected Result:
Compilation error because a final method
cannot be overridden in a child class.

Explanation:
The final keyword prevents a method from
being overridden by a child class.

If we remove the overridden start() method
from Car, the code will compile successfully,
and Car can use the inherited start() method.

Concept:
A final method can be inherited, but it cannot
be overridden.
*/


package Inheritance.InheritancePQuestion;

class Vehicle{
    final void start(){
        System.out.println("Vehicle is starting....");
    }
}

class Car extends Vehicle{
    /*

    void start(){      // compilation error : cannot override the final method and a final method cannot be overridden by a child class
        System.out.println("Car is starting....");
    }
        
    */
}


public class Question9 {
    public static void main(String[] args) {
       Car c = new Car();
       c.start(); 
    }
}
