import java.util.Stack;

class Solution {
    public int[] lSolve(int arr[], int n) {
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        st.add(-1);
        for (int i = 0; i < n; i++) {
            while (st.peek() != -1 && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            ans[i] = st.peek() == -1 ? -1 : st.peek();
            st.add(i);
        }
        return ans;
    }

    public int[] rSolve(int arr[], int n) {
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        st.add(-1);
        for (int i = n - 1; i >= 0; i--) {
            while (st.peek() != -1 && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            ans[i] = st.peek() == -1 ? n : st.peek();
            st.add(i);
        }
        return ans;
    }

    public int largestRectangleArea(int[] h) {
        int n = h.length;
        int left[] = lSolve(h, n);
        int right[] = rSolve(h, n);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int l = h[i];
            int b = right[i] - left[i] - 1;
            if (right[i] == -1) {
                right[i] = n;
            }
            ans = Math.max(ans, l * b);
        }
        return ans;
    }

    public int maximalRectangle(char[][] mat) {
        int rows = mat.length;
        if (rows == 0) {
            return 0;
        }
        int cols = mat[0].length;
        int arr[] = new int[cols];
        int ans = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == '1') {
                    arr[j]++;
                } else {
                    arr[j] = 0;
                }
            }
            ans = Math.max(ans, largestRectangleArea(arr));
        }
        return ans;
    }
}