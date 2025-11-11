/*
2. Array Reduction
   Problem: Given an array of positive elements, perform reduction operations.
   In each reduction operation, the smallest positive element value is picked and 
   all elements are subtracted by that value. 
   Print the number of elements left after each reduction.
*/

import java.util.*;

public class ArrayReduction {
    public static void main(String[] args) {
        int[] arr = {5, 1, 1, 2, 3, 5};
        Arrays.sort(arr);

        while (true) {
            int min = Integer.MAX_VALUE;
            for (int num : arr) {
                if (num > 0) {
                    min = num;
                    break;
                }
            }
            if (min == Integer.MAX_VALUE) break;

            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    arr[i] -= min;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

/*
Input: [5, 1, 1, 2, 3, 5]
Output:
6
4
3
2
1
*/
