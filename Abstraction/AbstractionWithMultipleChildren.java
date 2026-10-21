/*
Topic: Abstract Class — Multiple Child Classes

Definition:
An abstract class reference can point to objects of
different concrete child classes. At runtime, the
overridden method of the actual object is executed.

Question 9: Multiple Child Classes

Requirements:
1. Create an abstract class named Notification.
2. Declare an abstract method named send().
3. Create an EmailNotification class that extends Notification.
4. Implement send() to print:
   "Sending Email"
5. Create an SMSNotification class that extends Notification.
6. Implement send() to print:
   "Sending SMS"
7. In main(), create a Notification reference for an
   EmailNotification object and call send().
8. Reuse the same reference for an SMSNotification object
   and call send() again.

Expected Output:
Sending Email
Sending SMS
*/


package Abstraction;

abstract class Notification {
    abstract void send();
}

class EmailNotification extends Notification{

    @Override
    void send() {
        System.out.println("Sending Email");
    }
}

class SMSNotification extends Notification{

    @Override 
    void send(){
        System.out.println("Sending SMS");
    }
}

public class AbstractionWithMultipleChildren {
    public static void main(String[] args) {
        
        Notification notification = new EmailNotification();
        notification.send();

        notification = new SMSNotification();
        notification.send();
    }
}
