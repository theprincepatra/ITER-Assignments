package Assignment5;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		double sum=1;
		for (int i=2;i<=n;i++) {
			sum+=(1.0/(i*i));
		}
		System.out.println("Sum of the series is : "+sum);
		
		sc.close();
    }
}

/*
Output:-

Enter a number : 
3
Sum of the series is : 1.3611111111111112

 */
