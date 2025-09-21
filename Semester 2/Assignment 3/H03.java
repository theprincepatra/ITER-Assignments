
package Assignment3;

public class HQ3 {
    public static void main(String[] args) {
        System.out.println(toBinary(542,0));
        
    }
    static int toBinary(int n ,int count ){
        if (n == 1) {
            return n* (int)Math.pow(10, count);
            
        }
        return (n%2)*(int)Math.pow(10, count) +toBinary(n/2, ++count);


    }

}
/*
Output:-
1000011110
 */
