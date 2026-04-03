package Assignment2;
import java.util.Scanner;

public class HQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter  codinates");
		System.out.println("Enter X1");
		double x1=sc.nextDouble();
		
		System.out.println("Enter X2");
		double x2=sc.nextDouble();
		
		System.out.println("Enter X3");
		double x3=sc.nextDouble();

		System.out.println("Enter Y1");
		double y1=sc.nextDouble();

		System.out.println("Enter Y2");
		double y2=sc.nextDouble();

		System.out.println("Enter Y3");
		double y3=sc.nextDouble();

		// length of side 1 
		double s1 = Math.pow((Math.pow((y2-y1), 2))+Math.pow((x2-x1), 2), 0.5);
		
		// length of side 2 
		double s2 = Math.pow((Math.pow((y3-y2), 2))+Math.pow((x3-x2), 2), 0.5);
		
		// length of side 3 
		double s3 = Math.pow((Math.pow((y1-y3), 2))+Math.pow((x1-x3), 2), 0.5);

		// Using Heron's formula
		double S =(s1+s2+s3)/2;

		double area =Math.pow((S*(S-s1)*(S-s2)*(S-s3)), 0.5);

		System.out.println("Area of the Triangle is "+ area);
		sc.close();
		

	}

}

// output
// Enter Cordinates :-
// Enter x1
// 1.5
// Enter X2
// 4.6
// Enter X3
// 9.5
// Enter Y1
// -3.4
// Enter Y2
// 5
// Enter Y3
// -3.4
// Area of the Triangle is 33.600000000000016
