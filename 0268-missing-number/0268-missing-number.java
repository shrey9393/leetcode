class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i =0;
        for(int x : nums){
            if(x!=i){
                return i;
            }
            i++;
        }
        return i ;
    }
}