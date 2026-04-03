// Program 2: Increase key in a MAX-Priority Queue

import java.util.Scanner;

public class Program2 {

    static void increaseKey(int[] arr, int index, int key) {
        if (key < arr[index]) {
            System.out.println("New key is smaller than current key");
            return;
        }

        arr[index] = key;

        while (index > 0) {
            int parent = (index - 1) / 2;
            if (arr[parent] < arr[index]) {
                int temp = arr[parent];
                arr[parent] = arr[index];
                arr[index] = temp;
                index = parent;
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int[] arr = new int[sc.nextInt()];

        System.out.println("Enter elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter index:");
        int index = sc.nextInt();

        System.out.println("Enter new key:");
        int key = sc.nextInt();

        increaseKey(arr, index, key);

        System.out.println("Updated Heap:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

/*
Input:
8 5 7 4 1 6 3 2
Index = 4
Key = 10
Output:
10 8 7 5 6 4 3 2
*/
