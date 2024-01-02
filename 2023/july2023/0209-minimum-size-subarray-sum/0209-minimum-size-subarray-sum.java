class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int end = 0,sum =0, len = Integer.MAX_VALUE;
        for(int start =0;start<nums.length;start++){
            sum+=nums[start];
            while(sum>=target){
                len = Math.min(len,start-end+1);
                sum-=nums[end++];
            }
        }
        return len == Integer.MAX_VALUE?0:len;
        
    }
}