/*
3. Merging Two Sorted Arrays
   Given two sorted arrays A and B, merge them into a single sorted array C.
*/

import java.util.*;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] A = {5, 7, 11, 19, 23};
        int[] B = {6, 13, 20};

        int[] C = new int[A.length + B.length];
        int i = 0, j = 0, k = 0;

        while (i < A.length && j < B.length) {
            if (A[i] < B[j])
                C[k++] = A[i++];
            else
                C[k++] = B[j++];
        }

        while (i < A.length) C[k++] = A[i++];
        while (j < B.length) C[k++] = B[j++];

        System.out.print("Merged Array: ");
        for (int x : C)
            System.out.print(x + " ");
    }
}

/*
Input: A = [5,7,11,19,23], B = [6,13,20]
Output: Merged Array: 5 6 7 11 13 19 20 23
*/
