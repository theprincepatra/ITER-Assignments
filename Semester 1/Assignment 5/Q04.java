package Assignment5;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of m : ");
		int m =sc.nextInt();
		System.out.println("Enter the value of n : ");
		int n =sc.nextInt();
		if(m>n) {
			m+=n;
			n=m-n;
			m=m-n;
		}
		long fact;
		for (int i = m ; i<=n ;i++) {
			fact = 1;
			for(int j = 2;j<=i;j++) {
				fact*=j;
			}
			System.out.println("Factorial of "+i+" is :"+fact);
		}
		sc.close();
    }
}
/*
Output:- 

Enter the value of m : 
2
Enter the value of n :
5
Factorial of 2 is :2
Factorial of 3 is :6
Factorial of 4 is :24
Factorial of 5 is :120

*/
