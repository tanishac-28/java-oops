// Sample of Private Constructor :-

package Constructors;

class Student5{
    
    // Private constructor => cannot be called directly from outside the class
    private Student5(){
        System.out.println("Private Constructor called");
    }

    // Static method => can be called without creating a Student5 object
    static void createObject(){
        new Student5();          //  Student5 student = new Student5(); =>   We can also create an object like this inside the class
        System.out.println("Object Created");
    }
}

public class privateConstructor {
    public static void main(String[] args) {
        
        // calling static method without creating an object 
        Student5.createObject();
    }
}




// Example of Private Constructor:-

// package Constructors;

// class Student5{
//     String name;
//     int age;

//     private Student5(){
//         name = "Tanisha";
//         age = 18;
//     }

//     static void createObject(){
//         Student5 student = new Student5();

//         System.out.println("Name: " + student.name);
//         System.out.println("Age: " + student.age);
//     }
// }

// public class privateConstructor {
//     public static void main(String[] args) {
        
//         Student5.createObject();
//     }
// }



