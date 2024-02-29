class Solution {
    public boolean sInc(List<Integer> li) {
        // Collections.sort(li);
        for (int i = 0; i < li.size() - 1; i++) {
            if (li.get(i) >= li.get(i + 1)) { // Strictly increasing condition
                return true;
            }
        }
        return false;
    }

    public boolean sDec(List<Integer> li) {
        // Collections.sort(li, Collections.reverseOrder());
        for (int i = 0; i < li.size() - 1; i++) {
            if (li.get(i) <= li.get(i + 1)) { // Strictly decreasing condition
                return true;
            }
        }
        return false;
    }

    public boolean isEvenOddTree(TreeNode root) {
        int level = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean levelEven = true;
        while (!q.isEmpty()) {
            List<Integer> l1 = new ArrayList<>();
            int size = q.size();
            while (size-- > 0) {
                TreeNode temp = q.poll();
                l1.add(temp.val);
                if ((levelEven && temp.val % 2 == 0) || (!levelEven && temp.val % 2 != 0)) {
                    System.out.println("bug3");
                    System.out.println(level);
                    System.out.println(levelEven);
                    return false;
                }
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
            if (level % 2 != 0) {
                // todo
                if (sDec(l1)) {
                    System.out.println("bug4");
                    return false;
                }
            } else {
                if (sInc(l1)) {
                    System.out.println("bug5");
                    return false;
                }
            }
            level++;
            levelEven = (level % 2 == 0) ? true : false;
        }
        return true;
    }
}
