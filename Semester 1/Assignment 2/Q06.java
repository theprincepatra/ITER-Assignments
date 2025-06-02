package Assignment2;
import java.util.Scanner;
public class Q06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter time in seconds ");
		double t=sc.nextDouble();
		System.out.println("Distance traveled in feets = "+(1.0/2)*32.174*t*t);
		
		sc.close();
		
	}

}
// output:
// Enter time in seconds 
// 3
// Distance traveled in feets = 144.783
