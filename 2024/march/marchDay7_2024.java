/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode cur = head;
        while (cur.next != null) {
            cur = cur.next;
            count++;
        }
        if (count % 2 == 0) {
            count = count / 2;
        } else {
            count = count / 2 + 1;
        }

        while (count > 0) {
            head = head.next;
            count--;
        }
        return head;
    }
}