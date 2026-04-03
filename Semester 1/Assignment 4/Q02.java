import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int sum=0 ,copy=num;
		while (num!=0) {
			sum+=num%10;
			num/=10;
		}
		if(sum%9==0) {
			System.out.println("The number "+copy+" is divisible by 9.");
		}else {
			System.out.println("The number "+copy+" is not divisible by 9.");
			
		}
		sc.close();
	}

}
output:
Enter a number: 123
The number 123 is not divisible by 9.
