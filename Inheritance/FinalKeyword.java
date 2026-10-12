/*
Concept: final Keyword

1. A final variable cannot be reassigned.
2. A final method cannot be overridden.
3. A final class cannot be inherited.
*/

package Inheritance;

// Example 1: Final Variable
class FinalVariableExample{

    final int AGE = 18;

    void displayAge(){
        System.out.println("Age: " + AGE);
    } 
}

// Example 2: Final method
class FinalParent{

    final void display(){
        System.out.println("Parent display method");
    }
} 

class FinalCild extends FinalParent{
    // Final  display() method cannot be overridden
}

// Example 3: Final class
final class FinalAnimal{

    void eat(){
        System.out.println("Animal is eating...");
    }
}

// Main class
public class FinalKeyword {
    public static void main(String[] args) {
        
        // Final Variable
        FinalVariableExample obj1 = new FinalVariableExample();
        obj1.displayAge();

        // Final Method
        FinalCild obj2 = new FinalCild();
        obj2.display();

        // Final class
        FinalAnimal obj3 = new FinalAnimal();
        obj3.eat();
    }
}
