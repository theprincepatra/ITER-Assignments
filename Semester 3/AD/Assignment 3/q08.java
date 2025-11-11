/*
8. Given an array, find the element pair with minimum and maximum difference.
*/

import java.util.*;

public class MinMaxDiff {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 19, 18, 25};
        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            minDiff = Math.min(minDiff, arr[i] - arr[i - 1]);
        }

        int maxDiff = arr[arr.length - 1] - arr[0];

        System.out.println("Minimum Difference: " + minDiff);
        System.out.println("Maximum Difference: " + maxDiff);
    }
}

/*
Output:
Minimum Difference: 1
Maximum Difference: 24
*/
