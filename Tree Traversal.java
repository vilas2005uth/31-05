class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}

public class Main {

    public static TreeNode createBTree(int[] arr, int i, int n) {
        if (i > n) {
            return null;
        }
        TreeNode root = new TreeNode(arr[i - 1]);
        root.left = createBTree(arr, 2 * i, n);
        root.right = createBTree(arr, 2 * i + 1, n);
        return root;
    }

    public static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        TreeNode btree = createBTree(arr, 1, n); 
        preOrder(btree);
    }
}
