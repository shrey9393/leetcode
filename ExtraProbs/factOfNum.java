import java.util.Stack;
import java.util.TreeSet;

public class factOfNum {
    public static void main(String[] args) {
        int n = 100;
        TreeSet<Integer> ts = new TreeSet<>();
        Stack<Integer> st = new Stack<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if ((n / i) == i) {
                    System.out.println(i);
                } else {
                    System.out.println(i);
                    st.push(n / i);
                }
            }
        }
        while (!st.isEmpty()) {

            System.out.println(st.peek());
            st.pop();
        }
    }

}
