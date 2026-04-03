package Assignment2;
import java.util.Scanner;
public class Q04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int copy=num;
		int sum=0;
		sum+=num%10;
		num/=10;
		sum+=num%10;
		num/=10;
		sum+=num%10;
		String x=(copy>0&&copy<1000)?(sum+""):"Wrong input";
		System.out.println(x);
		
		sc.close();
	}

}
// output:
// Enter a number
// 123
// 6
