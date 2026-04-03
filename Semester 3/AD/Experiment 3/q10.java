/*
10. Given an array of size N, find the sum of distinct elements.
   If a value is repeated, add it only once.
*/

import java.util.*;

public class SumOfDistinct {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 4, 5, 6, 5};
        HashSet<Integer> set = new HashSet<>();

        for (int x : arr)
            set.add(x);

        int sum = 0;
        for (int x : set)
            sum += x;

        System.out.println("Sum of distinct elements: " + sum);
    }
}

/*
Input: [1, 2, 3, 1, 1, 4, 5, 6, 5]
Output:
Sum of distinct elements: 21
*/
