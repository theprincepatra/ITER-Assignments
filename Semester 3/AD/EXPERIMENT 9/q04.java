class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class RootToLeafPath {

    static void printPath(Node root, int[] path, int len) {
        if (root == null) return;

        path[len++] = root.data;

        if (root.left == null && root.right == null) {
            for (int i = 0; i < len; i++)
                System.out.print(path[i] + " ");
            System.out.println();
        } else {
            printPath(root.left, path, len);
            printPath(root.right, path, len);
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);

        int[] path = new int[100];
        printPath(root, path, 0);
    }
}

// output:
// 1 2 4
// 1 3
