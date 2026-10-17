class Employee{

    private String name;
    private double salary;

    // getter
    public String getName(){
        return name;
    }
    
    // setter
    public void setName(String name){
        this.name = name;
    }

    //getter
    public double getSalary(){
        return salary;
    }

    // setter
    public void setSalary(double salary){
        this.salary = salary;
    }
}

public class PracticeQ2 {
    public static void main(String[] args) {
        
        Employee emp = new Employee();

        emp.setName("Tanisha");
        emp.setSalary(50000.0);

        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
    }   
}
