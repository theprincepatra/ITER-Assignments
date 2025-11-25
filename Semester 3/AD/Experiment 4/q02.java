// 2) Given a VALUE and two lists of integers X and Y. Find all pairs of elements (X[i],Y[j]) such that
// the absolute difference of X[i] and Y[j] is the VALUE, where i=j or i ≠ j.
// Input: VALUE: 4 X: 1,5,4,3,7 Y:2,9,6,7,8 Output: (5,9), (4,8), (3,7)


//Ans

// Constraints:
//   Lists X and Y may be of different sizes
//   VALUE ≥ 0
//   Need to print all valid pairs

// Idea: Check each pair (X[i], Y[j]) and print if: ∣𝑋[𝑖]−𝑌[𝑗]∣=𝑉𝐴𝐿𝑈𝐸

// Time Complexity: O(n × m)
// Space Complexity: O(1)

public class Task2_FindPairs {

    public static void main(String[] args) {

        int VALUE = 4;
        int[] X = {1, 5, 4, 3, 7};
        int[] Y = {2, 9, 6, 7, 8};

        for (int x : X) {
            for (int y : Y) {
                if (Math.abs(x - y) == VALUE) {
                    System.out.println("(" + x + "," + y + ")");
                }
            }
        }
    }
}

// Input:
// VALUE = 4
// X = 1,5,4,3,7
// Y = 2,9,6,7,8
// Output:
// (5,9)
// (4,8)
// (3,7)
