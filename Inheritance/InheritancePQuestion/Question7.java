/*
Q7. Private Method in Inheritance

Question:
Create a parent class Bank with a private method
showPin() that prints "PIN is private".

Create a child class ATM that extends Bank.

Create an ATM object in main() and try to call
showPin() directly.

Expected Result:
Compilation error.

Explanation:
A private method cannot be accessed directly
outside its own class. The child class ATM
cannot directly access the private showPin()
method of Bank.

Concept:
Private methods are not inherited in a way
that allows direct access or overriding.
*/


package Inheritance.InheritancePQuestion;

class Bank{
    private void showPin(){
        System.out.println("PIN is private");
    }
}

class ATM extends Bank{
}


public class Question7 {
    public static void main(String[] args) {
        ATM a = new ATM();
        a.showPin();
    } 
}