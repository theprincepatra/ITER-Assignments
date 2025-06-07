package Assignment3;

import java.util.Scanner;

public class HQ5 {
    public static void main(String[] args) {
        String fname ,lname ,ans ="";
        char gender, married;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your gender (M or F):");
        gender = sc.next().charAt(0);
        System.out.println("First name: ");
        fname = sc.next();
        System.out.println("Last name: ");
        lname = sc.next();
        System.out.println("Age: ");
        age = sc.nextInt();
        
        
        if (gender == 'M' || gender =='m') {
            if (age >= 20) {
                ans+="Mr. ";
            }
        }else if (gender =='F' || gender =='f') {
            if (age >20) {
                System.out.println("Are you married, Gita (y or n)?");
                married = sc.next().charAt(0);
                if (married =='y' || married =='Y') {
                    ans+="Mrs. ";
                }else{
                    ans +="Ms. ";
                }
            }
        }
        ans+=(fname+" "+lname);
        System.out.println("Then I shall call you "+ans);
        
        sc.close();

    }   
}

// output
// What is your gender (M or F):
// f
// First name:
// Gita         
// Last name:
// Pattanayak
// Age:
// 32         
// Are you married, Gita (y or n)?
// y
// Then I shall call you Mrs. Gita Pattanayak
