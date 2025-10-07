import java.util.Scanner;

class $08recursive_of$7 {
    
    public static int linearSearchRecursive(int[] arr, int target, int index) {
        if (index >= arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return linearSearchRecursive(arr, target, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {10, 12, 16, 23, 50, 77};
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to search for: ");
        int searchNumber = sc.nextInt();

        int resultIndex = linearSearchRecursive(arr, searchNumber, 0); 

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
