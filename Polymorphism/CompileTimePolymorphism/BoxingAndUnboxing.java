package Polymorphism.CompileTimePolymorphism;

/*
 * Topic: Boxing and Unboxing in Method Overloading
 *
 * Boxing:
 * Converting a primitive value into its corresponding wrapper object.
 * Example: int -> Integer
 *
 * Unboxing:
 * Converting a wrapper object into its corresponding primitive value.
 * Example: Integer -> int
 *
 * Important Rules:
 * 1. Java prefers an exact match over other conversions.
 * 2. Primitive widening is preferred over boxing.
 * 3. An exact wrapper-type match is preferred over unboxing.
 * 4. Java does not automatically widen a primitive and then
 *    box it into a different wrapper type.
 */

class ConversionDemo {

    void show(int number) {
        System.out.println("Primitive int method");
    }

    void show(Integer number) {
        System.out.println("Wrapper Integer method");
    }

    void display(long number) {
        System.out.println("Primitive long method");
    }

    void display(Integer number) {
        System.out.println("Wrapper Integer method");
    }

    void print(double number) {
        System.out.println("Primitive double method");
    }

    void print(Long number) {
        System.out.println("Wrapper Long method");
    }
}

public class BoxingAndUnboxing {

    public static void main(String[] args) {

        ConversionDemo obj = new ConversionDemo();

        // Exact primitive match
        obj.show(10);

        // Exact wrapper match
        Integer value = 20;
        obj.show(value);

        // Primitive widening is preferred over boxing
        obj.display(30);

        // Exact wrapper match is preferred over unboxing
        obj.display(Integer.valueOf(40));

        // int widens to double; it cannot directly box into Long
        obj.print(50);
    }
}

/*
 * Expected Output:
 *
 * Primitive int method
 * Wrapper Integer method
 * Primitive long method
 * Wrapper Integer method
 * Primitive double method
 */




/*
 * ==================================================
 * 1. PRIMITIVE WIDENING TABLE
 * ==================================================
 *
 * byte  -> short, int, long, float, double
 * short -> int, long, float, double
 * char  -> int, long, float, double
 * int   -> long, float, double
 * long  -> float, double
 * float -> double
 * double -> No widening conversion
 * boolean -> No widening conversion
 *
 * ==================================================
 * 2. PRIMITIVE AND WRAPPER CLASSES
 * ==================================================
 *
 * byte    -> Byte
 * short   -> Short
 * int     -> Integer
 * long    -> Long
 * float   -> Float
 * double  -> Double
 * char    -> Character
 * boolean -> Boolean
 *
 * Boxing:
 * Converting a primitive into its wrapper object.
 * Example: int -> Integer
 *
 * Unboxing:
 * Converting a wrapper object into its primitive.
 * Example: Integer -> int
 *
 * ==================================================
 * 3. METHOD OVERLOADING PRIORITY
 * ==================================================
 *
 * Phase 1: Exact match and strict invocation conversions
 * Phase 2: Loose invocation conversions, including boxing
 * Phase 3: Variable-arity (varargs) invocation
 *
 * Important:
 * - An exact match is preferred when applicable.
 * - Primitive widening is considered before boxing.
 * - Java selects the most specific applicable method.
 * - If no unique most specific method exists,
 *   the call results in a compilation error.
 *
 * ==================================================
 * 4. IMPORTANT EXAMPLES
 * ==================================================
 *
 * Example 1:
 * Methods: show(long), show(Integer)
 * Call: show(10)
 * Result: show(long)
 * Reason: Primitive widening is considered before boxing.
 *
 * Example 2:
 * Methods: display(int), display(Integer)
 * Argument: Integer number = 10;
 * Call: display(number)
 * Result: display(Integer)
 * Reason: Exact reference-type match.
 *
 * Example 3:
 * Methods: print(double), print(Long)
 * Call: print(10)
 * Result: print(double)
 * Reason: int can widen to double, but int cannot
 * directly box into Long during overload resolution.
 */