package Assignment1;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Weight in Kg and height in meters");
		double w = sc.nextDouble();
		double h = sc.nextDouble();
		double BMI = w/(h*h);
		if(BMI >= 30.0) {
			System.out.println("Obese");
		}else if(BMI > 25.0) {
			System.out.println("Overweight");
		}else if (BMI > 18.5) {
			System.out.println("Normal Weight");
		}else if (BMI > 0) {
			System.out.println("UnderWeight");
		}else {
			System.out.println("Wrong Input");
		}
		sc.close();
	}
}
// output:-
// Enter Weight in Kg and height in meters
// 68
// 2
// UnderWeight
