class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int ans = Integer.MIN_VALUE;
        int val = 0;
        Arrays.sort(nums);
        Arrays.sort(divisors);
        for (int i : divisors) {
            int count = 0;
            for (int j : nums) {
                if (j % i == 0) {
                    count++;
                }
            }
            if (count > ans) {
                ans = count;
                val = i;
            }
        }
        return val;
    }
}
