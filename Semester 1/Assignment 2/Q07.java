package Assignment2;

public class Q07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("a\tb\tpow(a,b)");
		int a=1,b=2;
		System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a,b));
		a++;b++;
		System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a,b));
		a++;b++;
		System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a,b));
		a++;b++;
		System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a,b));
		a++;b++;
		System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a,b));
		a++;b++;
		System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a,b));
		a++;b++;
		System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a,b));
	}

}
// output:
// a	b	pow(a,b)
// 1	2	1
// 2	3	8
// 3	4	81
// 4	5	1024
// 5	6	15625
// 6	7	279936
// 7	8	5764801
