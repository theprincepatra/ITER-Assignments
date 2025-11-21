import java.util.Scanner;

class $03Factorial {
    public static void main(String[] args) {
        long factorial = 1; // Use long for larger factorials
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find its factorial: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else if (number == 0) {
            System.out.println("Factorial of " + number + " is 1");
        } else {
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }
            System.out.println("The factorial of " + number + " is " + factorial);
        }
        sc.close();
    }
}

/*
Example Output:
Enter a number to find its factorial: 5
The factorial of 5 is 120
*/
