package Assignment2;
import java.util.Scanner;
public class Q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the Hemisphere ");
		double rad=sc.nextDouble();
		double sa=rad*rad*3*Math.PI;
		System.out.println("Surface area of the Hemisphere= "+sa);
		double v=(2.0/3)*rad*rad*rad*Math.PI;
		System.out.println("Volume o9f the Hemisphere = "+v);
		
		sc.close();
	}

}
// output:
// Enter the radius of the Hemisphere 
// 2
// Surface area of the Hemisphere= 37.69911184307752
// Volume o9f the Hemisphere = 16.755160819145562
