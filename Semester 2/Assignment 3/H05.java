
package Assignment3;

public class HQ5 {
    public static void main(String[] args) {
        String a = "qwert";
        System.out.println(rev (a, a.length() -1));
        
    }
    static String rev(String a , int count ){
        if (count == -1 ) {
            return "";
        }
        
        return a.charAt(count--) +rev(a, count);
    }

}
/*
Output:- 
trewq
 */
