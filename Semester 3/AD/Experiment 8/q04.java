// 4) Maximum of all sliding windows of size k

import java.util.*;

class SlidingWindowMax {

    static void maxWindow(int[] arr, int k) {
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {

            while (!dq.isEmpty() && dq.peekFirst() <= i - k)
                dq.removeFirst();

            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i])
                dq.removeLast();

            dq.addLast(i);

            if (i >= k - 1)
                System.out.print(arr[dq.peekFirst()] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {11, 2, 75, 92, 59, 90, 55};
        int k = 3;
        maxWindow(arr, k);
    }
}

/*
Output:
75 92 92 92 90
*/
