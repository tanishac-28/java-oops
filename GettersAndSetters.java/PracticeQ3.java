class BankAccount{
    private String name;
    private double balance;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        if(balance >= 0 ){
           this.balance = balance;
        }
    }
}

public class PracticeQ3 {
    public static void main(String[] args) {
        
        BankAccount employee1 = new BankAccount();

        employee1.setName("Tanisha");
        employee1.setBalance(50000.0);

        System.out.println(employee1.getName());
        System.out.println(employee1.getBalance());

        BankAccount employee2 = new BankAccount();
        
        employee2.setName("Bhavya");
        employee2.setBalance(-2);

        System.out.println(employee2.getName());
        System.out.println(employee2.getBalance());
    }    
}
