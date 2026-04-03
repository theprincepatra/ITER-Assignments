package Assignment3;

public class Q04 {

	public static void main(String[] args) {
		Box<Integer> a = new Box<Integer>(5,7);
		Box<Integer> b = a;
		Box<String> c = new Box<String>("Rahul" , "Aman");
		Box<String> d = c;
		Box<Object> k = new Box<Object>("Rahul ", 200);
		Box<Object> l = k;
		System.out.println("Subpart 1");
		System.out.println(a.toString());
		b.n2 = 4;
		System.out.println(b.toString());
		System.out.println(a.toString());

		System.out.println("\nSubpart 2");
		System.out.println(c.toString());

		c.n2 = "Next";
		System.out.println(c.toString());
		System.out.println(d.toString());
		System.out.println("\nSubpart 3");
		System.out.println(k.toString());
		k.n2 = "Hello";
		l.n = 4321;
		System.out.println(k.toString());
		System.out.println(l.toString());
	} 

}

class Box<T>{
	T n ;
	T n2;
	Box(T n ,T n2){
		this.n = n;
		this.n2 = n2;
	}
	@Override
	public String toString() {
		return "Box [n=" + n + ", n2=" + n2 + "]";
	}
	
	
	
}
// Output:-
/*
Subpart 1
Box [n=5, n2=7]
Box [n=5, n2=4]
Box [n=5, n2=4]

Subpart 2
Box [n=TPP, n2=Aman]
Box [n=TPP, n2=Next]
Box [n=TPP, n2=Next]

Subpart 3
Box [n=TPP , n2=200]
Box [n=TPP, n2=Hello]
Box [n=TPP, n2=Hello]
 */
