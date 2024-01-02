/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null){
            return root;
        }
        Queue<Node>q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int len = q.size();
            Node prev = null;
            while(len-->0){
                Node x = q.poll();
                if(x.left!=null){
                    q.offer(x.left);
                }
                if(x.right!=null){
                    q.offer(x.right);
                }
                if(len==0){
                    x.next =null;
                }
                else{
                    x.next = q.peek();
                }
            }
            prev = null;
        }
        return root;
    }
}