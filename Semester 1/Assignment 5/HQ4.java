package Assignment5;

import java.util.Scanner;

public class HQ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter angle in Degree");
        double x = Math.toRadians(sc.nextDouble());
        double cosX = 1 ; //first term 
        double term = 1; 
        int n =2;
        
        while (Math.abs(term) > 1e-6) {
            term *= (-x*x)/(n*(n-1));
            cosX +=term;
            n+=2;
        }
        System.out.println("Calculated value = "+cosX);
        System.out.println("Default Method value = "+Math.cos(x));
        System.out.println("Error = "+(cosX-Math.cos(x)));
        sc.close();
    }
}

/*
Output:- 

Enter angle in Degree
30
Calculated value = 0.8660254042103523
Default Method value = 0.8660254037844387
Error = 4.259136376916217E-10

 */
