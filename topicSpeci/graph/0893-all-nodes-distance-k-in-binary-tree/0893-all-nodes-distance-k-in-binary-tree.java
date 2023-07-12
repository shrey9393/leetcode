/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public HashMap <TreeNode,TreeNode > hm = new HashMap<>();
    public void preOrder(TreeNode c,TreeNode p){
        if(c == null){
            return;
        }
        hm.put(c,p);
        preOrder(c.left,c);
        preOrder(c.right,c);
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans = new ArrayList<>();
        HashSet<TreeNode> visited = new HashSet<>();
        Queue<TreeNode> q = new LinkedList<>();
        preOrder(root,null);
        q.offer(target);

        while(!q.isEmpty() && k>0){
            k--;
            int len = q.size();
            while(len-->0){
                TreeNode temp  = q.poll();
                visited.add(temp);
                if(!visited.contains(temp.left) && temp.left!=null){
                    q.offer(temp.left);
                }
                if(!visited.contains(temp.right) && temp.right!=null){
                    q.offer(temp.right);
                }
                if(!visited.contains(hm.get(temp)) && hm.get(temp)!=null){
                    q.offer(hm.get(temp));
                }
            }
        }
        while(!q.isEmpty()){
            int n = q.poll().val;
            ans.add(n);
        }

        return ans;
    }
}