
package Assignment2;

public class Q07 {

    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle("Blue", 5.5, 6.5);
        Circle obj2 = new Circle("Red", 5);
        obj1.display();
        obj2.display();
    }

}
class Shape{
    String color ;

    public Shape(String color) {
        this.color = color;
    }
}
class Rectangle extends Shape{
    double length ; 
    double width ;
    public Rectangle(String color ,double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    } 
    public double area(){
        return this.length * this.width ;
    }
    public void display(){
        System.out.println("This is a Rectangle");
        System.out.println("Color = "+ this.color);
        System.out.println("area = "+ this.area());
        System.out.println("length = "+ this.length);
        System.out.println("width = "+ this.width);
    }
    
}
class Circle  extends Shape{
    double radius ;

    public Circle(String color ,double radius) {
        super(color);
        this.radius = radius;

    } 
    public void display(){
        System.out.println("This is a Circle ");
        System.out.println("Color = "+ this.color);
        System.out.println("area = "+ this.area());
        System.out.println("Radius = "+ this.radius);
    }
    public double area(){
        return this.radius * this.radius *Math.PI;
    }
    

    
}
/* 
Output:-
This is a Rectangle
Color = Blue
area = 35.75
length = 5.5
width = 6.5
This is a Circle
Color = Red
area = 78.53981633974483
Radius = 5.0
*/
