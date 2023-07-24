package difficulty.easy.algorithm226;

import difficulty.easy.algorithm100.Solution100;

public class Solution226 {

    public static void main(String[] args) {

    }

    // This is recursive method.
    public TreeNode invertTree(TreeNode root) {

        if (root == null) return null;

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.right = left;
        root.left = right;

        return root;
    }
    // Another approach
    public TreeNode anotherInvertTree(TreeNode root) {

        if (root == null) return null;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        anotherInvertTree(root.right);
        anotherInvertTree(root.left);

        return root;
    }



    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }
}
