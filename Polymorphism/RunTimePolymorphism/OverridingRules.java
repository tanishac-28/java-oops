package Polymorphism.RunTimePolymorphism;

/*
 * TOPIC: Rules of Method Overriding
 *
 * DEFINITION:
 * Method overriding occurs when a child class provides its own
 * implementation of an instance method inherited from its parent.
 *
 * IMPORTANT RULES:
 *
 * 1. Inheritance is required.
 * 2. The method name and parameter list must match.
 * 3. The return type must be the same or covariant.
 * 4. The child method cannot reduce access visibility.
 * 5. final methods cannot be overridden.
 * 6. private methods are not overridden.
 * 7. Static methods are hidden, not overridden.
 * 8. Constructors cannot be overridden.
 */

class Parent {

    protected void display() {
        System.out.println("Parent display");
    }

    public void show() {
        System.out.println("Parent show");
    }
}

class Child extends Parent {

    // Valid overriding: same method signature
    @Override
    public void display() {
        System.out.println("Child display");
    }

    @Override
    public void show() {
        System.out.println("Child show");
    }
}

public class OverridingRules {

    public static void main(String[] args) {

        Parent obj = new Child();

        obj.display();
        obj.show();
    }
}

/*
 * EXPECTED OUTPUT:
 *
 * Child display
 * Child show
 */