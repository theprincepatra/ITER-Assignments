/*
9. Given a list of n numbers, find the element which appears maximum number of times.
*/

import java.util.*;

public class MaxFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 4, 1, 5, 2, 2};
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int x : arr)
            freq.put(x, freq.getOrDefault(x, 0) + 1);

        int maxKey = -1, maxVal = 0;
        for (var e : freq.entrySet()) {
            if (e.getValue() > maxVal) {
                maxVal = e.getValue();
                maxKey = e.getKey();
            }
        }

        System.out.println("Element with maximum frequency: " + maxKey);
    }
}

/*
Output:
Element with maximum frequency: 1
*/
