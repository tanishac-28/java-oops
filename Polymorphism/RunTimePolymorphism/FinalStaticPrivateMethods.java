package Polymorphism.RunTimePolymorphism;

/*
 * TOPIC: Final, Static and Private Methods
 *
 * DEFINITION:
 * These methods behave differently when inherited by child classes.
 *
 * 1. final methods cannot be overridden.
 * 2. private methods are not inherited for overriding.
 * 3. static methods are hidden, not overridden.
 */

class ParentMethods {

    final void finalMethod() {
        System.out.println("Parent final method");
    }

    static void staticMethod() {
        System.out.println("Parent static method");
    }

    private void privateMethod() {
        System.out.println("Parent private method");
    }

    void callPrivateMethod() {
        privateMethod();
    }
}

class ChildMethods extends ParentMethods {

    // Static method hiding
    static void staticMethod() {
        System.out.println("Child static method");
    }

    // This is a separate method, NOT overriding
    void privateMethod() {
        System.out.println("Child separate method");
    }
}

public class FinalStaticPrivateMethods {

    public static void main(String[] args) {

        ParentMethods obj = new ChildMethods();

        obj.finalMethod();

        ParentMethods.staticMethod();

        obj.callPrivateMethod();

        ChildMethods child = new ChildMethods();
        child.privateMethod();
    }
}

/*
 * EXPECTED OUTPUT:
 *
 * Parent final method
 * Parent static method
 * Parent private method
 * Child separate method
 */



/*
 * QUICK REVISION TABLE:
 *
 * ------------------------------------------------
 * KEYWORD / CONCEPT | SHORTCUT TO REMEMBER
 * ------------------------------------------------
 * final method      | Cannot be overridden
 * private method    | Not overridden
 * static method     | Method hiding
 * super.method()    | Calls parent implementation
 * @Override         | Compiler checks intended overriding
 * instanceof        | Checks object's type
 * ------------------------------------------------
 *
 * INTERVIEW SHORTCUT:
 *
 * Instance method -> Runtime polymorphism
 * Static method   -> Method hiding
 * Private method  -> No overriding
 * Final method    -> Overriding prohibited
 */