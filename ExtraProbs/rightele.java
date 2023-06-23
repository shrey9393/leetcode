import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> depths = new Stack<>();

        stack.push(root);
        depths.push(0);

        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            int depth = depths.pop();

            if (depth == result.size()) {
                result.add(curr.val);
            } else {
                result.set(depth, curr.val);
            }

            if (curr.right != null) {
                stack.push(curr.right);
                depths.push(depth + 1);
            }
            if (curr.left != null) {
                stack.push(curr.left);
                depths.push(depth + 1);
            }
        }

        return result;
    }
}
