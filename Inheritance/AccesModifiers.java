/*
==================================================
CONCEPT: ACCESS MODIFIERS IN JAVA
==================================================

Access modifiers control the visibility and
accessibility of classes, variables, constructors,
and methods.

JAVA HAS 4 ACCESS MODIFIERS:

1. PUBLIC
   - Accessible from the same class.
   - Accessible from the same package.
   - Accessible from different packages.
   - Accessible by child and non-child classes.
   - Condition: The declaring class must itself be accessible.

2. PROTECTED
   - Accessible within the same class.
   - Accessible by other classes in the same package.
   - Accessible by child classes in different packages.
   - In a different package, a child class must follow
     the protected-member inheritance access rules.
   - A non-child class in a different package cannot
     directly access a protected member.

3. DEFAULT (NO MODIFIER)
   - No keyword is written.
   - Accessible within the same class.
   - Accessible by other classes in the same package.
   - NOT accessible from a different package,
     even by a child class.

4. PRIVATE
   - Accessible directly only within the declaring class.
   - NOT directly accessible from another class,
     even if that class is a child class.
   - Can be accessed indirectly through methods such as
     public getters and setters, if provided.

==================================================
IMPORTANT RULES
==================================================

RULE 1:
public provides the widest access.

RULE 2:
protected allows same-package access and restricted
access from child classes in different packages.

RULE 3:
Default access is limited to the same package.

RULE 4:
private provides the most restricted access.

RULE 5:
A child class cannot directly access a private member
inherited from its parent.

RULE 6:
A private member can be accessed through a public
getter or setter if the class provides one.

RULE 7:
In METHOD OVERRIDING, a child method cannot reduce
the parent's access level.

Examples:
- Parent public    -> Child public       VALID
- Parent protected -> Child public       VALID
- Parent public    -> Child protected    INVALID
- Parent protected -> Child protected    VALID

==================================================
ACCESS MODIFIER QUICK REVISION
==================================================

Modifier     Same Class    Same Package    Other Package
public          YES            YES              YES
protected       YES            YES          Child only*
default         YES            YES              NO
private         YES            NO               NO

*Protected access in another package follows
specific inheritance rules.

==================================================
PRACTICAL EXAMPLE
==================================================
*/


package Inheritance;

class AccessPoint{

    public int publicAge = 18;

    protected int protectAge = 19;

    int defaultAge = 20;  // Default: no modifier

    private int privateAge = 21;

    // Private members can be accessed directly
    // inside the class where they are declared
    public void displayPrivateAge(){
        System.out.println("Private Age: " + privateAge);
    }
}

public class AccesModifiers {
    public static void main(String[] args) {
        
        AccessPoint obj = new AccessPoint();

        // Public: accessible from another class
        System.out.println("Public Age: " + obj.publicAge);

        // Protected : accessible because both classes
        // belong to the same package
        System.out.println("Protected Age: " + obj.protectAge);

        // Default: accessible because both classes
        // belong to the same package.
        System.out.println("Default Age: " + obj.defaultAge);

        // Private: accessed through a public method
        // obj.privateAge would cause a compile-time error.
        obj.displayPrivateAge();
    }
}


/*
OUTPUT:

Public Age: 18
Protected Age: 19
Default Age: 20
Private Age: 21

==================================================
COMMON MISTAKES TO AVOID
==================================================

1. Writing "default" as a keyword for a variable:
   WRONG: default int age = 18;
   RIGHT: int age = 18;

2. Accessing a private variable directly from another class.

3. Assuming protected means accessible everywhere.

4. Assuming a child class can access default members
   from a different package.

5. Reducing access while overriding a parent method.

==================================================
*/