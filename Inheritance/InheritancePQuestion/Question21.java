/*
Q21. Abstract Class with Dynamic Method Dispatch

Question:
Create an abstract class Payment with an abstract
method pay().

Create two child classes:
1. CreditCardPayment
2. UpiPayment

Override the pay() method:
CreditCardPayment prints "Payment through Credit Card".
UpiPayment prints "Payment through UPI".

In the main() method:
1. Create a Payment reference pointing to a
   CreditCardPayment object.
2. Call the pay() method.
3. Change the same reference to point to a
   UpiPayment object.
4. Call the pay() method again.

Expected Output:
Payment through Credit Card
Payment through UPI

Concept:
An abstract class can declare abstract methods
that child classes must implement.

Dynamic Method Dispatch executes the overridden
method according to the actual object at runtime.
*/


package Inheritance.InheritancePQuestion;

abstract class Payment{
    abstract void pay();
}

class CreditCardPayment extends Payment{

    @Override 
    void pay(){
        System.out.println("Payment through Credit card");
    }
}

class UpiPayment extends Payment{

    @Override 
    void pay(){
        System.out.println("Payment through UPI");
    }
}

public class Question21 {
    public static void main(String[] args) {
        
        Payment p = new CreditCardPayment();
        p.pay();

        p = new UpiPayment();
        p.pay();
    }
}
