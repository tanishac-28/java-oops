
package Inheritance;

/*
==================================================
TOPIC 17: OBJECT CLASS METHODS
==================================================

Every Java class directly or indirectly inherits
from the Object class.

Important Object class methods:
1. toString()  - Returns a string representation.
2. equals()    - Compares objects by default identity.
3. hashCode()  - Returns an integer hash code.
4. getClass()  - Returns the object's runtime class.

Note:
equals() and toString() can be overridden.
getClass() is final and cannot be overridden.
==================================================
*/

// Student class
class StudentObject {

    int id;
    String name;

    StudentObject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Overriding toString()
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }

    // Overriding equals()
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof StudentObject)) {
            return false;
        }

        StudentObject other = (StudentObject) obj;

        return this.id == other.id
                && this.name.equals(other.name);
    }

    // Overriding hashCode()
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id, name);
    }
}

// Main class
public class ObjectClassMethods {

    public static void main(String[] args) {

        StudentObject student1 =
                new StudentObject(1, "Tanisha");

        StudentObject student2 =
                new StudentObject(1, "Tanisha");

        // 1. toString()
        System.out.println(student1.toString());

        // 2. equals()
        System.out.println(student1.equals(student2));

        // 3. hashCode()
        System.out.println(student1.hashCode());

        // 4. getClass()
        System.out.println(student1.getClass().getSimpleName());
    }
}

/*
OUTPUT:

ID: 1, Name: Tanisha
true

StudentObject
122755716
Note:
The exact hash code number can vary.
==================================================
*/