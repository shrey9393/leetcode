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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root ==null){
            return ans;
        }
        List<TreeNode> tr = new ArrayList<>();
        tr.add(root);
        while(tr.size()!=0){
            ArrayList<Integer> x = new ArrayList<>();
            int si = tr.size();
            while(si-->0){
                TreeNode j = tr.get(0);
                tr.remove(0);
                if(j.right!=null){
                    tr.add(j.right);
                }
                if(j.left!=null){
                    tr.add(j.left);
                }
                x.add(0,j.val);
            }
            ans.add(0,x);
        }
        return ans;
    }
}