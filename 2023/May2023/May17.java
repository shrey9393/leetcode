/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode x = head;
        while (x != null) {
            st.push(head.val);
            head = head.next;
            x = x.next.next;
        }
        int max = 0;
        while (!st.isEmpty()) {
            max = Math.max(max, st.peek() + head.val);
            st.pop();
            head = head.next;
        }
        return max;
    }
}