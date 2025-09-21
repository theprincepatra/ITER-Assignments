package Assignment3;

public class Q08 {

	public static void main(String[] args) {
		System.out.println(power(5,2));

	}
	static int power(int b , int p) {
		if( p ==1) {
			return b ;
		}
		if(p ==0 ) {
			return 1 ;
		}
		return b*power(b , p-1);
	}

}
