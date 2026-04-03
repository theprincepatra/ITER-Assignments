// Constraints:
// Binary Tree created from array
// Traversal Order: Left → Root → Right
// Left child index = 2*i + 1
// Right child index = 2*i + 2

// Idea Generation:
// 1. Build tree using array index formula
// 2. Recursively traverse left subtree
// 3. Print root
// 4. Recursively traverse right subtree

// Time Complexity: O(n) — every node visited once

// Space Complexity: O(h) — recursion stack space

class Q4_Inorder {

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

    static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int[] T = {1,2,3,4,5,6,7,8,9,10};
        Node root = buildTree(T, 0);
        System.out.println("Inorder Traversal:");
        inorder(root);
    }
}

// Output:
// Inorder Traversal:
// 8 4 9 2 10 5 1 6 3 7
