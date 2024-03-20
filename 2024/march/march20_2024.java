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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode start = list1, end = list1;
        a--;
        while (a-- > 0) {
            start = start.next;
        }
        // start = start.next;
        b++;
        while (b-- > 0) {
            end = end.next;
        }
        // end = end.next;
        ListNode temp = list2;
        while (temp.next != null) {
            temp = temp.next;
        }
        start.next = list2;
        temp.next = end;
        return list1;

    }
}