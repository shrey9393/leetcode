import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9 - i; j++) {
                int x = 0;

                for (int k = j; k < i + j; k++) {
                    x = (x * 10) + arr[k];
                }
                if (low <= x && high >= x) {
                    al.add(x);
                }
            }
        }
        return al;
    }
}