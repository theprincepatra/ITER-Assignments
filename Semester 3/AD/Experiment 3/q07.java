/*
7. Find Missing Number in an Array
   Problem: Find the missing number from 1 to n in an array of n-1 elements.
*/

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = 6;
        int total = n * (n + 1) / 2;
        int sum = 0;

        for (int x : arr)
            sum += x;

        System.out.println("Missing number: " + (total - sum));
    }
}

/*
Output:
Missing number: 3
*/
