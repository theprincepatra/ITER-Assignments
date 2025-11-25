// Constraints:
//   k < n
//   All integers allowed
//   Must return the element, not index

// Idea: Sort the array and return: kth smallest=arr[k−1]
// Time Complexity: O(n log n)
// Space Complexity: O(1) (in-place sort)

import java.util.Arrays;

public class Task3_KthSmallest {

    public static int kthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }

    public static void main(String[] args) {
        int[] arr = {15, 7, 22, 9, 18, 4};
        int k = 3;
        System.out.println(kthSmallest(arr, k));
    }
}

// Input:
// 15, 7, 22, 9, 18, 4
// k = 3
// ✔ Output
// 9
