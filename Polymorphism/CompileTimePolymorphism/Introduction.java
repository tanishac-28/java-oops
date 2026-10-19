package Polymorphism.CompileTimePolymorphism;

/*
 Compile-Time Polymorphism
 
  Definition:
  Compile-time polymorphism is a type of polymorphism in which
  the compiler determines which overloaded method to call.
 
  It is achieved through method overloading in Java.
 
  Method Overloading:
  Multiple methods can have the same name but different
  parameter lists.
 
  Advantages:
  1. Improves code readability.
  2. Allows similar operations with different arguments.
  3. Enables compile-time method selection.
 */


class Calculater{

    //Overloaded method for integer arguments
    void add(int a, int b){
        System.out.println("Integer Sum: " + (a+b));
    }

    // Overloaded method for double arguments
    void add(double a , double b){
        System.out.println("Double Sum: " + (a+b));
    }
}

public class Introduction {
    
    public static void main(String[] args) {
        
        Calculater calculater = new Calculater();

        calculater.add(10, 20);
        calculater.add(10.5, 20.5);
    }
}
