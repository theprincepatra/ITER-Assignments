// 5) Josephus Problem using Queue

import java.util.*;

class JosephusProblem {

    static int josephus(int n, int k) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++)
            q.add(i);

        while (q.size() > 1) {
            for (int i = 1; i < k; i++)
                q.add(q.remove()); // rotate

            q.remove(); // eliminate kth person
        }
        return q.peek();
    }

    public static void main(String[] args) {
        int n = 7; // players
        int k = 3; // every 3rd eliminated

        System.out.println("Survivor: " + josephus(n, k));
    }
}

/*
Output:
Survivor: 4
*/
