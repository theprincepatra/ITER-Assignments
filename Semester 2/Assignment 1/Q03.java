package Assignment1;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int s = 0 , p = 1;
		while (n!=0) {
			s+= n%10;
			p*= n%10;
			n/=10;
		}
		if(s == p) {
			System.out.println("Spy number ");
		}else {
			System.out.println("Not A spy number");
		}
		sc.close();
	}
}
// Output:-
// Enter a number
// 132
// Spy number 
