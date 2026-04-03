package Assignment6;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of sides ");
		int s = sc.nextInt();
		System.out.println("ENter the length of a side ");
		double d = sc .nextDouble();
		System.out.println("Area of the polygon = "+area(s, d));
		sc.close();
	}
	public static double area(int n, double side) {
		return (n *side*side)/(4*Math.tan(Math.PI/n));
	}


}

//Output:-
//Enter the number of sides 
//4
//ENter the length of a side 
//2
//Area of the polygon = 4.000000000000001
