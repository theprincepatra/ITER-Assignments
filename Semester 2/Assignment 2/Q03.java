
package Assignment2;

public class Q03 {

	public static void main(String[] args) {
		
		Book obj1 = new Book(2401 , 100.0 , 5);
		Book.totalAmount = obj1.total();		
		obj1.displayDetails();
		
	}

}
class Book{
	int bookID ;
	double price;
	int quantity;
	static int totalAmount ;
	
	Book(int bookID , double price , int quantity){
		this.bookID = bookID ;
		this.price = price;
		this.quantity = quantity;
	}
	void displayDetails() {
		System.out.println("book ID = "+this.bookID);
		System.out.println("price = "+this.price);
		System.out.println("quantity = "+this.quantity);
		System.out.println("totalAmount = "+ totalAmount);
		
	}
	int total() {
		return totalAmount+(int)(this.price)*this.quantity;
	}
}
/*
book ID = 2401
price = 100.0
quantity = 5
totalAmount = 500
*/
