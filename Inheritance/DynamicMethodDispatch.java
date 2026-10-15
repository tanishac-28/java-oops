/*
==================================================
CONCEPT: DYNAMIC METHOD DISPATCH
==================================================

Definition:
Dynamic Method Dispatch is a mechanism in Java
where an overridden method is selected at runtime
based on the actual object, not the reference type.

RULES:
1. It works with inheritance.
2. Method overriding is required.
3. A Parent reference can refer to a Child object.
4. The overridden method is selected at runtime.
5. The reference type determines which members
   can be accessed directly.
6. The actual object determines which overridden
   method implementation executes.

==================================================
*/


package Inheritance;

// Parent class
class AnimalDispatch{

    void sound(){
        System.out.println("Animal makes a sound...");
    }
}

// Child class
class DogDispatch extends AnimalDispatch{

    @Override 
    void sound(){
        System.out.println("Dog barks...");
    }
}

// Another child class
class CatDispatch extends AnimalDispatch{

    @Override 
    void sound(){
        System.out.println("Cat meows...");
    }
}

// Main class
public class DynamicMethodDispatch {

    public static void main(String[] args) {
     
        // Parent reference pointing to Dog object
        AnimalDispatch animal1 = new DogDispatch();

        // Parent reference pointing to Cat object
        AnimalDispatch animal2 = new CatDispatch();

        // Calls the overridden method at runtime
        animal1.sound();
        animal2.sound();
    }
}


/*
Output:

Dog barks...
Cat meows...

*/