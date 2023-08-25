class Solution {
    public TreeNode dfs(TreeNode root, TreeNode target) {
        if (root == null) {
            return null;
        }
        if (root.val == target.val) {
            return root;
        }
        TreeNode leftResult = dfs(root.left, target);
        if (leftResult != null) {
            return leftResult;
        }
        return dfs(root.right, target);
    }
    
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return dfs(cloned, target);
    }
}
