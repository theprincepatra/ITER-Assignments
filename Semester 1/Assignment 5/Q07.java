package Assignment5;

public class Q07 {
    public static void main(String[] args) {
        
        //(a)
		for (int i = 1; i <=5;i++) {
			for (int j = 1 ;j<=i;j++) {
				System.out.print((char)(64+j)+" ");
			}
			System.out.println();
		}
		System.out.println("<------------------------------------------------------------------>");
		
//		(b)
		for (int i = 1; i <=5;i++) {
			for (int j = 5 ;j>=6-i;j--) {
				System.out.print("$ ");
			}
			System.out.println();
		}
		System.out.println("<------------------------------------------------------------------>");
//		(c)		
		for (int i = 1; i <=5;i++) {
			
			for (int sp =1 ; sp<=5-i;sp++){
				System.out.print("  ");
			}
			for (int j = 1 ;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("<------------------------------------------------------------------>");
    }
}

/*
Output:-

A 
A B 
A B C 
A B C D 
A B C D E 
<------------------------------------------------------------------>
$ 
$ $
$ $ $
$ $ $ $
$ $ $ $ $
<------------------------------------------------------------------>
        1
      2 2
    3 3 3 
  4 4 4 4
5 5 5 5 5
<------------------------------------------------------------------>
 */
