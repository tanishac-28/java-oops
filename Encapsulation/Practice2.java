/*
Question 12: Bank Account Management

Problem Statement:
Create a class named BankAccount.

Requirements:
1. Create two private data members:
   - accountHolder (String)
   - balance (double)

2. Create getter and setter methods for accountHolder.

3. Create a getter method for balance.

4. Create a deposit(double amount) method:
   - Deposit money only if amount > 0.
   - Otherwise, do not change the balance.

5. Create a withdraw(double amount) method:
   - Withdraw money only if amount > 0
     and amount <= balance.
   - Otherwise, do not change the balance.

6. In main():
   - Create a BankAccount object.
   - Set accountHolder to "Tanisha".
   - Deposit 5000.
   - Withdraw 2000.
   - Try withdrawing 4000.
   - Print account holder and final balance.

Expected Output:
Name: Tanisha
Final Balance: 3000.0

Concepts:
- Encapsulation
- Private data members
- Getters and setters
- Data validation
- Controlled access to data
*/

package Encapsulation;

class BankAccount{

    private String name;
    private double balance;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance = balance + amount;
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance = balance - amount;
        }
    }
}

public class Practice2 {
    public static void main(String[] args) {
        
        BankAccount acc = new BankAccount();

        acc.setName("Tanisha");
        acc.deposit(5000);
        acc.withdraw(2000);
        acc.withdraw(4000);

        System.out.println("Name: " + acc.getName());
        System.out.println("Final Balance: " + acc.getBalance());
    }
}
