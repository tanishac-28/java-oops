package Inheritance;

// Parent class
class Parent{
    Parent(){
        System.out.println("Parent class constructor called");
    }
}

// Child class
class Child extends Parent{

    Child(){
        System.out.println("Child class Constructor called");
    }
}
// Main class
public class ConstructorExecutionInheritance {
    public static void main(String[] args) {
        
        Child obj = new Child();
    }
}
