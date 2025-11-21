import java.util.Scanner;

class $09Binary_Search {
    public static int iterativeBinarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
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
        sc.close();
    }
}

/*
Example Output:
Enter a number to search for: 23
Number 23 found at index: 3
*/
