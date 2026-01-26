// 5) Insert an element at the bottom of a stack

import java.util.Stack;

class InsertBottom {

    static void insertBottom(Stack<Integer> s, int x) {
        if (s.isEmpty()) {
            s.push(x);
            return;
        }
        int temp = s.pop();
        insertBottom(s, x);
        s.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        insertBottom(s, 0);
        System.out.println(s);
    }
}

/*
Output:
[0, 1, 2, 3]
*/
