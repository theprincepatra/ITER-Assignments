
package Assignment3;

public class HQ6 {
    public static void main(String[] args) {
        String a = "gohangasalamiimalasagnahog";
        System.out.println(palindrome(a , 0 ,a.length() -1) );
        
    }
    static boolean palindrome(String s , int start , int end  ){
        if (start >= end ) {
            return true;
        }else if (s.charAt(start)!= s.charAt(end)) {
            return false;
        }
        return palindrome(s, ++start, --end);


    }


}
/*
Output:-
true
 */
