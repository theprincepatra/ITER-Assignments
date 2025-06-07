package Assignment3;
import java.util.Scanner;
public class Q09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a ,b,c,first=0 , second=0;
		System.out.println("Enter three numbers ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a==b && a==c) {
			System.out.println("All number are equal");
		}else if(a==b) {
			System.out.println("A and B are Equal");
			if (a>c) {
				first =a;
				second = c;
			}else {
				second = a;
				first = c;
			}
			System.out.println("Largest number is :"+first);
			System.out.println("2nd Largest number is :"+second);
		}else if (a==c) {
			System.out.println("A and C are Equal");
			if(a>b) {
				first = a;
				second = b;
			}else {
				first = b;
				second = a;
			}
			System.out.println("Largest number is :"+first);
			System.out.println("2nd Largest number is :"+second);
		}else if (b==c) {
			System.out.println("B and C are Equal");
			if(b>a) {
				first = b;
				second =a;
			}else {
				first =a;
				second = b;
			}
			System.out.println("Largest number is :"+first);
			System.out.println("2nd Largest number is :"+second);
		}
		else{
			if (a>b && a>c) {
			first =a;
			if (b==c) {
				System.out.println("B and C are Equal");
				second = b;
			}else if (b>c) {
				second = b;
			}else {
				second =c;
			}
			
			}else if (b>c && b>a) {
				first = b;
				if (c==a) {
					System.out.println("A and C are Equal");
					second = c ;				
				}else if (c<a) {
					second = a;
				}else {
					second =c;
				}
				
			}else if (c>a && c>b) {
				first = c;
				if (a==b) {
					System.out.println("A and B are Equal");
					second = a;
				}else if (a>b) {
					second = a;
				}else {
					second = b ;
				}
			}
			System.out.println("Largest number is :"+first);
			System.out.println("2nd Largest number is :"+second);
		}
//		if (a==b) {
//			if(a>c) {
//				System.out.println("Largest number is :"+a);
//				System.out.println("2nd Largest number is : "+c);
//			}else {
//				System.out.println("Largest number is :"+c);
//				System.out.println("2nd Largest number is : "+a);
//				
//			}
//		}else if (a==c) {
//			if(a>b) {
//				System.out.println("Largest number is :"+a);
//				System.out.println("2nd Largest number is : "+b);
//			}else {
//				System.out.println("Largest number is :"+b);
//				System.out.println("2nd Largest number is : "+a);
//			}
//		}else if (b==c) {
//			System.out.println("");
//		}
		
		sc.close();
	}
}
// output:
// for---  a=5,b=5,c=5
// Enter three numbers 
// All number are equal

// for---  a=1,b=8,c=8
// Enter three numbers 
// B and C are Equal
// Largest number is :8
// 2nd Largest number is :1
