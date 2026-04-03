package Assignment5;

public class HQ2 {
    public static void main(String[] args) {
        
        for(int i = 1; i < 5 ;i++) {
			for(int sp = 4-i ; sp > 0 ; sp--) {
				System.out.print("  ");
			}
			for(int s = 1 ; s < i*2 ;s++) {
				System.out.print("* ");
			}
			System.out.println();
		}

    }
}

/*
Output:-

      * 
    * * * 
  * * * * * 
* * * * * * * 
 */
