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
    class nodeInfo{
        int ht =0;
        int diam = 0;
        nodeInfo(int ht,int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }
    public nodeInfo diamAns(TreeNode root){
        if(root == null){
            return new nodeInfo(0,0);
        }
        nodeInfo l = diamAns(root.left);
        nodeInfo r = diamAns(root.right);
        int height = Math.max(l.ht,r.ht)+1;
        int d1 = l.diam;
        int d2 = r.diam;
        int d3 = l.ht+r.ht+1;
        int di = Math.max(d1,Math.max(d2,d3));
        nodeInfo myInfo = new nodeInfo(height,di);
        return myInfo;
        
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return diamAns(root).diam-1;
    }
}