
import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int arr[] = new int[temperatures.length];
        for (int i = 0; i < arr.length; i++) {
            while (!st.empty() && temperatures[st.peek()] < temperatures[i]) {
                int x = st.pop();
                arr[x] = i - x;
            }
            st.push(i);
        }
        return arr;
    }
}