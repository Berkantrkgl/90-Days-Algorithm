package difficulty.easy.algorithm530;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution530 {
    public static void main(String[] args) {

    }
    Integer prev = null;
    int min_diff = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        inOrderTraversal(root);
        return min_diff;
    }

    public void inOrderTraversal(TreeNode node) {
        if (node == null) return;

        inOrderTraversal(node.left);
        if (prev != null) {
            min_diff = Math.min(min_diff, Math.abs(node.val - prev));
        }
        prev = node.val;
        inOrderTraversal(node.right);
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
