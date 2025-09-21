
package Assignment3;

public class HQ1 {
    public static void main(String[] args) {
        System.out.println(gcd(100,15));
        
    }
    static int gcd(int a , int b){
        if (b==0) {
            return a;
        }
        return gcd(b , a % b);
    }
}
/*
Output :-
5
 */
