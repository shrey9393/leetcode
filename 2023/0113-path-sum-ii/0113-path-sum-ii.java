class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    
    public void dfs(TreeNode root, int ts, List<Integer> li) {    
        if (root == null) {
            return;
        }
        
        li.add(root.val);
        
        if (root.left == null && root.right == null && ts == root.val) {
            ans.add(new ArrayList<>(li));
        }
        
        dfs(root.left, ts - root.val, li);
        dfs(root.right, ts - root.val, li);
        
        li.remove(li.size() - 1);
    }
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum, new ArrayList<>());
        return ans;
    }
}
