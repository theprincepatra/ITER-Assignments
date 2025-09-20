package Assignment2;

public class Q14 {
    public static void main(String[] args) {
        Measurement m = new Measurement(4, 8, 9);
        m.displayMeasurement();
    }

}
class Distance {
    int feet ;
    int inches;
    public Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }
    public void displayDistance() {
        System.out.println( "feet=" + feet + "\ninches=" + inches);
    }
    
}
class Measurement extends Distance{
    double centimeters ;

    public Measurement(int feet, int inches, double centimeters) {
        super(feet, inches);
        this.centimeters = centimeters;
    }
    public void displayMeasurement(){
        super.displayDistance();
        System.out.println("Centimeters = "+this.centimeters);
    }
}
/*
Output:-
feet=4
 inches=8
Centimeters = 9.0
 */
