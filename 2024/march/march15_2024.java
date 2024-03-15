class Solution {
    public int[] productExceptSelf(int[] nums) {
        int val = nums.length - 1;
        int arr[] = new int[val + 1];
        int pRight[] = new int[val + 1];
        int pLeft[] = new int[val + 1];
        pLeft[0] = nums[0];
        pRight[val] = nums[val];

        for (int i = 1; i < val; i++) {
            pLeft[i] = pLeft[i - 1] * nums[i];
        }
        for (int i = val - 1; i > -1; i--) {
            pRight[i] = pRight[i + 1] * nums[i];
        }
        arr[0] = pRight[1];
        arr[val] = pLeft[val - 1];
        for (int i = 1; i <= val - 1; i++) {
            arr[i] = pLeft[i - 1] * pRight[i + 1];
        }
        return arr;
    }
}