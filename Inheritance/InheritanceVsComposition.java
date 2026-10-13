/*
==================================================
TOPIC 16: INHERITANCE VS COMPOSITION
==================================================

INHERITANCE:
1. Represents an "IS-A" relationship.
2. Uses the extends keyword.
3. Child class inherits accessible members
   from the parent class.

COMPOSITION:
1. Represents a "HAS-A" relationship.
2. One class contains a reference to an object
   of another class.
3. Helps build classes using other objects.

==================================================
*/


package Inheritance;

// Parent class
class VehicleRelation{

    void start(){
        System.out.println("Vehicle is Starting...");
    }
}

// Car IS-A Vehicle
class CarRelation extends VehicleRelation{

    void drive(){
        System.out.println("Car is driving....");
    }
}

// COMPOSITION EXAMPLE
class EngineRelation{

    void startEngine(){
        System.out.println("Engine is starting...");
    }
}

// CAR HAS-A Engine
class CarWithEngine{

    // Composition: CarWithEngine has an EngineRelation
    private EngineRelation engine = new EngineRelation();

    void startCar(){
        engine.startEngine();
        System.out.println("Car is ready to drive");
    }
}

// Main class
public class InheritanceVsComposition {
    public static void main(String[] args) {
        
        // Inheritance
        CarRelation car1 = new CarRelation();

        car1.start();
        car1.drive();

        // Composition
        CarWithEngine car2 = new CarWithEngine();

        car2.startCar();
    }
}



/*
Output:

Vehicle is Starting...
Car is driving....
Engine is starting...
Car is ready to drive
*/