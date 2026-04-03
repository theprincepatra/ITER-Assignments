// Program 3: Find kth largest element using Heap

import java.util.Scanner;

public class Program3 {

    static void heapifyDown(int[] arr, int i, int size) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < size && arr[left] > arr[largest])
            largest = left;
        if (right < size && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapifyDown(arr, largest, size);
        }
    }

    static void buildMaxHeap(int[] arr) {
        for (int i = (arr.length - 2) / 2; i >= 0; i--) {
            heapifyDown(arr, i, arr.length);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int[] arr = new int[sc.nextInt()];

        System.out.println("Enter elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        buildMaxHeap(arr);
        int size = arr.length;

        for (int i = 1; i < k; i++) {
            arr[0] = arr[size - 1];
            size--;
            heapifyDown(arr, 0, size);
        }

        System.out.println("kth largest element: " + arr[0]);
    }
}

/*
Input:
15 7 22 9 18 4
k = 2
Output:
18
*/
