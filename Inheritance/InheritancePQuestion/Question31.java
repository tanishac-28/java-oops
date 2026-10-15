/*
Q31. Predict the Output

Question:

Create a parent class Animal.

1. Animal ka constructor print kare:
   "Animal constructor"

2. Animal mein ek method sound() banao jo print kare:
   "Animal sound"

Create a child class Dog that extends Animal.

3. Dog ka constructor print kare:
   "Dog constructor"

4. Dog mein sound() method override karo jo print kare:
   "Dog barks"

5. main() method mein likho:
   Animal a = new Dog();
   a.sound();

Task:
- Complete Java code likho.
- Output predict karo.
- Explain karo ki constructor aur method kis order mein execute honge.

Concepts:
- Inheritance
- Constructor Chaining
- Method Overriding
- Runtime Polymorphism
*/


package Inheritance.InheritancePQuestion;

class Animal{

    Animal(){
        System.out.println("Animal constructor");
    }

    void sound(){
        System.out.println("Animal sound");
    }
}

class Dog extends Animal{
    Dog(){
        System.out.println("Dog constructor");
    }

    void sound(){
        System.out.println("Dog barks");
    }
}

public interface Question31 {
    public static void main(String[] args) {
        
        Animal a = new Dog();
        a.sound();
    }
}


/*
Output:

Animal constructor                                                                                                                                                               
Dog constructor                   
Dog barks

*/