package Abstraction;

/*
Topic: Abstract Class — Payment System Design

Definition:
Abstraction exposes essential operations while hiding
implementation details. Different child classes can
implement the same abstract method in different ways.

Question 12: Design a Payment System

Expected Output:
Processing payment
Payment completed using UPI
Processing payment
Payment completed using Card
*/

abstract class Payment {

    // Abstract method
    abstract void processPayment();

    // Concrete method
    void showMessage() {
        System.out.println("Processing payment");
    }
}

class UpiPayment extends Payment {

    @Override
    void processPayment() {
        System.out.println("Payment completed using UPI");
    }
}

class CardPayment extends Payment {

    @Override
    void processPayment() {
        System.out.println("Payment completed using Card");
    }
}

public class AbstractClassPaymentSystem {

    public static void main(String[] args) {

        // Abstract class reference pointing to UpiPayment
        Payment payment = new UpiPayment();

        payment.showMessage();
        payment.processPayment();

        // Same reference now points to CardPayment
        payment = new CardPayment();

        payment.showMessage();
        payment.processPayment();
    }
}