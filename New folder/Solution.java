class Solution {
    public static int maximizeSum(int[] nums, int k) {
        int sum = 0;
        int i = 0;
        for (i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        for (; i < nums.length; i++) {
            sum += (nums[i] - nums[i - k]);
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(maximizeSum(arr, 3));
    }
}