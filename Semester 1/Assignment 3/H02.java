package Assignment3;

import java.util.Scanner;

public class HQ2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter todays,s day : ");
    int day = sc.nextInt();
    System.out.println("Enter the number of days elapsed since today: ");
    int n = sc.nextInt();
    int a =0;
    @SuppressWarnings("unused")
    String name ="",copy ="";
    for(int i = 1; i<3; i++){
        if (i==1) {
            a= day;
        }else if (i==2) {
            a= (day+n)%7;
            copy = name ;
        }
        switch (a) {
            case 0:
                name = "Sunday";
                break;
            case 1:
                name = "Monday";
                break;
            case 2:
                name = "Tuesday";
                break;
            case 3:
                name = "Wednesday";
                break;
            case 4:
                name = "Thursday";
                break;
            case 5:
                name = "Friday";
                break;
            case 6:
                name = "Saturday";        
            default:
                break;
        }

    }
    System.out.println("Today is "+copy+" and the future day is "+name);
    sc.close();
    }
}

// output
// Enter todays,s day : 
// 1
// Enter the number of days elapsed since today:
// 31
// Today is Monday and the future day is Thursday
