/*
5. Finding First Repeated Element in an Array
*/

import java.util.*;

public class FirstRepeated {
    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        HashSet<Integer> set = new HashSet<>();
        int first = -1;

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                first = arr[i];
                break;
            }
            set.add(arr[i]);
        }

        if (first != -1)
            System.out.println("First repeated element: " + first);
        else
            System.out.println("No repetitions found.");
    }
}

/*
Output:
First repeated element: 3
*/
