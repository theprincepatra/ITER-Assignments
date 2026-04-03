package Assignment3;
import java.util.Scanner;
public class Q08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the x coordinates : ");
		double x =sc.nextDouble();
		System.out.println("Enter the y coordinates : ");
		double y =sc.nextDouble();
		if (x==0 && y==0) {
			System.out.println("the point is the Origin");
		}else if(x == 0){
			System.out.println("The point is on y-axis");
		}else if(y ==0) {
			System.out.println("The point is on x-axis");

		}else if (y>0) {
			if(x>0) {
				System.out.println("The point is in quadrant I");
			}else {
				System.out.println("The point is in quadrant II");
				
			}
		}else {
			if(x>0) {
				System.out.println("The point is in quadrant IV");
			}else {
				System.out.println("The point is in quadrant III");
				
			}
			
		}
		
		sc.close();
	}
}
// output:
// Enter the x coordinates : -2
// Enter the y coordinates : 6
// The point is in quadrant II
