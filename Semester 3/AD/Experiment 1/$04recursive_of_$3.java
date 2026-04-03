import java.util.Scanner;

class $04recursive_of_$3 {
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int number = sc.nextInt();
        long result;

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            result = factorial(number);
            System.out.println("The factorial of " + number + " is " + result);
        }
        sc.close();
    }
}

/*
Example Output:
Enter a number to find its factorial: 5
The factorial of 5 is 120
*/
