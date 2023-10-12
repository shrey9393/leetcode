class Solution {
    int ans = 0;
    
    public void solve(TreeNode root, String s) {
        if (root == null) {
            return;
        }
        s = s + root.val;
        if (root.left == null && root.right == null) {
            ans += Integer.parseInt(s,2);
            return;
        }
        solve(root.left, s);
        solve(root.right, s);
    }
    
    public int sumRootToLeaf(TreeNode root) {
        solve(root, "");
        return ans;
    }
}
