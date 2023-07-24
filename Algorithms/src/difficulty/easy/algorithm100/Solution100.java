package difficulty.easy.algorithm100;

public class Solution100 {

    public static void main(String[] args) {

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

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        if (q.val != p.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    // This is another approach to solution. I like it.
    public static boolean anotherIsSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        // Recursive calling the method
        if (p != null && q != null)  {
            return (p.val == q.val) && anotherIsSameTree(q.left, p.left) && anotherIsSameTree(p.right, q.right);
        }
        return false;
    }
}
