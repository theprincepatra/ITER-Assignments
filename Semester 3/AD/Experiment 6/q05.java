// Task 5: Reverse a Doubly Linked List (Iterative, No Recursion)

import java.util.Scanner;

class Task5 {

    static class Node {
        int val;
        Node next, prev;
        Node(int val) { this.val = val; }
    }

    static Node head = null, tail = null;

    static void reverse() {
        Node curr = head, temp = null;

        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }

        temp = head;
        head = tail;
        tail = temp;
    }

    static void display() {
        Node t = head;
        while (t != null) {
            System.out.print(t.val + " -> ");
            t = t.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        head = new Node(sc.nextInt());
        tail = head;

        for (int i = 1; i < n; i++) {
            Node node = new Node(sc.nextInt());
            tail.next = node;
            node.prev = tail;
            tail = node;
        }

        reverse();
        display();
    }
}

/*
Input:
4
10 20 30 40
Output:
40 -> 30 -> 20 -> 10 ->
*/
