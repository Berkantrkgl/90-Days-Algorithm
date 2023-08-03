package difficulty.easy.algorithm111;

import difficulty.easy.algorithm100.Solution100;

public class Solution111 {
    public static void main(String[] args) {

    }

    static int counter = 0;
    public static int minDepth(TreeNode root) {

        return root == null ? 0 : getMinDepth(root);
    }

    public static int getMinDepth(TreeNode node) {
        if (node == null) return Integer.MAX_VALUE;
        if (node.left == null && node.right == null) return 1;

        return Math.min(getMinDepth(node.left) , getMinDepth(node.right)) + 1;
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
