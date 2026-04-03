// Constraints:
// Binary Tree created from array
// Traversal Order: Left → Right → Root
// Left child index = 2*i + 1
// Right child index = 2*i + 2

// Idea Generation:
// 1. Build tree using array index formula
// 2. Recursively traverse left subtree
// 3. Recursively traverse right subtree
// 4. Print root at the end

// Time Complexity: O(n) — every node visited once

// Space Complexity: O(h) — recursion stack space

class Q3_Postorder {
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

    static void postorder(Node root) {
        if (root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        int[] T = {1,2,3,4,5,6,7,8,9,10};
        Node root = buildTree(T, 0);
        System.out.println("Postorder Traversal:");
        postorder(root);
    }
}

// Output:
// Postorder Traversal:
// 8 9 4 10 5 2 6 7 3 1
