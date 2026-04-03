// Task 4: Print Singly Linked List in Reverse Order using Recursion

import java.util.Scanner;

class Task4 {

    static Node head = null, tail = null;

    static class Node {
        int val;
        Node next;
        Node(int val) { this.val = val; }
    }

    static void printReverse(Node node) {
        if (node == null) return;
        printReverse(node.next);
        System.out.print(node.val + " -> ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        head = new Node(sc.nextInt());
        tail = head;

        for (int i = 1; i < n; i++) {
            tail.next = new Node(sc.nextInt());
            tail = tail.next;
        }

        printReverse(head);
        System.out.println();
    }
}

/*
Input:
5
1 2 3 4 5
Output:
5 -> 4 -> 3 -> 2 -> 1 ->
*/
