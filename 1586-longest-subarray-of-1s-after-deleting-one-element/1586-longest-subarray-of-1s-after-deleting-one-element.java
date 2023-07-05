class Solution {
    public int longestSubarray(int[] nums) {
        int maxCount = 0;
        int count = 0;
        int prevCount = 0; 
        boolean foundZero = false; 
        for (int num : nums) {
            if (num == 1) {
                count++;
                maxCount = Math.max(maxCount, count + prevCount);
            } else {
                foundZero = true;
                prevCount = count;
                count = 0;
            }
        }

        return foundZero ? maxCount : maxCount - 1;
    }
}
