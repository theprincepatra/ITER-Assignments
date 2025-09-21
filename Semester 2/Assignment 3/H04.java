
package Assignment3;

public class HQ4 {
    public static void main(String[] args) {
        System.out.println(product(843, -100));
        
    }
    static int product(int a ,int b){
        if (b< 0) {
            a =-a ;
            b = -b;

        }
        if (b == 0) {
            return 0;
        }
        return a+ product(a, --b);
    }

}
/*
OUtput:-
-84300
 */
