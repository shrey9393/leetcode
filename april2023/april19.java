class Solution {
    int max = 0;

    public int longestZigZag(TreeNode root) {
        if (root == null)
            return -1;
        max = 0;
        helper(root.right, 1, true);
        helper(root.left, 1, false);
        return max;
    }

    private void helper(TreeNode root, int count, boolean isR) {
        if (root == null)
            return;
        max = Math.max(max, count);
        if (isR) {
            helper(root.left, count + 1, false);
            helper(root.right, 1, true);
        } else {
            helper(root.right, count + 1, true);
            helper(root.left, 1, false);
        }
    }
}