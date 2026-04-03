package Assignment5;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		int a = 0 ,b=1,c=1;
        System.out.println("Enter the number of terms you want.");
		int n = sc.nextInt();
		int sum=a+b+c,temp,temp2;
		System.out.print(a+" "+b+" "+c+" ");
		int count =3;
		while(count<n-1) {
			System.out.print(sum+" ");
			temp = c;
			c=sum;
			temp2 =b;
			b=temp;
			a=temp2;
			sum=a+b+c;
			count++;
		}
		System.out.println(sum);
		sc.close();

    }
}

/*
Output:-
Enter the number of terms you want.
5
0 1 1 2 4 7
 */
