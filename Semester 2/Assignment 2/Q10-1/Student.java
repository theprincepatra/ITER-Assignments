
package Assignment2.Q10$1;

import Assignment2.Q10$2.*;
public class Student implements Sports {
    String name ;
    int roll ;
    public void inputDetails(String name , int roll){
        this.name = name ;
        this.roll = roll ;
    }
    public void showDetails(){
        System.out.println("Name = "+this.name );
        System.out.println("roll = "+ this.roll);
    }
}
