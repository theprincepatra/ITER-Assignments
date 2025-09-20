package Assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Q8and9and10 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Row and Columns of 2D-Array: ");
		int r = sc.nextInt();
		int c = sc.nextInt();
		double[][] a = new double[c][r];
		System.out.println("Enter elements of 2D-Array: ");
		for(int i = 0 ;i<r*c;i++) {
			a[i/r][i%r]= sc.nextDouble();
			
		}
		for (double[] i : a) {
			System.out.println(Arrays.toString(i));
		}
//		System.out.println(Arrays.toString(a));
		sc.close();
//		System.out.println("Sum = "+(sumMajorDiagonal(a)));
		for(int i = 0 ; i < a[0].length;i++) {
			
			System.out.println("Sum = "+sumColumn(a,i));
		}
	}

	public static double sumMajorDiagonal(double[][] m) {//Q9
		double sum = 0 ;
		for(int i = 0 ; i < m.length ;i++) {
			sum+=m[i][i];
		}
		return sum;
	}

	public static double sumColumn(double[][] m, int columnIndex) {//Q10
		double sum = 0;
		for(double[] a : m) {
			sum+=a[columnIndex];
		}
		return sum;
		
	}
}

// Output:-
// Enter number of Row and Columns of 2D-Array: 
// 3
// 3
// Enter elements of 2D-Array: 
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// [1.0, 2.0, 3.0]
// [4.0, 5.0, 6.0]
// [7.0, 8.0, 9.0]
// Sum = 12.0
// Sum = 15.0
// Sum = 18.0
