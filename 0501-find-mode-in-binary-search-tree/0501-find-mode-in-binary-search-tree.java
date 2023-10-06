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
    HashMap<Integer,Integer> hm = new HashMap<>();
    public void dfs(TreeNode root){
        if(root ==null){
            return;
        }
        dfs(root.left);
        hm.put(root.val,hm.getOrDefault(root.val,0)+1);
        dfs(root.right);
    }
    public int[] findMode(TreeNode root) {
        dfs(root);
        int a = 0;
        int maxFreq =0;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i:hm.keySet()){
            int val = hm.get(i);
            if(maxFreq<=val){
                maxFreq = val;
            }
        }
        for(int i:hm.keySet()){
            int val = hm.get(i);
            if(maxFreq==val){
                al.add(i);
            }
        }
        int size =al.size(),arr[] = new int[size];
        for(int i =0;i<al.size();i++){
            arr[i] = al.get(i);
        }
        return arr;
    }
}