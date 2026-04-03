import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a =sc.nextInt();
		System.out.println("Enter second number : ");
		int b =sc.nextInt();
		System.out.println("Enter third number : ");
		int c =sc.nextInt();
		
		int sum =0;
		for (int i =a ;i<=b ;i+=c) {
			System.out.print(i+" ");
			sum+=i;
		}System.out.println();
		
		System.out.println("The sum of number displayed is "+sum);
		sc.close();
	}

}
output:
Enter first number : 10
Enter second number : 15
Enter third number : 1
10 11 12 13 14 15 
The sum of number displayed is 75
