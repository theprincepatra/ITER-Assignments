import java.util.Scanner;

class $02recursive_of_$1 {
    // Recursive method to calculate sum
    public static int sumRecursive(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumRecursive(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth number: ");
        int N = sc.nextInt();

        if (N < 0) {
            System.out.println("N must be a non-negative number.");
            return;
        }

        int sum = sumRecursive(N);
        System.out.println("Sum of nth Numbers = " + sum);
        sc.close();
    }
}

/*
Example Output:
Enter nth number: 5
Sum of nth Numbers = 15
*/
