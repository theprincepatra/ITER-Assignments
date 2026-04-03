package Assignment2;
import java.util.Scanner;
public class HQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		double min= sc.nextDouble();
		double days =min/(1440);
		double year=days/365;
		days=days%365;
		System.out.println((int)year);
		System.out.println((int)days);
//		double s=Math.sqrt(year);
		
		
		sc.close();
		
	}

}
// output:
// 2  
// 121  
