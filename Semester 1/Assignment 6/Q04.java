package Assignment6;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int days =0;
		System.out.println("Enter two years :");
		int start = sc.nextInt();
		int end = sc.nextInt();
		while(start <= end) {
			days+=numberOfDaysInAYear(start);
			start++;
		}
		System.out.println("No. of days = "+days);
		sc.close();
	}
	public static int numberOfDaysInAYear(int year) {
		return (isLeap(year)? 366 :365);
	}
	public static boolean isLeap(int year) {
		if((year % 4 == 0 && year % 100 != 0 )|| ( year % 400 == 0)){
			return true ;
		}
		return false ;
	}


}
//Output:-
//Enter two years :
//2000
//2020
//No. of days = 7671
