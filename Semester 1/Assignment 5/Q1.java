package Assignment5;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int a =sc.nextInt();
		System.out.println("Enter another number");
		int b =sc.nextInt();
		
		int sum =0;
		for (int i = 1;i<=a/2;i++) {
			if(a%i==0) {
				sum+=i;
			}
		}
//		System.out.println(sum);
		if(sum==b) {
			sum=0;
			for (int i = 1;i<=b/2;i++) {
				if(b%i==0) {
					sum+=i;
				}
			}
			System.out.println(sum);
			if(sum==a) {
				System.out.print(a+" and "+b+" are Amicable numbers.");
			}	
		}else {
			System.out.print(a+" and "+b+" are not Amicable numbers.");
			
		}
		sc.close();
    }
}

// Output:-

// Enter a number 
// 220
// Enter another number
// 284
// 220
// 220 and 284 are Amicable numbers.
