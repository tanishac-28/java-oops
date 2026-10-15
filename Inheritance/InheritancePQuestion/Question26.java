/*
Q26. Abstract Class with Multiple Abstract Methods

Question:
Create an abstract class Appliance.

1. Add an abstract method turnOn().
2. Add an abstract method turnOff().
3. Add a concrete method status() that prints
   "Appliance is ready".

Create a child class WashingMachine that extends Appliance.

1. Implement turnOn() to print "Washing machine is ON".
2. Implement turnOff() to print "Washing machine is OFF".
3. Do not override the status() method.

In the main() method:
1. Create an Appliance reference pointing to a
   WashingMachine object.
2. Call status().
3. Call turnOn().
4. Call turnOff().

Expected Output:
Appliance is ready
Washing machine is ON
Washing machine is OFF

Interview Follow-up:
What happens if WashingMachine implements turnOn()
but does not implement turnOff()?

Concept:
A concrete child class must implement all inherited
abstract methods. Otherwise, it must also be declared
abstract.
*/

package Inheritance.InheritancePQuestion;

abstract class Appliance{

    abstract void turnOn();

    abstract void turnOff();

    void status(){
        System.out.println("Appliance is ready");
    }
}

class WashingMachine extends Appliance{

    @Override 
    void turnOn(){
        System.out.println("Washing machine is ON");
    }

    @Override 
    void turnOff(){
        System.out.println("Washing machine is OFF");
    }
}

public class Question26 {
    public static void main(String[] args) {
        
        Appliance a = new WashingMachine();

        a.status();
        a.turnOn();
        a.turnOff();
    }
}
