class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
           List<Integer> pre = new ArrayList<Integer>();
           if(root == null)
           {
               return pre;
           }
           Stack<TreeNode> s = new Stack();
           s.push(root);
           while(!s.empty()){
               root = s.pop();
               pre.add(root.val);
               if(root.right!=null){
                   s.push(root.right);
               }
               if(root.left!=null){
                   s.push(root.left);
               }
           }
           return pre;
    }
}