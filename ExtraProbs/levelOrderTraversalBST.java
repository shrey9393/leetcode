
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
import java.util.*;

import javax.swing.tree.TreeNode;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ls = new ArrayList<>();
        if (root == null) {
            return ls;
        }
        Queue<TreeNode> q = new PriorityQueue<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> subList = new ArrayList<>();
            while (size-- > 0) {
                TreeNode curr = q.poll();
                subList.add(curr.val);
                if (curr.right != null) {
                    q.offer(curr.right);
                }
                if (curr.left != null) {
                    q.offer(curr.left);
                }
            }
            ls.add(subList);
        }
        return ls;

    }
}