import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> b4 = new ArrayList<>();
        ArrayList<Integer> p = new ArrayList<>();
        ArrayList<Integer> af = new ArrayList<>();

        for (int i : nums) {
            if (i < pivot) {
                b4.add(i);
            } else if (i == pivot) {
                p.add(i);
            } else {
                af.add(i);
            }
        }

        int n = nums.length;
        int[] ans = new int[n];
        int i = 0;

        for (int j = 0; j < b4.size(); j++) {
            ans[i++] = b4.get(j);
        }

        for (int j = 0; j < p.size(); j++) {
            ans[i++] = p.get(j);
        }

        for (int j = 0; j < af.size(); j++) {
            ans[i++] = af.get(j);
        }

        return ans;
    }
}
