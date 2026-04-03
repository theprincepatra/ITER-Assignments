package Assignment1;

public class Q1 {

	public static void main(String[] args) {

		int n = Integer.parseInt(args[0]);
		int count = 0;
		while (n > 1) {
			n /= 2;
			count++;

		}
		System.out.println(count);

	}
}

// Output:-
// "args": ["52"]
// 5
