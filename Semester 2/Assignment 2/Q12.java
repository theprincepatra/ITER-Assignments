
package Assignment2;

public class Q12 {
    public static void main(String[] args) {
        Employee2 a = new Employee2("Rahul ", 43, 1, 2400000);
        a.empDisplay();
    }
}
class Person2 {
    String name ;
    int age ;
    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
}
class Employee2 extends Person2 {
    int Eid ;
    double salary;
    public Employee2(String name, int age, int eid, double salary) {
        super(name, age);
        this.Eid = eid;
        this.salary = salary;
    }
    public void empDisplay(){
        System.out.println("Name = "+this.name);
        System.out.println("Age = "+ this.age);
        System.out.println("Employee ID = "+ this.Eid);
        System.out.println("Salary = "+ this.salary);

    }
    

}
/*
Output:-
Name = Rahul 
Age = 43
Employee ID = 1
Salary = 2400000.0
 */
