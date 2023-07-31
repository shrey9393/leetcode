class Solution {
    public int getMaximumGenerated(int n) {
        if(n<2){
            return n;
        }
        int dp[]= new int[n+1];
        dp[1]=1;
        int ans = Integer.MIN_VALUE;
        for(int i =2;i<=n;i++){
            if(i%2==0){
                dp[i]=dp[i/2];
            }else{
                dp[i]=dp[i/2]+dp[(i/2)+1];
            }
            ans = Math.max(ans,dp[i]);
        }
        return ans;

    }
}