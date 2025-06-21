package Assignment1;

public class Q6 {
    public static void main(String[] args) {
		
		System.out.println(isOdd(101));

	}
	public static boolean isOdd(int n) {
		return( (n & 1) == 0) ;
    }
}
// Output:-
// false
