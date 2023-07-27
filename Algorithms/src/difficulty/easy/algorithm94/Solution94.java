package difficulty.easy.algorithm94;

import java.time.chrono.MinguoDate;
import java.util.ArrayList;
import java.util.List;

public class Solution94 {

    List<Integer> result = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
            inOrder(root);
            return result;
    }

    public void inOrder(TreeNode node) {

        if (node == null) return;
        inOrder(node.left);
        result.add(node.val);
        inOrder(node.right);
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
