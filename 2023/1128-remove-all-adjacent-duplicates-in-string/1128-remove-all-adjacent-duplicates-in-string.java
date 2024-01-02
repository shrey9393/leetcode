import java.util.Stack;

class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        int l = s.length();
        st.add(s.charAt(0));
        for (int i = 1; i < l; i++) {
            if (!st.isEmpty()) {
                char top = st.peek();
                if (top == s.charAt(i)) {
                    st.pop();
                } else {
                    st.add(s.charAt(i));
                }
            } else {
                st.add(s.charAt(i));
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.insert(0, st.pop());
        }
        return ans.toString();
    }
}
