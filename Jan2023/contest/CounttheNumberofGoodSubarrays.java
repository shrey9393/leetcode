import java.util.*;;

class Solution {
    public long countGood(int[] nums, int k) {
        long numLen = nums.length;
        long curElement = 0;
        long res = 0;
        Map<Integer, Integer> hs = new HashMap<>();
        int lidx = 0;
        for (int ridx = 0; ridx < numLen; ridx++) {
            if (hs.containsKey(nums[ridx])) {
                curElement += hs.get(nums[ridx]);
            }
            hs.put(nums[ridx], hs.getOrDefault(nums[ridx], 0) + 1);
            while (lidx <= ridx && curElement >= k) {
                if (hs.get(nums[lidx]) > 1) {
                    curElement -= (hs.get(nums[lidx]) - 1);
                }
                hs.put(nums[lidx], hs.get(nums[lidx]) - 1);
                lidx++;
            }
            res += (ridx - lidx + 1);
        }
        res = (numLen * (numLen + 1) / 2) - res;
        return res;
    }
}
