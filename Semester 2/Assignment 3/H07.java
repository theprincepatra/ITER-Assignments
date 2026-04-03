package Assignment3;

import java.util.Arrays;

public class HQ7 {
    public static void main(String[] args) {
        int[] A = {9, 4, 7, 3, 10, 2, 5};
        int k = 5;

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(A));

        arrange(A, k, 0, A.length - 1);

        System.out.println("Arranged Array");
        System.out.println(Arrays.toString(A));
        
    }
    static void arrange(int[] list , int k , int start , int end  ){
        if (start >= end) {
            return;
        }
        if (list[start] <= k ) {
            arrange(list, k, start+1, end);
        }else if (list[end] <= k ) {
            swap(list, start, end);
            arrange(list, k, start+1, end-1);
        }else{
            arrange(list, k, start, end-1);
        }
        


    }

    static void swap(int[] a, int from , int to ){
        int temp = a[from];
        a[from] = a[to];
        a[to] = temp;
    }

}
/*
Output:-
Original Array:
[9, 4, 7, 3, 10, 2, 5]
Arranged Array
[5, 4, 2, 3, 10, 7, 9]
 */
