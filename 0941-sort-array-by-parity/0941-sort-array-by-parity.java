class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int eIdx=0,oIdx =0;
        while(oIdx!=nums.length){
            if(nums[oIdx]%2==0){
                int temp =nums[oIdx];
                nums[oIdx]=nums[eIdx];
                nums[eIdx]=temp;
                eIdx++;
            }
            oIdx++;
        }   
        return nums;
    }
}