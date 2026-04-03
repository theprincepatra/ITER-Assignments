// Task 2: Convert Adjacency Matrix to Adjacency List (Undirected Graph)

import java.util.Scanner;

class Task2 {

    static class Node {
        int val;
        Node next;
        Node(int val) { this.val = val; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Node[] adjList = new Node[n];

        for (int i = 0; i < n; i++) {
            adjList[i] = new Node(i);
        }

        for (int i = 0; i < n; i++) {
            Node temp = adjList[i];
            for (int j = 0; j < n; j++) {
                int x = sc.nextInt();
                if (x == 1 && i != j) {
                    temp.next = new Node(j);
                    temp = temp.next;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            Node t = adjList[i];
            while (t != null) {
                System.out.print(t.val + " -> ");
                t = t.next;
            }
            System.out.println();
        }
    }
}

/*
Input:
3
0 1 1
1 0 1
1 1 0
Output:
0 -> 1 -> 2 ->
1 -> 0 -> 2 ->
2 -> 0 -> 1 ->
*/
