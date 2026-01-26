// Program 1: Check whether a list is a MIN-Priority Queue

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int[] arr = new int[sc.nextInt()];

        System.out.println("Enter elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isMinHeap = true;

        for (int i = 0; i <= (arr.length - 2) / 2; i++) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if (left < arr.length && arr[i] > arr[left]) {
                isMinHeap = false;
                break;
            }
            if (right < arr.length && arr[i] > arr[right]) {
                isMinHeap = false;
                break;
            }
        }

        if (isMinHeap)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

/*
Input:
1 3 2 7 4 6 5 8
Output:
YES
*/
