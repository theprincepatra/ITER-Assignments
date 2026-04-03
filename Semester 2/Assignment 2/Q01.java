package Assignment2;

import java.util.Scanner;

public class Q01 {
		public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Car obj1 = new Car();
		obj1.model = "Toyota";
		obj1.year = 2020;
		Car obj2 = new Car();
		System.out.println("Input Modal and year");
		obj2.setDetails(sc.next(), sc.nextInt());
		obj1.displayDetails();
		obj2.displayDetails();
		sc.close();
		

	}

}
class Car{
	String model ; 
	int year ;
	
	void setDetails(String model , int year) {
		this.model = model;
		this.year = year ;
	}
	void displayDetails() {
		System.out.println("Model = "+ this.model);
		System.out.println("Year = "+ this.year);
	}
}
/*
Output:-
Input Modal and year
Konisegg
2021
Model = Toyota
Year = 2020
Model = Konisegg
Year = 2021
*/
