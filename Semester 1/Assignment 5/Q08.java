package Assignment5;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int sum=0 ;
		int loopsum = 0 ;
		for (int i=1;i<=n;i++) {
			loopsum +=i;
			sum += loopsum ;
		}
		System.out.println("Sum of the series is : "+sum);
		
		sc.close();
    }
}
/*
Output:-
Enter a number : 
3
Sum of the series is : 10
*/
