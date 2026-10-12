/*
Concept: super Keyword - Calling Parent Class Method

The 'super' keyword is used to call a method
from the immediate parent class.

When a child class overrides a parent class method,
super.methodName() calls the parent's implementation.
*/

package Inheritance;

// Parent class
class Bank{
    
    void displayMessage(){
        System.out.println("Welcome to the bank");
    }
}

// Child class
class SBI extends Bank{

    @Override 
    void displayMessage(){
        super.displayMessage();

        System.out.println("Welcome to SBI Bank");
    }
}


public class superMethod {

    public static void main(String[] args) {
        SBI account = new SBI();
        account.displayMessage();
    }
}