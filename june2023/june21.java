class Solution {
    public long minCost(int[] nums, int[] cost) {
        int l = nums[0];
        int r = nums[0];
        for(int i: nums){
            l = Math.min(l,i);
            r = Math.max(r,i);
        }
        long ans = 0;
        while(l<r){
            int mid = (l+r)/2;
            long cost1 = helper(nums, cost, mid);
            long cost2 = helper(nums,cost, mid+1);
            if(cost1>cost2){
                l = mid+1;
                ans = cost2;
            }else{
                r = mid;
                ans = cost1;
            }
            
        }
        return ans;
    }
    
    public long helper(int [] arr, int [] cst, int val){
        long tCost = 0L;
        for(int i = 0;i<arr.length;i++){
            tCost += 1L*Math.abs(arr[i]-val)*cst[i];
        }
        return tCost;
    }
}