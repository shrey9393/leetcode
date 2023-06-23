public class minmulk {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }

        int n = nums.length;
        int count = 0;
        int mul = 1;
        int left = 0;

        for (int i = 0; i < n; i++) {
            mul *= nums[i];
            while (mul >= k) {
                mul /= nums[left];
                left++;
            }
            count += i - left + 1;
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 2, 6 };
        numSubarrayProductLessThanK(arr, 100);
    }
}
