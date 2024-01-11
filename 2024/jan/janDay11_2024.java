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
class Solution {
    public int max_diff(TreeNode root, int minval, int maxval) {
        if (root == null) {
            return Math.abs(minval - maxval);
        }
        minval = Math.min(minval, root.val);
        maxval = Math.max(maxval, root.val);
        int l = max_diff(root.left, minval, maxval);
        int r = max_diff(root.right, minval, maxval);
        return (Math.max(l, r));
    }

    public int maxAncestorDiff(TreeNode root) {
        return max_diff(root, root.val, root.val);
    }
}