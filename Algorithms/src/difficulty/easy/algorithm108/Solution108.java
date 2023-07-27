package difficulty.easy.algorithm108;

import difficulty.easy.algorithm110.Solution110;

public class Solution108 {

    public static void main(String[] args) {

    }


    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        return setNode(nums, 0, nums.length - 1);
    }

    public static TreeNode setNode(int[] nums, int left, int right){
        if (left > right) {
            return null;
        }
        int mid = right + (left - right) /2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = setNode(nums, left, mid - 1);
        node.right = setNode(nums, mid + 1, right);

        return node;
    }

    public static class TreeNode {
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
