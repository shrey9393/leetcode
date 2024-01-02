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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode d = new ListNode(0);
        d.next = head;
        ListNode curr = d, nth = d;
        for(int i =1;i<=n+1;i++){
            curr=curr.next;
        }
        while(curr!=null){
            curr = curr.next;
            nth = nth.next;
        }
        nth.next = nth.next.next;
        return d.next;
    }
}