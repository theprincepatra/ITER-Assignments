// Constraints:
// Binary Tree created from array
// Find element at Nth index in Inorder traversal
// Indexing starts from 0
// If N is out of range → return -1

// Idea Generation:
// 1. Build tree using array index formula
// 2. Perform inorder traversal (Left → Root → Right)
// 3. Store traversal in ArrayList
// 4. Return element at index N

// Time Complexity: O(n) — full traversal required

// Space Complexity: O(n) — storing traversal elements

import java.util.*;

class Q7_NthInorder {

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

    static void inorder(Node root, List<Integer> list) {
        if (root == null)
            return;
        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }

    public static void main(String[] args) {
        int[] T = {1,2,3,4,5,6,7,8,9,10};
        int N = 3;
        Node root = buildTree(T, 0);
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        if (N >= 0 && N < list.size())
            System.out.println("Nth Inorder Element: " + list.get(N));
        else
            System.out.println("Invalid Index");
    }
}

// Output:
// Nth Inorder Element: 2
