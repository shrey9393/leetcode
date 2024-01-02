import java.util.*;

class Solution {
    public static boolean validateStackSequences(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        Stack<Integer> st = new Stack<>();
        int j = 0;
        for (int x : a) {
            st.push(x);
            while (!st.isEmpty() && st.peek() == b[j]) {
                st.pop();
                j++;
            }
        }
        return st.isEmpty();
        // return true;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int b[] = { 4, 5, 3, 2, 1 };
        System.out.println(validateStackSequences(a, b));

    }
}