package Assignment3;

public class Q05 {

	public static void main(String[] args) {
		Integer[] a = new Integer[1];
		a[0] = 5;
		printArray(a);
		CC[] b = new CC[1];
		b[0] = new CC();
		b[0].a = 12;
		printArray(b);
		
		

	}
	 public static < E > void printArray( E[] inputArray) {
		 for(E x : inputArray) {
			 System.out.println(x.toString());
		 }
	 }
}

class CC{
	int a = 8;

	@Override
	public String toString() {
		return "CC [a=" + a + "]";
	}
	
}

/*
Output:-
5
CC [a=12]
 */
