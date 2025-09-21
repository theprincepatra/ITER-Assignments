package Assignment3;

public class Q03 {

	public static void main(String[] args) {
		Student a = new Student();
		
		try {
			if(a.marks >100){

				throw new MarksOutOfBoundException("Marks is invalid");
			}
			System.out.println("Congrats");
		}catch (MarksOutOfBoundException e) {
				System.out.println(e.getMessage());
		}
		
	}

}
class Student {
	double marks=102;
	String name ="Rahul";
	
}
class MarksOutOfBoundException extends Exception{
	MarksOutOfBoundException(String m){
		super(m);
	}
	
}
// Output:-
// Marks is invalid
