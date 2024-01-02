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
    public ListNode insertionSortList(ListNode head) {
        ListNode temp =head;
        ArrayList<Integer> al = new ArrayList<>();
        while(temp!=null){
            al.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(al);
        temp =head;
        int i=0;
        while(temp!=null){
            temp.val = al.get(i++);
            temp = temp.next;
        }

        System.out.println(al);
        return head;
    }
}