class Solution {
    public int[] getAverages(int[] nums, int k) {

        if (k == 0) {
            return nums;
        }

        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        if (2 * k + 1 > n) {
            return ans;
        }

        long[] sumArr = new long[n + 1];
        for (int i = 0; i < n; ++i) {
            sumArr[i + 1] = sumArr[i] + nums[i];
        }

        for (int i = k; i < (n - k); ++i) {
            int lB = i - k, rB = i + k;
            long sumSub = sumArr[rB + 1] - sumArr[lB];
            int avg = (int) (sumSub / (2 * k + 1));
            ans[i] = avg;
        }

        return ans;
    }
}