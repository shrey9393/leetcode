public class SumofAbsolute {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i] += Math.abs(nums[i] - nums[j]);
            }
        }
        return arr;
    }

}
