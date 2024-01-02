class Solution {
    private int MOD = 1_000_000_007;
    private long[][] memo;
    
    private long totalWays(int unpicked, int undelivered) {
        if (unpicked == 0 && undelivered == 0) {
            return 1;
        }
        
        if (unpicked < 0 || undelivered < 0 || undelivered < unpicked) {
            return 0;
        }
        
        if (memo[unpicked][undelivered] != 0) {
            return memo[unpicked][undelivered];
        }
        
        long ans = 0;
        ans += unpicked * totalWays(unpicked - 1, undelivered);
        ans %= MOD;
        
        ans += (undelivered - unpicked) * totalWays(unpicked, undelivered - 1);
        ans %= MOD;
        
        return memo[unpicked][undelivered] = ans;
    }
    
    public int countOrders(int n) {
        memo = new long[n + 1][n + 1];
        return (int)totalWays(n, n);
    }
}