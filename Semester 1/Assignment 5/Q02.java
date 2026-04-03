package Assignment5;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a number");
		int a = sc.nextInt();
		int rev=0 , copy =a;
		while (copy!=0) {
			rev=rev*10+(copy%10);
			copy/=10;
		}
		for(int i=2;i*i<(Math.max(a, rev));i++) {
			if(a % i == 0 || rev % i == 0 ) {
				System.out.println(a+" is not a twisted number.");
				System.exit(0);
			}
		}
		System.out.println(a+" is  a twisted number");

		sc.close();
    }
}

/* 
Output:-
Enter a number
97
97 is  a twisted number 
*/
