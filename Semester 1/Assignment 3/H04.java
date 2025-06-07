package Assignment3;

import java.util.Scanner;

public class HQ4 {
    public static void main(String[] args) {
        
        Boolean both =false , one = false , notboth =false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer : ");
        int num = sc.nextInt();
        if(num % 5 == 0 && num % 6 ==0){
            both = true ;
        }
        if (num % 5 == 0 ^ num % 6 ==0){
            notboth = true;
        }
        if (num % 5 == 0 || num % 6 ==0) {
            one = true;
        }

        System.out.println("Is "+num+" divisible by 5 and 6 ? "+both);
        System.out.println("Is "+num+" divisible by 5 or 6 ? "+one);
        System.out.println("Is "+num+" divisible by 5 or 6, but not both ? "+notboth);
        
        sc.close();
    }
}

// output
// Enter an Integer : 
// 10
// Is 10 divisible by 5 and 6 ? false
// Is 10 divisible by 5 or 6 ? true
// Is 10 divisible by 5 or 6, but not both ? true
