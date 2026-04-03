// 3) Insert element into a sorted stack (highest at top)

import java.util.Stack;

class InsertSortedStack {

    static void insertSorted(Stack<Integer> s, int x) {
        if (s.isEmpty() || x > s.peek()) {
            s.push(x);
            return;
        }
        int temp = s.pop();
        insertSorted(s, x);
        s.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(3);
        s.push(4);

        insertSorted(s, 2);
        System.out.println(s);
    }
}

/*
Output:
[1, 2, 3, 4]
*/
