package Polymorphism.CompileTimePolymorphism;

/*
 * Topic: Null Ambiguity in Method Overloading
 *
 * Definition:
 * null is a special literal that can be assigned to reference types.
 * It cannot be assigned to primitive types.
 *
 * Rules:
 * 1. null can be passed to methods accepting reference types.
 * 2. When overloaded methods have related parameter types,
 *    Java selects the most specific applicable method.
 * 3. If two applicable parameter types are unrelated,
 *    passing null may cause compilation ambiguity.
 */

class NullDemo {

    void show(Object value) {
        System.out.println("Object method");
    }

    void show(String value) {
        System.out.println("String method");
    }

    void display(Number value) {
        System.out.println("Number method");
    }

    void display(Integer value) {
        System.out.println("Integer method");
    }
}

public class NullAmbiguity {

    public static void main(String[] args) {

        NullDemo obj = new NullDemo();

        // String is more specific than Object
        obj.show(null);

        // Integer is more specific than Number
        obj.display(null);
    }
}

/*
 * Expected Output:
 *
 * String method
 * Integer method
 
  
  
 

 * Important Interview Case:
 *
 * If a class has show(String) and show(Integer),
 * calling show(null) causes a compilation error because
 * String and Integer are unrelated types.
 *
 * Example:
 * void show(String value) { }
 * void show(Integer value) { }
 *
 * Calling show(null) is ambiguous.
 */



/*
 * NULL AMBIGUITY SHORTCUT TABLE
 *
 * 1. String + Object   -> String
 * 2. Integer + Number  -> Integer
 * 3. Dog + Animal      -> Dog
 * 4. String + Integer  -> Compilation Error
 * 5. Integer + Object  -> Integer
 * 6. Number + Object   -> Number
 *
 * RULE:
 * If one type is a subtype of the other,
 * Java selects the more specific type.
 *
 * If two types are unrelated,
 * passing null causes ambiguity.
 */