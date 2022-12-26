class Solution {
    public boolean canJump(int[] nums) {
        int reble=0;
        for(int i =0;i<nums.length;i++){
            if(i>reble){
                return false;
            }
            reble = Integer.max(reble,nums[i]+i);
        }
        return true;
    }
}