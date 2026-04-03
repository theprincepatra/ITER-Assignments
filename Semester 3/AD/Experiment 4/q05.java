// 5) Given an array of posiƟve integers represenƟng the edges of a triangle. Find the number of
// triangles that can be formed from these elements, represenƟng the sides of a triangle. For a
// triangle, the sum of two edges is always greater than the third edge.
// Input: 1, 2, 3, 4, 5 Output: 3

// Constraints: All values > 0
//              Triangle rule: a+b>c
// Idea: Sort array
//       Fix c as largest side, then use two-pointer method to count:
//       arr[left]+arr[right]>arr[c]
// Time Complexity: O(n²)
// Space Complexity: O(1)
  
import java.util.Arrays;

public class Task5_TriangleCount {

    public static int countTriangles(int[] arr) {
        Arrays.sort(arr);
        int count = 0;

        for (int i = arr.length - 1; i >= 2; i--) {
            int left = 0, right = i - 1;

            while (left < right) {
                if (arr[left] + arr[right] > arr[i]) {
                    count += (right - left);
                    right--;
                } else {
                    left++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(countTriangles(arr));
    }
}

// Input:
// 1, 2, 3, 4, 5
// Output:
// 3
