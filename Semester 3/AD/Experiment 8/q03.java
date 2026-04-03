// 3) Reverse a stack using a queue

import java.util.*;

class ReverseStackUsingQueue {

    static void reverse(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<>();

        while (!s.isEmpty())
            q.add(s.pop());

        while (!q.isEmpty())
            s.push(q.remove());
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        reverse(s);
        System.out.println(s);
    }
}

/*
Output:
[4, 3, 2, 1]
*/
