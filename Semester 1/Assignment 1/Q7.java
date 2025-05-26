package Assignment1;

public class Q07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int x= 123 ;
			int y = 456;
			System.out.println("X = "+x+"\nY= "+y);
			int z=x;
			x=y;
			y=z;
			System.out.println("X = "+x+"\nY= "+y);
	}

}
// output:
// X = 123
// Y= 456
// X = 456
// Y= 123
