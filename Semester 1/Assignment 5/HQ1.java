package Assignment5;

public class HQ1 {
    public static void main(String[] args) {
        
        int star = 1 ;
		for (int i = 0 ; i < 5 ; i++) {
			for(int j = 5 ; j > 0;j--) {
				if(j==star) {
					System.out.print("* ");
				}else {
					System.out.print(j+" ");					
				}
			}
			star++;
			System.out.println();
		}
    }
}

/*
Output:-
5 4 3 2 * 
5 4 3 * 1 
5 4 * 2 1 
5 * 3 2 1 
* 4 3 2 1 
 */
