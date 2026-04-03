package Assignment3;
import java.util.Scanner;
public class HQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice :");
		System.out.println("Scissor : 0 ");
		System.out.println("Rock : 1 ");
		System.out.println("Paper : 2 ");
		int r = (int)(Math.random()*(3));// upper - lower +1 and +0 in the start as we need 0 and not from 1.
		int u = sc.nextInt();
		String user ="" ,comp ="";
		
		if(r==1){
			comp = "Rock";
		}else if (r==2) {
			comp = "Paper";
		}else if (r == 0){
			comp = "Scissor";
		}

		if(u==1){
			user = "Rock";
		}else if (u==2) {
			user = "Paper";
		}else if (u == 0){
			user = "Scissor";
		}else{
			System.out.println("Wrong Input");
			user = "w";
		}

		if (user != "w") {

			if (r==u) {
				System.out.println("The computer is "+comp+". You are "+user+" too. Its a draw");
			
			}else if (//All win conditions 
				(r == 1 && u == 2) ||
				(r == 2 && u == 0) ||
				(r == 0 && u == 1)
			) {
				System.out.println( "The computer is "+comp+". You are "+user+". You Won");
			
			}else{
				System.out.println("The computer is "+comp+". You are "+user+". You Lost");

			}	
		}

		sc.close();
	}

}

// Sample output
// Enter your choice :
// Scissor : 0 
// Rock : 1 
// Paper : 2 
// 2
// The computer is Rock. You are Paper. You Won
