// Constraints:
// No of Nodes = 10
// Binary Tree
// Each node has at most 2 children
// Tree is created from array representation
// Left child index = 2*i + 1
// Right child index = 2*i + 2

// Idea Generation:
// create a Node class with-
//         ~data
//         ~left pointer
//         ~right pointer
// Create tree using recursion
// Use array index formula to assign children
// Root node = index 0

// Time Complexity: O(n) — each node created once

// Space Complexity: O(n) — storing n nodes

class Q1_CreateTree {

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

    public static void main(String[] args) {

        int[] T = {1,2,3,4,5,6,7,8,9,10};

        Node root = buildTree(T, 0);

        System.out.println("Root: " + root.data);
        System.out.println("Left of Root: " + root.left.data);
        System.out.println("Right of Root: " + root.right.data);
        System.out.println("Left of Left: " + root.left.left.data);
        System.out.println("Right of Left: " + root.left.right.data);
        System.out.println("Left of Right: " + root.right.left.data);
        System.out.println("Right of Right: " + root.right.right.data);
    }
}

// output:
// Root: 1
// Left of Root: 2
// Right of Root: 3
// Left of Left: 4
// Right of Left: 5
// Left of Right: 6
// Right of Right: 7
