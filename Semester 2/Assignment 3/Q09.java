
package Assignment3;

public class Q09 {

	public static void main(String[] args) {
	
		System.out.println(rev(874789));

	}
	static int rev(int n ) {
		if(n < 10 ) {
			return n ;
		}
		return  (int) ((n%10) *Math.pow(10, (int)(Math.log10(n)))) + rev(n/10);
	}

}
/*
Output :-
987478
 */
