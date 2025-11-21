import java.util.Scanner;
import java.util.Arrays; // Needed for sorting if the array wasn't guaranteed sorted

class $10recursive_of$9 {
    // Iterative Binary Search function
    public static int iterativeBinarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Avoids potential overflow

            if (arr[mid] == target) {
                return mid; // Element found
            } else if (arr[mid] < target) {
                low = mid + 1; // Target is in the upper half
            } else {
                high = mid - 1; // Target is in the lower half
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        // Sample sorted array from the image: {10, 12, 16, 23, 50, 77}
        int[] arr = {10, 12, 16, 23, 50, 77}; 
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to search for: ");
        int searchNumber = sc.nextInt();

        int resultIndex = iterativeBinarySearch(arr, searchNumber);

        if (resultIndex != -1) {
            System.out.println("Number " + searchNumber + " found at index: " + resultIndex);
        } else {
            System.out.println("Number " + searchNumber + " was not found in the array.");
        }
    }
}
/*
Output:
Enter a number to search for: 23
Number 23 found at index: 3
*/
