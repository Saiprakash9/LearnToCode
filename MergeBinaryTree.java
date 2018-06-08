/**
 * Definition for a binary tree node.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class MergeBinaryTree {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode t3 = new TreeNode(0);
        if (t1 != null) {
            checkTree(t1, t3);
        }
        if (t2 != null) {
            checkTree(t2, t3);
        }
        if (t3.val == 0 && t3.left == null && t3.right == null) {
            t3 = null;
        }
        return t3;
    }

    private static void checkTree(TreeNode root1, TreeNode root3) {
        if (root1 == null)
            return;
        root3.val = root1.val + root3.val;
        if (root1.left != null) {
            if (root3.left == null) {
                root3.left = new TreeNode(0);
            }
            checkTree(root1.left, root3.left);
        }
        if (root1.right != null) {
            if (root3.right == null) {
                root3.right = new TreeNode(0);
            }
            checkTree(root1.right, root3.right);
        }
    }
}