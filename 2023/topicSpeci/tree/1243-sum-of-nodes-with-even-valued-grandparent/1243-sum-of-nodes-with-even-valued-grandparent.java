class Solution {
    ArrayList<TreeNode> al = new ArrayList<>();

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        if (root.val % 2 == 0) {
            al.add(root);
        }
        dfs(root.right);
        return;
    }

    public int sumEvenGrandparent(TreeNode root) {
        if (root == null) {
            return 0;
        }
        dfs(root);
        int ans = 0;
        for (TreeNode t : al) {
            if (t.left != null && t.left.left != null) {
                ans += t.left.left.val;
            }
            if (t.left != null && t.left.right != null) {
                ans += t.left.right.val;
            }
            if (t.right != null && t.right.left != null) {
                ans += t.right.left.val;
            }
            if (t.right != null && t.right.right != null) {
                ans += t.right.right.val;
            }
        }
        return ans;
    }
}
