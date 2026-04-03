package Assignment2;

public class Q04 {

	public static void main(String[] args) {

		Deposit obj = new Deposit(1000000,2, 5.2);
		obj.cal_amt();
		obj.display();

	}

}
class Deposit {
	long principal ;
	int time;
	double rate ;
	double total_amt;
	
	Deposit(){
		
	}
	
	Deposit(long principal , int time , double rate ){
		this.principal = principal ;
		this.time = time ;
		this.rate = rate ;
	}
	Deposit(long principal , int time){
		this.principal = principal ;
		this.time = time ;
	}
	Deposit(long principal , double rate ){
		this.principal = principal ;
		this.rate = rate ;
	}
	void display() {
		System.out.println("Principal = "+ this.principal);
		System.out.println("Time = "+ this.time);
		System.out.println("Rate = "+this.rate);
		System.out.println("Total Amount = "+ this.total_amt);
	}
	void cal_amt() {
		this.total_amt =this.principal +(this.principal *this.time * this.rate)/100; 
	}
}
/*
Principal = 1000000
Time = 2
Rate = 5.2
Total Amount = 1104000.0

 */
