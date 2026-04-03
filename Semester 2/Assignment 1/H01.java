package Assignment1;

import java.util.Scanner;

public class HQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a , b , c ;
        System.out.println("Enter three numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        boolean flag = true; 

        if(a + b == c ){
            System.out.println("Can be used as \"a+b=c\"");
            flag = false ;
        }else if(a== b+c){
            System.out.println("Can be used as \"a=b+c\"");
            flag = false ;
        }
        
        if(a == b - c){
            System.out.println("Can be used as \"a=b-c\"");
            flag = false ;
        }else if (a-b == c) {
            System.out.println("Can be used as \"a-b=c\"");  
            flag = false ;
        }
        
        if (a*b == c) {
            System.out.println("Can be used as \"a*b=c\"");
            flag = false ;
            
        }else if (a == b*c) {
            System.out.println("Can be used as \"a=b*c\"");
            flag = false ;
        }

        if (a/b == c) {
            System.out.println("Can be used as \"a/b=c\"");
            flag = false ;
        }else if (a == b/c) {
            System.out.println("Can be used as \"a=b/c\"");
            flag = false ;
        }
        if (flag) {
            System.out.println("Can't be used as any correct arethemetic formula");
        }

        sc.close();
    }
}


// Output :- 
// Enter three numbers
// 4
// 6
// 3
// Can't be used as any correct arethemetic formula
