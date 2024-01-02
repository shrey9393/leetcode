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
    int sum =0;
    public int dfs(TreeNode root){
        if(root ==null){
            return 0;
        }
        dfs(root.right);
        sum+=root.val;
        root.val =sum;
        dfs(root.left);
        return sum;
    }
    public TreeNode bstToGst(TreeNode root) {
        if(root ==null){
            return null;
        }
        dfs(root);
        return root;
    }
}