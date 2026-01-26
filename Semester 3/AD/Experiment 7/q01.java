// 1) Stack using fixed length array

class StackArray {
    int top = -1;
    int size = 5;
    int[] stack = new int[size];

    void push(int x) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = x;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    void display() {
        for (int i = top; i >= 0; i--)
            System.out.print(stack[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        StackArray s = new StackArray();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.pop();
        s.display();
    }
}

/*
Output:
30 20 10
20 10
*/
