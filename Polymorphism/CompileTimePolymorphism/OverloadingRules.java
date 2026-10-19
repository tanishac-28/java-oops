package Polymorphism.CompileTimePolymorphism;

/*
 * Topic: Method Overloading Rules
 *
 * 1. Methods must have the same name but different parameter lists.
 * 2. Parameter lists can differ in number, type, or order.
 * 3. Changing only the return type is not method overloading.
 * 4. Changing only parameter names is not method overloading.
 * 5. Overloaded methods can have different return types if
 *    their parameter lists are different.
 * 6. Static methods can also be overloaded.
 */

class Demo {

    // Valid: Different parameter types
    void show(int number) {
        System.out.println("Integer method");
    }

    void show(double number) {
        System.out.println("Double method");
    }

    // Valid: Different number of parameters
    void display(int number) {
        System.out.println("One parameter");
    }

    void display(int number, int value) {
        System.out.println("Two parameters");
    }

    // Valid: Different parameter lists and return types
    int calculate(int number) {
        return number;
    }

    double calculate(double number) {
        return number;
    }

    // Static methods can also be overloaded
    static void print(int number) {
        System.out.println("Static integer method");
    }

    static void print(String text) {
        System.out.println("Static string method");
    }
}

public class OverloadingRules {

    public static void main(String[] args) {

        Demo obj = new Demo();

        obj.show(10);
        obj.show(10.5);

        obj.display(5);
        obj.display(5, 10);

        System.out.println(obj.calculate(20));
        System.out.println(obj.calculate(20.5));

        Demo.print(100);
        Demo.print("Java");
    }
}


/*

Output:

Integer method                              
Double method
One parameter
Two parameters
20
20.5
Static integer method
Static string method

*/