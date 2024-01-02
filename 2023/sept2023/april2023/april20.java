class Solution {

    class Node {
        TreeNode node;
        int i;

        Node(TreeNode node, int i) {
            this.node = node;
            this.i = i;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(root, 0));
        int max = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            int start = 0, end = 0;
            for (int i = 0; i < size; i++) {
                Node eachNode = queue.remove();
                int index = eachNode.i;
                if (i == 0)
                    start = index;

                if (i == size - 1)
                    end = index;

                if (eachNode.node.left != null)
                    queue.add(new Node(eachNode.node.left, 2 * eachNode.i));

                if (eachNode.node.right != null)
                    queue.add(new Node(eachNode.node.right, 2 * eachNode.i + 1));

            }
            max = Math.max(max, end - start + 1);
        }
        return max;
    }
}