package Assignment1;

public class Q07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int x=10;
			int y =20;
			System.out.println("X = "+x+"\nY= "+y);
			int z=x;
			x=y;
			y=z;
			System.out.println("X = "+x+"\nY= "+y);
	}

}
// output:
// X = 10
// Y = 20
// X = 20
// Y = 10
