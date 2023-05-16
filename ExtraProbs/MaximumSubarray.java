import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> hs = new TreeSet<>();
        for (int num : nums) {
            hs.add(num);
            if (hs.size() > 3) {
                hs.pollFirst();
            }
        }
        return (hs.size() < 3) ? hs.last() : hs.first();
    }
}
