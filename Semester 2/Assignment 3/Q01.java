package Assignment3;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);		
		
		System.out.println("ENter a number ");
		int n = sc.nextInt();
		try{
			if(n<0) {
				throw new NumberFormatException("Number is negative");
			}
			System.out.println("No error Found");
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}finally {
			sc.close();
		}
	}

}
