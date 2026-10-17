package Encapsulation;

/*
Question 3: Student Details Management

Problem Statement:
Create a class named Student.

Requirements:
1. Create three private data members:
   - name (String)
   - age (int)
   - marks (double)

2. Create getter and setter methods for all three
   data members.

3. Add validation:
   - name should not be null or empty.
   - age should be greater than 0.
   - marks should be between 0 and 100 (inclusive).

4. In main():
   - Create a Student object.
   - Set name to "Tanisha".
   - Set age to 18.
   - Set marks to 85.5.
   - Try setting age to -5.
   - Try setting marks to 120.
   - Print the student's final details.

Expected Output:
Name: Tanisha
Age: 18
Marks: 85.5

Concepts:
- Encapsulation
- Private data members
- Getters and setters
- Data validation
- Controlled access to data
*/


class Student{

   private String name;
   private int age;
   private double marks;

   public void setName(String name){
        if(name != null && !name.trim().isEmpty()){
            this.name = name;
        }
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        if(age > 0){
            this.age = age;
        }
    }

    public int getAge(){
        return age;
    }

    public void setMarks(double marks){
        if(marks >= 0 && marks <= 100){
            this.marks = marks;
        }
    }

    public double getMarks(){
        return marks;
    }
} 

public class Practice03 {
    public static void main(String[] args) {
        
         Student student = new Student();
      
         student.setName("Tanisha");
         student.setAge(18);
         student.setMarks(85.5);
         student.setAge(-5); // Invalid age, should not update
         student.setMarks(120); // Invalid marks, should not update


         System.out.println("Name: " + student.getName());
         System.out.println("Age: " + student.getAge());
         System.out.println("Marks: " + student.getMarks());   
    }
}
