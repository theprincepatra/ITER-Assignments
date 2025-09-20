
package Assignment2;

public class Q08 {
    public static void main(String[] args) {
        Duck obj = new Duck("Duccky");
        obj.displayDetails();
        
    }

}
interface Flyable  {
    String fly();


    
}
interface Swimmable {
    String swim();

    
}
class Duck implements Flyable , Swimmable {

    String name ;
    

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public String swim() {
        return " can swim " ;
       
    }

    @Override
    public String fly() {
        return " can fly ";
    }
    void displayDetails(){
        System.out.println(this.name + this.fly() + " and " + this.swim() );
    }
    
}
// Output:-
// Duccky can fly  and  can swim 
