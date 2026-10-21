/*
Topic: Abstract Class — Final Method

Definition:
A final method cannot be overridden by a child class.
However, an abstract class can contain a final concrete
method along with abstract methods.

Question 6: Final Method in an Abstract Class

Requirements:
1. Create an abstract class named Bank.
2. Add a final method named bankPolicy() that prints:
   "Bank policy is fixed"
3. Declare an abstract method named getInterestRate().
4. Create a class named SBI that extends Bank.
5. Implement getInterestRate() to print:
   "SBI interest rate is 7%"
6. Create an SBI object in main().
7. Call both methods.

Expected Output:
Bank policy is fixed
SBI interest rate is 7%
*/


package Abstraction;

abstract class Bank{

    // Final method cannot be overridden
    final void bankPolicy(){
        System.out.println("Bank Policy is Fixed....");
    }

    // Abstract method must be implemented by a concrete child
    abstract void getInterestRate();
}

class SBI extends Bank{

    @Override 
    void getInterestRate(){
        System.out.println("SBI interest is 7% ");
    }
}

public class AbstractClassFinalMethod {
    public static void main(String[] args) {
        
        SBI sbi = new SBI();

        sbi.bankPolicy();
        sbi.getInterestRate();
    }
}
