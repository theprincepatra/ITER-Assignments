package Assignment2;

public class Q02 {

	public static void main(String[] args) {

		Complex a = new Complex();
		Complex b = new Complex();
		a.setData(1, 2);
		b.setData(3, 4);
		
		Complex c = a.add(a,b);
		c.display();
		
	}

}
class Complex{
	int real;
	int imag;
	void setData(int real , int imag) {
		this.real = real;
		this.imag =imag;
		
	}
	void display() {
		System.out.println(this.real+" + "+this.imag+" i");
	}
	public Complex add(Complex a , Complex b) {
		Complex k = new Complex();
		k.imag =a.imag+b.imag;
		k.real = a.real +b.real;
		
		return k ;
	}
}
//Output:-
//4 + 6 i
