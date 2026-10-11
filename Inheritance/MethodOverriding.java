/*
Concept: Method Overriding

Method overriding occurs when a child class provides
its own implementation of a method from the parent class.

Rules:
1. Method name and parameters must be the same.
2. Return type must be the same or covariant.
3. Child method cannot reduce access privileges.
4. Private methods cannot be overridden.
5. Static methods are hidden, not overridden.
6. Final methods cannot be overridden.
*/


package Inheritance;

// Parent class
class BankAccount{
    public void calculateInterest(){
        System.out.println("Calculating basic intrest");
    }
}

// Child class
class SavingsAccount extends BankAccount{

    @Override 
    public void calculateInterest(){
        System.out.println("Calculating savings account intrest");
    }
}

// Main class
public class MethodOverriding {

    public static void main(String[] args) {
        
        BankAccount account = new BankAccount();
        account.calculateInterest();

        SavingsAccount savings = new SavingsAccount();
        savings.calculateInterest();
    }
}