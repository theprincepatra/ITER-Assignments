package Assignment1;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
		int n = sc.nextInt();
		System.out.println((n==0)?0:(n%9==0)?9:(n%9));
		sc.close();
	}
}
// Output:-
// Enter a number
// 98
// 8
