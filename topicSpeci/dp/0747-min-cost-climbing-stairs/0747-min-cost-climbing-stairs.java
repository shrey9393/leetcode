class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int cLen = cost.length;
        int dp[] = new int[cLen + 1];
        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i <= cLen; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }

        return dp[cLen];
    }
}
