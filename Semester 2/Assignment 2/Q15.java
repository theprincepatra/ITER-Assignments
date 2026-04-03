
package Assignment2;

public class Q15 {
    public static void main(String[] args) {
        PointType p = new PointType(0, 0);
        CircleType c = new CircleType(4, p);
        c.area();
        c.parameter();
    }

}
class PointType{
    double x ,y ;
 
    public PointType(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
}
class CircleType {
    double radius ;
    PointType p ;
    public CircleType(double radius, PointType p) {
        this.radius = radius;
        this.p = p;
    }
    public void area(){
        System.out.println("Area = "+ Math.PI*this.radius*this.radius);
    }
    public void parameter(){
        System.out.println("Perimeter = "+ this.radius*2*Math.PI);
    }
    

}
/*
Output:- 
Area = 50.26548245743669
Perimeter = 25.132741228718345
 */
