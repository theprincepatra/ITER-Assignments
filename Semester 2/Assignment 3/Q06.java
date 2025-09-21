
package Assignment3;

public class Q06 {

	public static void main(String[] args) {
		Integer[] a = new Integer[]{1,2,3,4,1,2,1,1};
		System.out.println(count(a,1));
		Character[] b = new Character[]{'3','3','e','r'};
		System.out.println(count(b, '3'));

	}
	public static <T> int count(T[] array, T item) {
		int count = 0 ;
		for(T x : array) {
			if (x == item) {
				count++;
			}
		}
		return count;
	}

}
/*
Output:-
4
2
 */
