class Solution {
    int dp[][];
    public int rec(int st,int end,int arr[]){
        if(st == end){
            return arr[end];
        }
        int l = arr[st]-rec(st+1,end,arr);
        int r = arr[end]-rec(st,end-1,arr);
        return dp[st][end] = Math.max(l,r);
    }
    public boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
        dp = new int[n][n];
        return rec(0,n-1,nums)>=0;
                
    }
}