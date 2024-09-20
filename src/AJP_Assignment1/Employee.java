package AJP_Assignment1;

public class Employee {
    protected String name;
    protected String id;
    protected double salary;

    public Employee(String name, String id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void displayEmployeeInfo(){
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("Salary : "+salary);
    }
}

class Manager extends Employee {
    protected double bonus;

    public Manager(String name, String id, double salary, double bonus){
        super(name, id, salary);
        this.bonus = bonus;
    }
    public void displayManagerInfo(){
        displayEmployeeInfo();
        System.out.println("Bonus : "+bonus);
    }
}

class EmployeeMain{
    public static void main(String[] args){
        Employee emp = new Employee("John Smith", "101", 60000);
        System.out.println("Employee Details:");
        emp.displayEmployeeInfo();

        System.out.println();

        Manager manager = new Manager("Karan Johar", "104", 80000, 20000);
        System.out.println("Manager Details:");
        manager.displayManagerInfo();
    }
}





