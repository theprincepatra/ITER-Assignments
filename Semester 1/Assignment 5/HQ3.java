package Assignment5;

import java.util.Scanner;

public class HQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter angle in Degree");
        double  x = Math.toRadians(sc.nextDouble());
        double term = x ;//first term 
        double sinX = x;
        int i = 3;

        while (Math.abs(term) > 1e-6){
            term *= (-x*x)/(i*(i-1));
            i+=2;
            sinX+=term;

        }
        System.out.println("Calculated value = "+sinX);
        System.out.println("Default Method value = "+Math.sin(x));
        System.out.println("Error = "+(sinX-Math.sin(x)));
        
        
        sc.close();
    }

    
}

/*
Output :-

Enter value of x in radians
30
Calculated value = 0.5000000000202799
Default Method value = 0.49999999999999994
Error = 2.0279944390466653E-11

 */
