// 4) Given an array, find if there is a pair whose sum is equal to the sum of the rest of the elements
// of the array.
// Input: 4, 8, 1, 2, 16, 15 Output: 8, 15


//Ans

// Constraints:
//   Array size ≥ 2
//   All integers allowed
// Idea: Let total sum = S
//       We need: a+b=S−(a+b)
//                2(a+b)=S
//       Try all possible pairs.

// Time Complexity: O(n²)
// Space Complexity: O(1)

public class Task4_SpecialPair {

    public static void main(String[] args) {
        int[] arr = {4, 8, 1, 2, 16, 15};
        int total = 0;

        for (int num : arr) total += num;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == total - (arr[i] + arr[j])) {
                    System.out.println(arr[i] + ", " + arr[j]);
                    return;
                }
            }
        }
    }
}

// Input:
// 4, 8, 1, 2, 16, 15
// Output:
// 8, 15
