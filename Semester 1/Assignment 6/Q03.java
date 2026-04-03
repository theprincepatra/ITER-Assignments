package Assignment6;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();
		System.out.println("The given number is palindrome : "+ isPalindrome(num));
		sc.close();
		
	}
	public static int reverse(int number) {
		int rev = 0 ;
		while(number!=0) {
			int r = number%10;
			rev = rev*10 +r ;
			number /= 10;
		}
		return rev;
	}
	public static boolean isPalindrome(int number) {
		
		return (number == (reverse(number)));
	}

}
//Output
//Enter a number 
//929
//The given number is palindrome : true

//Enter a number 
//920
//The given number is palindrome : false
