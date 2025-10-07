import java.util.Scanner;

class $07Linear_Search {
    public static void main(String[] args) {
        int[] arr = {10, 12, 16, 23, 50, 77};
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to search for: ");
        int searchNumber = sc.nextInt();
        
        boolean found = false;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchNumber) {
                found = true;
                index = i;
                break;
            }
        }

        if (found) {
            System.out.println("Number " + searchNumber + " found at index: " + index);
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
