// Experiment 2: Factorial of a Number

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial: " + fact);
    }
}

/*
Input:
5
Output:
120

Input:
0
Output:
1

Input:
10
Output:
3628800

Note:
For very large n, factorial exceeds long capacity → Overflow
*/
