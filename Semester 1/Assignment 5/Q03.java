package Assignment5;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		boolean flag ;
		System.out.println("Enter the first number : ");
		int a = sc.nextInt();
        System.out.println("Enter the second number : ");
		int b = sc.nextInt();
		System.out.print("Prime number between "+a+" and "+b+" are :");
		for (int i = a ; i <= b ; i++) {
			flag =true;
			for (int j = 2 ; j*j <=i ;j++) {
				if(i % j == 0 ) {
					flag = false;
				}
			}
			if(flag) {
				System.out.print(" "+i);
			}
		}
		
		sc.close();
    }
}

/*
Output:-
Enter the first number :
4
Enter the second number : 
15
Prime number between 4 and 15 are : 5 7 11 13
 */
