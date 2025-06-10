package Assignment5;

import java.util.Scanner;

public class HQ5 {
    public static void main(String[] args) {
        int a = -1 ,b = 1 ,temp ,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms ");
        n=sc.nextInt();
        while (n>0) {
            temp = b ;
            b += a ;
            System.out.print(b+" ");
            a = temp ;
            n--;
        }

        sc.close();
    }
}

/*
Output:-
Enter the number of terms 
7
0 1 1 2 3 5 8
 */
