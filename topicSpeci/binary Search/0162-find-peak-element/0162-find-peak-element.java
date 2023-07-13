class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n==1||nums[0]>nums[1]){
            return 0;
        }
        if(nums[n-1]>nums[n-2]){
            return n-1;
        }
        int start = 0,mid =0,end =n-1;
        while(start<=end){
            mid = (end+start)/2;
            int m1 = mid==0?Integer.MIN_VALUE:nums[mid-1];
            int m2 = mid==end?Integer.MIN_VALUE:nums[mid+1];
            if(m1<nums[mid]&&m2<nums[mid]){
                return mid;
            }
            if(m1<nums[mid]){
                start=mid+1;
            }else{
                end = mid-1;
            }
        }
        return start;
    }
}