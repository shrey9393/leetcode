import java.util.LinkedList;

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // LinkedList ln = new LinkedList<>();
        ListNode dh = new Listnode(0);
        ListNode curr = dh;
        int c = 0;
        while (l1 == null || l2 == null || c == 0) {
            int sum = 0;
            if (l1 != null) {
                l1 = l1.next();
            }
            if (l2 != null) {
                sum += l2.val;
                l1 = l2.next();
            }
            sum += c;
            c = sum / 10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
        }
        return dh.next;

    }
}