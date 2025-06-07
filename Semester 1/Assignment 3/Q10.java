package Assignment3;
import java.util.Scanner;
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks");
		int m=(int)(sc.nextDouble());
		switch (m/10){
			case 9:
				System.out.println("Grade is O");
				break;
			case 8:
				System.out.println("Grade is A");
				break;
			case 7:
				System.out.println("Grade is B");
				break;
			case 6:
				System.out.println("Grade is C");
				break;
			case 5:
				System.out.println("Grade is D");
				break;
			case 4:
				System.out.println("Grade is E");	
				break;
			default:
				System.out.println("Grade is F");
				break;
		}
		sc.close();
	}
}
// output:
// Enter your marks
// Grade is O
