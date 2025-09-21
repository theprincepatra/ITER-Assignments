package Assignment3;

public class Q07 {
	public static void main(String[] args) {
		System.out.println(fact(5));

	}
	static int fact(int a ) {
		if(a ==1 || a==0) {
			return 1;
		
		}
		return a*fact(a-1);
	}

}
