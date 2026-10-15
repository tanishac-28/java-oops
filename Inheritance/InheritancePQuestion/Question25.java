/*
Q25. Inheritance with Method Overriding and Reference Type

Question:
Create a parent class BankAccount.

1. Add a method calculateInterest() that prints
   "Bank account interest".

Create a child class SavingsAccount that extends BankAccount.

1. Override calculateInterest() to print
   "Savings account interest: 4%".

Create another child class CurrentAccount that extends BankAccount.

1. Override calculateInterest() to print
   "Current account interest: 2%".

In the main() method:
1. Create a BankAccount reference pointing to a
   SavingsAccount object.
2. Call calculateInterest().
3. Change the same reference to point to a
   CurrentAccount object.
4. Call calculateInterest() again.
5. Create a new BankAccount object and call
   calculateInterest().

Expected Output:
Savings account interest: 4%
Current account interest: 2%
Bank account interest

Interview Follow-up:
Does the reference variable's type or the actual
object determine which overridden method executes?

Concept:
Dynamic Method Dispatch selects the overridden method
according to the actual object at runtime.
*/


package Inheritance.InheritancePQuestion;

class BankAccount{

    void calculateInterest(){
        System.out.println("Bank account interest");
    }
}

class SavingsAccount extends BankAccount{

    @Override 
    void calculateInterest(){
        System.out.println("Savings account interest: 4%");
    }
}

class CurrentAccount extends BankAccount{

    @Override 
    void calculateInterest(){
        System.out.println("Current account interest: 2%");
    }
}

public class Question25 {
    public static void main(String[] args) {
        
        BankAccount acc = new SavingsAccount();
        acc.calculateInterest();

        acc = new CurrentAccount();
        acc.calculateInterest();

        acc = new BankAccount();
        acc.calculateInterest();
    }
}

