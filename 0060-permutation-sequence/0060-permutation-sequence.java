import java.util.ArrayList;
import java.util.List;

class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> digits = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            digits.add(i);
        }

        StringBuilder sb = new StringBuilder();

        k--;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        for (int i = 0; i < n; i++) {
            fact /= (n - i);
            int index = k / fact;
            sb.append(digits.get(index));
            digits.remove(index);
            k %= fact;
        }

        return sb.toString();
    }
}
