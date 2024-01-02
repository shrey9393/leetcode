class Solution {
    public void inOrder(TreeNode root, List<Integer> li) {
        if (root == null)
            return;

        inOrder(root.left, li);
        li.add(root.val);
        inOrder(root.right, li);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<Integer>();
        inOrder(root, l);
        return l;
    }
}