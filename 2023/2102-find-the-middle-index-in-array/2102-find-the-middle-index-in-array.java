class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int lSum[] = new int[n];
        int rSum[] = new int[n];
        int sum =0;
        for(int i =0;i<n;i++){
            sum +=nums[i];
            lSum[i] = sum;
        }
        
        sum =0;
        for(int i =n-1;i>-1;i--){
            sum +=nums[i];
            rSum[i] = sum;
        }
        for(int i =0;i<n;i++){
            if(lSum[i]==rSum[i]){
                return i;
            }
        }
        return -1;

    }
}