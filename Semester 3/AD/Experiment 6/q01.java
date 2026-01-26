// Task 1: Create a sorted (ascending) Singly Linked List from given integers

import java.util.Scanner;

class Task1 {

    static Node head = null, tail = null;

    static class Node {
        int val;
        Node next;
        Node(int val) { this.val = val; }
    }

    static void sort() {
        for (Node i = head; i != null; i = i.next) {
            for (Node j = i.next; j != null; j = j.next) {
                if (i.val > j.val) {
                    int t = i.val;
                    i.val = j.val;
                    j.val = t;
                }
            }
        }
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
            tail.next = new Node(sc.nextInt());
            tail = tail.next;
        }

        sort();
        display();
    }
}

/*
Input:
5
4 2 5 1 3
Output:
1 -> 2 -> 3 -> 4 -> 5 ->
*/
