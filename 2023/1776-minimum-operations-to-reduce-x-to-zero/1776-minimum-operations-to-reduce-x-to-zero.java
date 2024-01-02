import java.util.HashMap;

class Solution {

    public int minOperations(int[] nums, int x) {
        int sum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = -1;
        int len = nums.length;
        hm.put(0, -1);
        for (int i = 0; i < len; i++) {
            sum += nums[i];
            hm.put(sum, i);
        }
        int remaining = sum - x;
        sum = 0;
        for (int i = 0; i < len; i++) {
            sum += nums[i];
            int find = sum - remaining;
            if (hm.containsKey(find)) {
                count = Math.max(count, i - hm.get(find));
            }
        }
        return (count != -1) ? len - count : -1;
    }
}