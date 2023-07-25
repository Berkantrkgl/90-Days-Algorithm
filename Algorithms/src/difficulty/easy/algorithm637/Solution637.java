package difficulty.easy.algorithm637;

import difficulty.easy.algorithm100.Solution100;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution637 {

    public static void main(String[] args) {

    }

    // This is my solution.
    public List<Double> averageOfLevels(TreeNode root) {



        List<Double> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return result;

        queue.offer(root);
        double level_sum = 0;
        while (!queue.isEmpty()) {
            level_sum = 0;

            int size = queue.size();
            for (int i=0; i<size; i++) {
                TreeNode current_node = queue.poll();
                level_sum += current_node.val;
                if (current_node.left != null) queue.offer(current_node.left);
                if (current_node.right != null) queue.offer(current_node.right);
            }

            double level_avg = level_sum / size;
            result.add(level_avg);
        }
        return result;

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
