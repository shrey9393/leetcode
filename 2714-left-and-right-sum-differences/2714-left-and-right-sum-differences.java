class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        int lSum[] = new int[n];
        int rSum[] = new int[n];
        for(int i =1;i<n;i++){
            lSum[i] += lSum[i-1]+nums[i-1];
        }
        
        for(int i =n-2;i>-1;i--){
            rSum[i] += rSum[i+1]+nums[i+1];
        }

        for(int i =0;i<n;i++){
            arr[i] = Math.abs(lSum[i]-rSum[i]);
        }
        return arr;
    }
}