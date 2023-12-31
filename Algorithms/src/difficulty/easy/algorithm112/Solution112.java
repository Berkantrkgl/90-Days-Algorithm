package difficulty.easy.algorithm112;

import difficulty.easy.algorithm100.Solution100;

public class Solution112 {

    public static void main(String[] args) {

    }


    public static boolean hasPathSum(TreeNode root, int targetSum) {

        if (root == null) return false;

        if (root.left == null && root.right == null && root.val == targetSum) {
            return true;
        }

        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
    public static boolean anotherHasPathSum(TreeNode root, int targetSum) {

        if (root == null) return false;
        int temp = targetSum - root.val;
        if (temp == 0 && root.left == null && root.right == null) {
            return true;
        }

        return anotherHasPathSum(root.left, temp) || anotherHasPathSum(root.right, temp);

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
