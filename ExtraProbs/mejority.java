import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int x : nums) {
            hs.put(x, hs.getOrDefault(x, 0) + 1);
        }
        for (int x : hs.keySet()) {
            if (hs.get(x) > nums.length / 2) {
                return x;
            }
        }
        return -1;
    }
}