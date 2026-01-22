class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class CompleteBinaryTree {

    static Node createTree(int[] arr, int i) {
        if (i >= arr.length)
            return null;

        Node root = new Node(arr[i]);
        root.left = createTree(arr, 2 * i + 1);
        root.right = createTree(arr, 2 * i + 2);
        return root;
    }

    static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Node root = createTree(arr, 0);

        System.out.print("Inorder Traversal: ");
        inorder(root);
    }
}

// output:
// Inorder Traversal: 4 2 5 1 6 3
