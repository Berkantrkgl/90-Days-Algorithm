package difficulty.easy.algorithm110;

public class Solution110 {

    public static void main(String[] args) {

    }
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        return height(root) != -1;
    }

    public int height(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        if (leftHeight == -1 || rightHeight == -1) return -1;

        if (Math.abs(leftHeight-rightHeight) > 1) return -1;

        return Math.max(leftHeight, rightHeight) + 1;
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
