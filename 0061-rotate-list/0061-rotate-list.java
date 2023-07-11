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
    static int getLength(ListNode head){
        int n=1;
        ListNode temp =head;
        while(temp.next !=null){
            temp = temp.next;
            n++;
        }
        return n;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head ==null||head.next==null){
            return head;
        }
        int len = getLength(head);
        System.out.println(len);
        k %= len;
        System.out.println(k);
        if(k==0){
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(k-->0){
            fast = fast.next;
        }
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        ListNode res = slow.next;
        slow.next = null;
        fast.next = head;
        return res;
    }
}