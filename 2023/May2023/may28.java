class Solution {
    private int memoizationUtil(int[] num, int le, int rt, int[][] dp) {
        if (rt - le <= 1) {
            return 0;
        }
        if (dp[le][rt] != -1) {
            return dp[le][rt];
        }
        dp[le][rt] = Integer.MAX_VALUE;
        for (int k = le + 1; k < rt; k++) {
            dp[le][rt] = Math.min(dp[le][rt], memoizationUtil(num, le, k, dp)
                    + memoizationUtil(num, k, rt, dp) + num[rt] - num[le]);
        }
        return dp[le][rt];
    }

    private int memoization(int[] A, int N) {
        int[] nums = new int[A.length + 2];
        nums[0] = 0;
        nums[A.length + 1] = N;
        for (int i = 0; i < A.length; i++) {
            nums[i + 1] = A[i];
        }
        int[][] dp = new int[nums.length + 1][nums.length + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        Arrays.sort(nums);
        return memoizationUtil(nums, 0, nums.length - 1, dp);
    }

    private int tabulationUtil(int nums[], int n) {
        int dp[][] = new int[nums.length][nums.length];
        for (int left = nums.length - 1; left >= 0; --left) {
            for (int right = left + 1; right < nums.length; ++right) {
                {
                    for (int k = left + 1; k < right; ++k)
                        dp[left][right] = Math.min(dp[left][right] == 0 ? Integer.MAX_VALUE : dp[left][right],
                                nums[right] - nums[left] + dp[left][k] + dp[k][right]);
                }
            }
        }
        return dp[0][nums.length - 1];
    }

    private int tabulation(int arr[], int n) {
        int[] nums = new int[arr.length + 2];
        nums[0] = 0;
        nums[arr.length + 1] = n;
        for (int i = 0; i < arr.length; i++) {
            nums[i + 1] = arr[i];
        }
        Arrays.sort(nums);
        return tabulationUtil(nums, nums.length);
    }

    public int minCost(int n, int[] cuts) {
        // return tabulation(cuts, n);
        return memoization(cuts, n);
    }

}