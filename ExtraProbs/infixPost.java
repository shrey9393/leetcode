class Solution {
    static int precedence(char ch) {
        if (ch == '+' || ch == '-')
            return 1;
        else if (ch == '*' || ch == '/')
            return 2;
        else if (ch == '^')
            return 3;
        return 0;
    }

    static boolean isOperand(char ch) {
        if (ch >= 'a' && ch <= 'z')
            return true;
        if (ch >= '0' && ch <= '9')
            return true;
        return false;
    }

    static boolean isOperator(char ch) {
        if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^')
            return true;
        return false;
    }

    public static String infixToPostfix(String exp) {
        Stack<Character> st = new Stack<>();
        String ans = "";
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else if (isOperand(ch)) {
                ans += ch;
            } else if (ch == ')') {
                while (!st.isEmpty()) {
                    char pop = st.pop();
                    if (pop == '(')
                        break;
                    ans += pop;
                }
            } else if (isOperator(ch)) {
                if (st.isEmpty()) {
                    st.push(ch);
                } else {
                    if (precedence(ch) > precedence(st.peek())) {
                        st.push(ch);
                    } else {
                        while (!st.isEmpty()) {
                            if (precedence(ch) <= precedence(st.peek())) {
                                ans += st.pop();
                            } else {
                                break;
                            }
                        }
                        st.push(ch);
                    }
                }
            }
        }
        while (!st.isEmpty()) {
            ans += st.pop();
        }
        return ans;
    }

}