package Assignment3;
import java.util.Scanner;
public class Q04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		
		int comp = (int)(1+Math.random()*9);
		System.out.println(" Enter a number between 1 to 9 ");
		int guess = sc.nextInt();
		
		if (comp == guess) {
			System.out.println("You got it right");
		}else if(comp+1==guess || comp-1== guess) {
			System.out.println(" Almost got it ");
		}else {
			System.out.println("You got it wrong ");
		}
		System.out.println("Computer gusse was "+comp);
		
		
		
		sc.close();

	}
}
// output:
// Enter a number between 1 to 9 
// 4
// Almost got it
// Computer gusse was 5
