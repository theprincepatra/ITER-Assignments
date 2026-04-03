package Assignment2;
import java.util.Scanner;
public class HQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of eggs");
		int eggs =sc.nextInt();
		int gross =eggs/144;
		eggs%=144;
		int dozens=eggs/12;
		eggs%=12;
		System.out.println(gross+" gross "+dozens+" Dozens and "+eggs);
		sc.close();
	}

}
// Output:
// Enter the number of eggs  
// 200  
// 1 gross 4 Dozens and 8  
