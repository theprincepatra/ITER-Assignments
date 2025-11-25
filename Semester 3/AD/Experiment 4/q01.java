// 1) Write an efficient algorithm/program to determine whether a given list of integers is sorted or
// not. If the answer is “YES”, then say whether the list is sorted in ascending or descending order.
// Input: 12,23,34,56,78 Output: Yes ascending
// Input: 12,23,45,32,56,78 Output: No
// Input: 78,56,34,23,12 Output: Yes descending

//ANS

// Constraints:
//   Input size: n ≥ 1
//   Elements are integers
//   Must detect: Ascending Descending Not sorted
// Idea: Compare each element with the next one: If all a[i] ≤ a[i+1] → Ascending
//                                               If all a[i] ≥ a[i+1] → Descending
//                                               Else → Not sorted
// Time Complexity: O(n)
// Spcae Complexity: O(n)
public class Task1_CheckSorted {

    public static void checkSorted(int[] arr) {
        boolean asc = true, desc = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) asc = false;
            if (arr[i] < arr[i + 1]) desc = false;
        }

        if (asc)
            System.out.println("Yes ascending");
        else if (desc)
            System.out.println("Yes descending");
        else
            System.out.println("No");
    }

    public static void main(String[] args) {
        checkSorted(new int[]{12,23,34,56,78});
        checkSorted(new int[]{12,23,45,32,56,78});
        checkSorted(new int[]{78,56,34,23,12});
    }
}

// Input / Output:
// Input: 12,23,34,56,78
// Output: Yes ascending
// Input: 12,23,45,32,56,78
// Output: No
// Input: 78,56,34,23,12
// Output: Yes descending
