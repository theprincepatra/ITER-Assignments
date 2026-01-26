// Task 3: Add edges to an Adjacency List (Undirected Graph)

import java.util.Scanner;

class Task3 {

    static class Node {
        int val;
        Node next;
        Node(int val) { this.val = val; }
    }

    static void addEdges(Node[] adjList) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        while (m-- > 0) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            Node nu = new Node(v);
            nu.next = adjList[u].next;
            adjList[u].next = nu;

            Node nv = new Node(u);
            nv.next = adjList[v].next;
            adjList[v].next = nv;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Node[] adjList = new Node[n];

        for (int i = 0; i < n; i++) {
            adjList[i] = new Node(i);
        }

        addEdges(adjList);

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
4
3
0 1
1 2
2 3
Output:
0 -> 1 ->
1 -> 2 -> 0 ->
2 -> 3 -> 1 ->
3 -> 2 ->
*/
