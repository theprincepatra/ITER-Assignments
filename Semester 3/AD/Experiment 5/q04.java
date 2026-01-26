// Program 4: Heap Sort

import java.util.Scanner;

public class Program4 {

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

        buildMaxHeap(arr);

        for (int i = arr.length - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapifyDown(arr, 0, i);
        }

        System.out.println("Sorted array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

/*
Input:
4 10 3 5 1
Output:
1 3 4 5 10
*/
