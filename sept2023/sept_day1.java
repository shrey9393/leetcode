class Solution {
    public int[] countBits(int n) {
        int dp[] = new int[n+1];
        for(int i =0;i<=n;i++){
            dp[i]= dp[i/2]+(i&1);
        }
        return dp;
    }
}