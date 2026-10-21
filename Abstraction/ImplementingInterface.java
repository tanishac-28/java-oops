/*
Topic: Abstract Class Implementing an Interface

Definition:
An abstract class can implement an interface without
implementing all its methods. A concrete child class
must implement any remaining abstract methods.

Question 11: Abstract Class and Interface

Requirements:
1. Create an interface named Printable.
2. Declare a method named print().
3. Create an abstract class named Document that implements Printable.
4. Declare an abstract method named getDocumentType() in Document.
5. Create a class named PDFDocument that extends Document.
6. Implement print() to print:
   "Printing PDF document"
7. Implement getDocumentType() to print:
   "Document type: PDF"
8. Create a PDFDocument object in main().
9. Call both methods.

Expected Output:
Printing PDF document
Document type: PDF
*/

package Abstraction;

interface Printable{

    void print();
}

abstract class Document implements Printable{

    abstract void getDocumentType();
}

class PDFDocument extends Document{

    @Override 
    public void print(){
        System.out.println("Printing PDF document");
    }

    @Override 
    void getDocumentType(){
        System.out.println("Document Type: PDF");
    }
}

public class ImplementingInterface {
    public static void main(String[] args) {
        
        PDFDocument document = new PDFDocument();

        document.print();
        document.getDocumentType();
    }
}
