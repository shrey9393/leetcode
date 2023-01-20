import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int res = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int sumArr = 0, rem = 0;
        for (int i : nums) {
            sumArr += i;
            rem = sumArr % k;
            if (rem < 0) {
                rem += k;
            }
            if (hm.containsKey(rem)) {
                res += hm.get(rem);
                hm.put(rem, hm.get(rem) + 1);
            } else {
                hm.put(rem, 1);

            }
        }
        return res;

    }
}