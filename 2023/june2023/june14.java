class Solution {
    public int getMinimumDifference(TreeNode root) {
        TreeNode curr_Node = root;
        int prev_Node = -1;
        int minDiff = Integer.MAX_VALUE;

        while (curr_Node != null) {

            if (curr_Node.left == null) {
                if (prev_Node != -1) {
                    minDiff = Math.min(minDiff, curr_Node.val - prev_Node);
                }
                prev_Node = curr_Node.val;
                curr_Node = curr_Node.right;
            } else {

                TreeNode temp = curr_Node.left;

                while (temp.right != null && temp.right != curr_Node) {

                    temp = temp.right;
                }

                if (temp.right == null) {
                    temp.right = curr_Node;
                    curr_Node = curr_Node.left;
                } else {
                    temp.right = null;
                    if (prev_Node != -1) {
                        minDiff = Math.min(minDiff, curr_Node.val - prev_Node);
                    }
                    prev_Node = curr_Node.val;
                    curr_Node = curr_Node.right;
                }

            }

        }

        return minDiff;
    }
}