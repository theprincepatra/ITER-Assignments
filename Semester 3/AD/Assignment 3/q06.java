/*
6. Print Duplicates in a List
*/

import java.util.*;

public class PrintDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 5, 2, 3};
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> dup = new HashSet<>();

        for (int num : arr) {
            if (!set.add(num))
                dup.add(num);
        }

        System.out.println("Duplicates: " + dup);
    }
}

/*
Output:
Duplicates: [1, 2, 3]
*/
