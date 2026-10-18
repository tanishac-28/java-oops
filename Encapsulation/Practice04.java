package Encapsulation;

/*
Practice 4: Product Price Management

Problem Statement:
Create a class named Product.

Requirements:
1. Create three private data members:
   - productName (String)
   - price (double)
   - quantity (int)

2. Create getter and setter methods for all data members.

3. Add validation:
   - productName should not be null or empty.
   - price must be greater than 0.
   - quantity must be 0 or greater.

4. In main():
   - Create a Product object.
   - Set productName to "Laptop".
   - Set price to 50000.
   - Set quantity to 2.
   - Try setting price to -1000.
   - Try setting quantity to -5.
   - Print the final product details.

Expected Output:
Product Name: Laptop
Price: 50000.0
Quantity: 2

Concepts:
- Encapsulation
- Private data members
- Getters and setters
- Data validation
*/


class Product{

    private String name;
    private double price;
    private int quantity;

    public void setName(String name){
         if(name != null && !name.trim().isEmpty()){
            this.name = name;
    }
}

    public String getName(){
        return name;
    }

    public void setPrice(double price){
        if(price > 0){
            this.price = price;
        }
    }

    public double getPrice(){
        return price;
    }

    public void setQuantity(int quantity){
        if(quantity > 0){
            this.quantity = quantity;
        }
    }

    public int getQuantity(){
        return quantity;
    }
}


public class Practice04 {

    public static void main(String[] args) {
       
        Product product = new Product();

        product.setName("Laptop");
        product.setPrice(100000);
        product.setQuantity(2);

        product.setPrice(-1000);
        product.setQuantity(-5);

        System.out.println("Product Name: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Quantity: " + product.getQuantity());
    }
}
