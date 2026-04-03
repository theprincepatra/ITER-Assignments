// Constraints:
// Binary Tree created from array
// Traversal Order: Root → Left → Right
// Left child index = 2*i + 1
// Right child index = 2*i + 2

// Idea Generation:
// 1. Build tree using array index formula
// 2. Apply recursive preorder traversal
// 3. Print root first, then left subtree, then right subtree

// Time Complexity: O(n) — every node visited once

// Space Complexity: O(h) — recursion stack (h = height of tree)

class Q2_Preorder {

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

    static void preorder(Node root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        int[] T = {1,2,3,4,5,6,7,8,9,10};
        Node root = buildTree(T, 0);
        System.out.println("Preorder Traversal:");
        preorder(root);
    }
}

// Output:
// Preorder Traversal:
// 1 2 4 8 9 5 10 3 6 7
