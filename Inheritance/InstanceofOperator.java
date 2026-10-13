/*
==================================================
CONCEPT: instanceof OPERATOR
==================================================

Definition:
The instanceof operator checks whether an object
belongs to a particular class or its compatible
subclass/interface type.

Syntax:
object instanceof ClassName

RULES:
1. Returns true if the object matches the checked type.
2. Returns false if the object does not match.
3. It is useful for checking object types before
   downcasting.
4. It can check parent-child relationships.
5. Using instanceof with null always returns false.
6. The types must be compatible; otherwise,
   the code may fail to compile.

==================================================
*/

package Inheritance;

// Parent class
class AnimalCheck{

    void eat(){
        System.out.println("Animal is eating...");
    }
}

// Child class
class DogCheck extends AnimalCheck{

    void bark(){
        System.out.println("Dog is barking...");
    }
}

// Another child class 
class CatCheck extends AnimalCheck{

    void meow(){
        System.out.println("Cat is meowing...");
    }
}

// Main class
public class InstanceofOperator {
    public static void main(String[] args) {
        
        AnimalCheck animal = new DogCheck();

        // check the actual object type
        System.out.println(animal instanceof DogCheck);

        // check the parent-Child relationship
        System.out.println(animal instanceof AnimalCheck);

        // check an unrelated child type
        System.out.println(animal instanceof CatCheck);

        // instanceof with null
        AnimalCheck anotherAnimal = null;
        System.out.println(anotherAnimal instanceof AnimalCheck);
    }   
}



/*
output :

true
true
false
false

*/