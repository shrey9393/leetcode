class Solution {
    public TreeNode nextSuccessor(TreeNode n) {
        while (n.left != null) {
            n = n.left;
        }
        return n;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else {
            // case: 1
            if (root.right == null && root.left == null) {
                return null;
            }

            // case: 2
            if (root.right == null) {
                return root.left;
            } else if (root.left == null) {
                return root.right;
            }

            // case: 3
            TreeNode temp = nextSuccessor(root.right);
            root.val = temp.val;
            root.right = deleteNode(root.right, temp.val);
        }
        return root;
    }
}
