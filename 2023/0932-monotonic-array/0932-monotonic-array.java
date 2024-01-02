class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean b = true;
        int n = nums.length-1;
        for(int i =0;i<n;i++){
            if(nums[i]>nums[i+1]){
                b = false;
                break;
            }
        }
        if(b){
            return b;
        }
        for(int j =0;j<n;j++){
            if(nums[j]<nums[j+1]){
                b = false;
                break;
            }
            else{
                b = true;
            }
        }
        return b;
    }
}