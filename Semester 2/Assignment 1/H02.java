package Assignment1;

import java.util.Scanner;

public class HQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines u want to enter ");
        int n = sc.nextInt();
        String[] lines = new String[n];
        for(int i = 0 ; i < n ; i++){
            System.out.println("Enter " + (n-i ) + " more lines ");
            lines[i] = sc.nextLine();
            if (i==0) { // for takaling the error which scanner class gives.
                lines[i] = sc.nextLine();
            }
        }
        System.out.println("\nLines in reverse order.");
        for (int i = n-1; i >= 0; i--) {
            System.out.println(lines[i]);
        }
 


        sc.close();
    }
}
/*
Output :-
Enter the number of lines u want to enter 
3
Enter 3 more lines 
2
Enter 2 more lines 
1
Enter 1 more lines 
0

Lines in reverse order.
0
1
2
*/
