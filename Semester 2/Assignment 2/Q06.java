package Assignment2;

public class Q06 {
    public static void main(String[] args) {
        Car2 obj1 = new Car2("Mark IV supra ", 1993, 666, 8500000); 
        obj1.carDisplay();
    }

}
class Vehicle {
    String model ;
    int year;
    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }
    
}
class Car2 extends Vehicle{//  changed Car to Car2  cause there is also a class named Car in file Q01.java and both file are in  same package . Which causes error.
    int carID ;
    double price;
    public Car2(String model, int year, int carID, double price) {
        super(model, year);
        this.carID = carID;
        this.price = price;
    }
    void carDisplay(){
        System.out.println("Model = "+this.model);
        System.out.println("Year = "+ this.year);
        System.out.println("Car ID = "  + this.carID);
        System.out.println("Price = "+ this.price);
    }
    
}
/*
Model = Mark IV supra 
Year = 1993
Car ID = 666
Price = 8500000.0
 */
