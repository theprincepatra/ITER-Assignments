import java.util.Scanner;

class $05Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term 'N' to find in the Fibonacci Sequence: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Fibonacci number is not defined for negative terms.");
        } else if (n == 0) {
            System.out.println("The 0th Fibonacci number is 0.");
        } else if (n == 1) {
            System.out.println("The 1st Fibonacci number is 1.");
        } else {
            int a = 0; 
            int b = 1;
            int c = 0;

            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println("The " + n + "th Fibonacci number is: " + c);
        }
        sc.close();
    }
}

/*
Example Output:
Enter the term 'N' to find in the Fibonacci Sequence: 7
The 7th Fibonacci number is: 13
*/
