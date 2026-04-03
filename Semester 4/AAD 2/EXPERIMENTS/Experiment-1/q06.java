// Constraints:
// Binary Tree created from array
// Find element at Nth index in Postorder traversal
// Indexing starts from 0
// If N is out of range → return -1

// Idea Generation:
// 1. Build tree using array index formula
// 2. Perform postorder traversal (Left → Right → Root)
// 3. Store traversal in ArrayList
// 4. Return element at index N

// Time Complexity: O(n) — full traversal required

// Space Complexity: O(n) — storing traversal elements

import java.util.*;

class Q6_NthPostorder {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }

    static Node buildTree(int[] arr, int i) {
        if (i >= arr.length)
            return null;
        Node root = new Node(arr[i]);
        root.left = buildTree(arr, 2 * i + 1);
        root.right = buildTree(arr, 2 * i + 2);
        return root;
    }

    static void postorder(Node root, List<Integer> list) {
        if (root == null)
            return;
        postorder(root.left, list);
        postorder(root.right, list);
        list.add(root.data);
    }

    public static void main(String[] args) {
        int[] T = {1,2,3,4,5,6,7,8,9,10};
        int N = 3; 
        Node root = buildTree(T, 0);
        List<Integer> list = new ArrayList<>();
        postorder(root, list);
        if (N >= 0 && N < list.size())
            System.out.println("Nth Postorder Element: " + list.get(N));
        else
            System.out.println("Invalid Index");
    }
}

// Output:
// Nth Postorder Element: 10
