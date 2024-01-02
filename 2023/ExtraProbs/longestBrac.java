import java.util.Stack;

class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int maxCnt = 0;
        st.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(i);
            } else {
                st.pop();
                if (st.isEmpty()) {
                    st.push(i);
                } else {
                    maxCnt = Math.max(maxCnt, i - st.peek());
                }
            }
        }
        return maxCnt;
    }
}
