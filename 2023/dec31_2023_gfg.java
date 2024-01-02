class Solution {
    private static Boolean dp[][];
    public static boolean isPossible(int N, int[] coins) {
        dp = new Boolean[N+1][2025];
        return dfs(coins, 0, 0);
    }
    private static boolean dfs(int[] arr, int i, int sum) {
        if (sum != 0 && (sum % 20 == 0 || sum % 24 == 0 || sum == 2024)) return true;
        if (i == arr.length) return false;
        if (dp[i][sum] != null) return dp[i][sum];
        boolean nonTake = dfs(arr, i+1, sum);
        boolean take = dfs(arr, i+1, sum+arr[i]);
        return dp[i][sum] = nonTake || take;
    }
}
