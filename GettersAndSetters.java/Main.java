/*
🌟 TOPIC: GETTERS AND SETTERS IN JAVA

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
1️⃣ WHAT IS A GETTER?
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

A getter is a method used to return the value
of a private instance variable.

Syntax:
public int getMarks() {
    return marks;
}

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
2️⃣ WHAT IS A SETTER?
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

A setter is a method used to set or update
the value of a private instance variable.

Syntax:
public void setMarks(int marks) {
    this.marks = marks;
}

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
3️⃣ WHY DO WE USE THEM?
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

✔ Controlled access to private variables.
✔ Validation before updating data.
✔ Support encapsulation.
✔ Avoid direct access to internal data.

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
4️⃣ WHAT IS 'this' KEYWORD?
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

'this' refers to the current object.

this.marks → Instance variable
marks      → Method parameter

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
5️⃣ WRONG CODE ❌
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

public void setMarks(int marks) {
    marks = marks;
}

Problem:
The parameter is assigned to itself.
The instance variable remains unchanged.

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
6️⃣ CORRECT CODE ✅
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

public void setMarks(int marks) {
    this.marks = marks;
}

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
7️⃣ TIME & SPACE COMPLEXITY
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

Getter Time Complexity: O(1)
Setter Time Complexity: O(1)
Auxiliary Space: O(1)
*/

// COMPLETE WORKING CODE

class Student {

    private int marks;

    // Getter method
    public int getMarks() {
        return marks;
    }

    // Setter method
    public void setMarks(int marks) {
        this.marks = marks;
    }
}

public class Main {

    public static void main(String[] args) {

        Student student = new Student();

        student.setMarks(90);

        System.out.println(student.getMarks());
    }
}

/*
OUTPUT:
90
*/
