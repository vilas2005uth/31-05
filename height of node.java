class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class Main {
    Node root;

    
    int height(Node node) {
        if (node == null) {
            return -1;  
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        Main tree = new Main();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(5);

        System.out.println("Height of the tree is " + tree.height(tree.root));
        System.out.println("Height of node with value 3 is " + tree.height(tree.root.right));
        System.out.println("Height of leaf node 5 is " + tree.height(tree.root.right.right));
    }
}
