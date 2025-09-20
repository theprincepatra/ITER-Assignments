package Assignment2;

public class Q09 {
    public static void main(String[] args) {
        Manager obj = new Manager("Subh", 50000, "Food");
        obj.displayManagerDetails();
    }
}

class Employee{
    String name ;
    int salary ;
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    void displayEmployeeInfo(){
        System.out.println("Name = "+this.name);
        System.out.println("Salary = "+ this.salary);
    }

}
class Manager extends Employee {
    String department ;

    public Manager(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
    }
    void  displayManagerDetails(){
        super.displayEmployeeInfo();
        System.out.println( "Department = " + this.department);
    }
    
}
/*
Output :- 
Name = Subh
Salary = 50000
Department = Food
 */
