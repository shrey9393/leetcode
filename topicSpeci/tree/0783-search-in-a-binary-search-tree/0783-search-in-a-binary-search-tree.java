/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode searchBST(TreeNode root, int k) {
        if (root == null) {
            return null;
        }
        if (root.val == k) {
            return root;
        }
        if (k > root.val) {
            return searchBST(root.right, k);
        }
        if (k < root.val) {
            return searchBST(root.left, k);
        }
        return null;
    }
}