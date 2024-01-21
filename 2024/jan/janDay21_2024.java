class Solution {
    public int rob(int[] nums) {
        int arr[] = new int[nums.length];
        arr[0] = nums[0];
        if(nums.length==1)
        {
            return nums[0];
        }
        if (nums.length == 2) {
            return Integer.max(nums[0], nums[1]);
        }
        arr[1] = Integer.max(nums[0], nums[1]);
        for (int i = 2; i < arr.length; i++) {
            arr[i] = Integer.max(arr[i - 2] + nums[i], arr[i - 1]);
        }
        return arr[nums.length - 1];
    }
}