// 1) Implement a queue using a fixed-length array (Circular Queue)

class QueueArray {
    int size = 5;
    int front = 0, rear = -1, count = 0;
    int[] q = new int[size];

    void enqueue(int x) {
        if (count == size) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % size;
        q[rear] = x;
        count++;
    }

    int dequeue() {
        if (count == 0) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int x = q[front];
        front = (front + 1) % size;
        count--;
        return x;
    }

    void display() {
        int i = front;
        for (int c = 0; c < count; c++) {
            System.out.print(q[i] + " ");
            i = (i + 1) % size;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
    }
}

/*
Output:
10 20 30
20 30
*/
