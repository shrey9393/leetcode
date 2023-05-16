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
    public ListNode swapPairs(ListNode head) {
        ListNode x = head;
        while(x!=null && x.next!=null ){
            int temp = x.val;
            x.val = x.next.val;
            x.next.val =temp;
            x=x.next.next;
        }
        return head;
    }
}