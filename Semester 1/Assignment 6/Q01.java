package Assignment6;

import java.util.Scanner;
public class Q01{
    public static void main(String[] args) {
        System.out.println("Welcome to my calculator");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sign of the operation you want to perfome :-");
        System.out.println(" \" + \" for Addition ");
        System.out.println(" \" - \" for Addition ");
        System.out.println(" \" * \" for Addition ");
        System.out.println(" \" / \" for Addition ");
        System.out.println(" \" % \" for Addition ");
        System.out.println(" \" sq\" for Addition ");
        System.out.println("Enter -1  to exit ");
        while(true){
            System.out.println("Enter your choice :- ");
            String choice =sc.next();
            System.out.println("Enter two numbers :- ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(choice.equals("-1")) {
                break;
            }
            else if(choice.equals("+")) {
                System.out.println(additionSimple(a, b));
            }
            else if(choice.equals("-")) {
                System.out.println(subtractionSimple(a, b));
            }
            else if(choice.equals("*")) {
                System.out.println(multiplicationSimple(a, b));
            }
            else if(choice.equals("/")) {
                System.out.println(divisionSimple(a, b));
            }
            else if(choice.equals("%")) {
                System.out.println(remainderSimple(a, b));
            }
            else if(choice.equals("sq")|| choice.equals("SQ")) {
                System.out.println(squareRootSimple(a));
            }
            else {
                System.out.println("Wrong input");
            }
        }
        sc.close();
    }

    public static int additionSimple(int x , int y) {
        return x+y;
    }
    public static int subtractionSimple(int x , int y) {
        return y-x;
    }
    public static int multiplicationSimple(int x , int y) {
        return x*y;
    }
    public static double divisionSimple(int x , int y) {
        return (x==0)? 0 : y/(0.0+x);
    }
    public static int remainderSimple(int x , int y) {
        return (x==0)? 0 : x % y;
    }
    public static double squareRootSimple(int x ) {
        return (x < 0)? -1.0 : Math.sqrt(x) ;
    }
}
// output:
// Welcome to my calculator
// Enter the sign of the operation you want to perfome :-
//  " + " for Addition 
//  " - " for Subtraction 
//  " * " for Multiplication 
//  " / " for Division 
//  " % " for Remainder 
//  " sq" for Square Root 
// Enter -1  to exit 
// Enter your choice :- 
// +
// Enter two numbers :- 
// 10 20
// 30
// Enter your choice :- 
// sq
// Enter two numbers :- 
// 16 0
// 4.0
// Enter your choice :- 
// -1
