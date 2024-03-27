class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int j = 0, mul = 1;
        for (int i = 0; i < n; i++) {
            mul *= nums[i];
            while (mul >= k && j <= i) {
                mul /= nums[j];
                j++;
            }
            count += (i - j) + 1;
        }
        return count;
    }
}