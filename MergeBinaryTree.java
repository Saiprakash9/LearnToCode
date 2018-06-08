class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

}

public class MergeBinaryTree {

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(2);

        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(3);
        TreeNode root3 = new TreeNode(0);
        if (root1 != null) {
            checkTree(root1, root3);
        }
        if (root2 != null) {
            checkTree(root2, root3);
        }
        // printTree(root3);

    }

    private static void printTree(TreeNode root3) {
        while (root3 != null) {

        }

    }

    private static void checkTree(TreeNode root1, TreeNode root3) {
        if (root1 == null)
            return;
        root3.val = root1.val + root3.val;
        if (root1.left != null) {
            root3.left = new TreeNode(0);
            checkTree(root1.left, root3.left);
        }
        if (root1.right != null) {
            root3.right = new TreeNode(0);
            checkTree(root1.right, root3.right);
        }
    }

}
