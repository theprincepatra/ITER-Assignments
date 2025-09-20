
package Assignment2;

public class Q05 {

	public static void main(String[] args) {
		
		
	}

}
abstract class Shape{
	 abstract double area(double l);
}
class Square extends Shape {

	@Override
	double area(double side) {
		return side*side;
	}
	
}

class Trinagle extends Shape{
	@Override
	double area(double l) {
		return 0.5* l * (Math.sqrt(l*l -(( l/2)* (l/2))));
	}
	
}
class Circle extends Shape{

	@Override
	double area(double l) {
		return (Math.PI*l*l);
	}
	
}
