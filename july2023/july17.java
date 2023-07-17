class Solution {
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    StackD<ListNode> s1 = new Stack<>();
    Stack<ListNode> s2 = new Stack<>();
    ListNode x= l1;
    while(x!=null){
        s1.push(x);
        x = x.next;
    }

    x= l2;
    while(x!=null){
        s2.push(x);
        x = x.next;
    }
    Queue<Integer> q = new LinkedList<>();
    int carry = 0,ts = 0;
    ListNode ans = new ListNode();
    while(!s1.isEmpty() || !s2.isEmpty()){
        if(!s1.isEmpty()){
            ts+=s1.pop().val;
        }
        if(!s2.isEmpty()){
            ts+=s2.pop().val;
        }
        ans.val = ts%10;
        carry = ts/10;
        ListNode head = new ListNode(carry);
        head.next = ans;
        ans = head;
        ts=  carry;
    }
    return carry==0? ans.next:ans;

}

}
