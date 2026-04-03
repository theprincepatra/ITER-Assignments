package Assignment2;
import java.util.Scanner;
public class Q01{
	public static void main(String[] args) {
		System.out.print("Enter Temperature in Fahrenheit  ");
		Scanner sc =new Scanner(System.in);
		double f= sc.nextDouble();
		double c=(f-32)*5.0/9;
		System.out.println(f+" Fahrenheit is "+c+" Celsius ");
		sc.close();
	}

}
// output:
// Enter Temperature in Fahrenheit  98.6 Fahrenheit is 37.0 Celsius 
