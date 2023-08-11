class Solution {
    public int lengthOfLIS(int[] nums) {
        TreeSet<Integer> ts = new TreeSet<>();
        for(int i : nums){
            ts.add(i);
        }
        int aSize = ts.size();
        int arr[] = new int[aSize];
        int idx =0;
        for(int i:ts){
            arr[idx++] = i;
        }
        int nSize = nums.length;
        int dp[][] = new int[nSize+1][aSize+1];
        for(int i = 1;i<=nSize;i++){
            for(int j =1;j<=aSize;j++){
                if(nums[i-1]==arr[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[nSize][aSize];
    }
}