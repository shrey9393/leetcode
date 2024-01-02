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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode n= head;
        while(--k>0){
            n=n.next;
        }
        ListNode first =n;
        ListNode sec = head;
        while(n.next!=null){
            n = n.next;
            sec= sec.next;
        }
        int temp =first.val;
        first.val = sec.val;
        sec.val = temp;
        return head;

    }
}