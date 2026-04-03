// 2) Implement a queue using a linked list

class QueueLL {

    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    Node front = null, rear = null;

    void enqueue(int x) {
        Node n = new Node(x);
        if (rear == null) {
            front = rear = n;
            return;
        }
        rear.next = n;
        rear = n;
    }

    int dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int x = front.data;
        front = front.next;
        if (front == null) rear = null;
        return x;
    }

    void display() {
        Node t = front;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.display();
        q.dequeue();
        q.display();
    }
}

/*
Output:
1 2 3
2 3
*/
