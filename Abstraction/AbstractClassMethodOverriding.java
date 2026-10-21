/*
Topic: Abstract Class — Method Overriding

Definition:
A concrete child class must implement inherited abstract
methods. A child class can also override a concrete
parent method to provide its own implementation.

Question 8: Abstract and Concrete Method Overriding

Requirements:
1. Create an abstract class named Payment.
2. Declare an abstract method named pay().
3. Create a concrete method named receipt() that prints:
   "Payment receipt generated"
4. Create a class named UpiPayment that extends Payment.
5. Implement pay() to print:
   "Payment completed using UPI"
6. Override receipt() to print:
   "UPI receipt generated"
7. Create a UpiPayment object in main().
8. Call both methods.

Expected Output:
Payment completed using UPI
UPI receipt generated
*/


package Abstraction;

abstract class Payment{

    abstract void pay();

    void receipt(){
        System.out.println("Paayment receipt generated");
    }
}

class UpiPayment extends Payment{

    void pay(){
        System.out.println("Payment completed using UPI");
    }

    @Override 
    void receipt() {
        System.out.println("UPI receipt generated");
    }
}

public class AbstractClassMethodOverriding {
    public static void main(String[] args) {
        
        UpiPayment upi = new UpiPayment();

        upi.pay();
        upi.receipt();
    }
}
