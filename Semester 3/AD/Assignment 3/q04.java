/*
4. Check Reverse
   Problem: Given an array, check if reversing one subarray makes it sorted.
*/

public class CheckReverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 5, 4, 7};
        System.out.println(isSortable(arr));
    }

    static boolean isSortable(int[] arr) {
        int n = arr.length;
        int start = -1, end = -1;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                start = i;
                break;
            }
        }

        if (start == -1) return true;

        for (int i = start; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                end = i;
                break;
            }
        }
        if (end == -1) end = n - 1;

        reverse(arr, start, end);

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }

    static void reverse(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}

/*
Input: [1, 2, 6, 5, 4, 7]
Output: true
*/
