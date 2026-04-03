package Assignment3;
import java.util.Scanner;

public class Q06andQ07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		Q6
		
		System.out.println("Enter your energy consumption in units :");
		int unit = sc.nextInt();
		double bill=0;
		if (unit <=50) {
			bill =unit *3;
		}else if (unit <=200) {
			bill = ((unit-50)*4.80)+150;
		}else if (unit <=400) {
			bill =((unit -200)*5.80)+150+720;
		}else if (unit >400){
			bill =((unit -400)*6.20)+2030;
		}
		else {
			System.out.println("Enter a valid value of unit ");
		}
		System.out.println("Your bill is : Rs. "+bill+"/-");
		
		
//		if (unit >400) {
//			bill=unit *6.20;
//			System.out.println("Your bill is : Rs. "+bill+"/-");
//		}else if (unit >200) {
//			bill=unit *5.80;
//			System.out.println("Your bill is : Rs. "+bill+"/-");
//		}else if (unit>50) {
//			bill=unit *4.80;
//			System.out.println("Your bill is : Rs. "+bill+"/-");
//		}else if (unit >=0) {
//			bill=unit *3;
//			System.out.println("Your bill is : Rs. "+bill+"/-");
//			
//		}else {
//			System.out.println(" Enter a valid unit ");
//		}
		
//		Q7
		
		System.out.println("Do you want to pay online ? /n you will get a discount of 3% (y/n) :");
		char a= sc.next().charAt(0);
		if (a=='y') {
			System.out.println(" Payable amount "+ (bill*0.97));
			
		}
		
		
		sc.close();

	}

}
