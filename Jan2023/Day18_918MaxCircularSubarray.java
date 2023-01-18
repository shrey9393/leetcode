class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;
        int c1 =0,c2 =0 , t=0;

        for(int i =0;i<nums.length;i++){
            c1+=nums[i];
            max = Integer.max(max,c1);
            c1 = Integer.max(0,c1);

            c2+=nums[i];
            min = Integer.min(min,c2);
            c2 = Integer.min(0,c2);

            t+=nums[i];
        }
        return max< 0 ? max : Integer.max(max,t-min);

    }
}