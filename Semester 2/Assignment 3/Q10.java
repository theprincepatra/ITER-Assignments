package Assignment3;

public class Q10 {

	public static void main(String[] args) {

		System.out.println(fibonacci(7));

	}
	static int fibonacci(int n ) {
		if(n == 1 || n ==2 ) {
			return 1;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}

}
