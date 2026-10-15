/*
Q16. instanceof with Downcasting

Question:
Create a parent class Animal and two child classes,
Dog and Cat.

Create an Animal reference that points to a Dog object.

Use instanceof to check whether the object is a Dog.
If it is, downcast the reference and call the bark()
method of Dog.

Expected Output:
Dog is barking

Concept:
Use instanceof to check the object's type before
downcasting to avoid an invalid cast.
*/

package Inheritance.InheritancePQuestion;

class Animal{

}

class Dog extends Animal{

    void bark(){
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal{

}


public class Question16 {
    public static void main(String[] args) {
        
        Animal a = new Dog();

        if(a instanceof Dog){
            Dog d = (Dog) a;
            d.bark();
        }

    }
}
