public class TryQues {
    public static int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        int maxMul = 0;
        for (int i = 0; i < n; i++) {
            maxMul += (nums[i] * i);
        }
        int ans = maxMul;
        for (int i = 1; i < n; i++) {
            int x = sum - (n * nums[n - i]);;
            maxMul += sum - (n * nums[n - i]);
            ans = Math.max(ans, maxMul);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 6 };
        System.out.println(maxRotateFunction(arr));
    }
}
