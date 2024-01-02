
// User function Template for Java
import java.util.*;;

class Solution {
    static List<Integer> nextPermutation(int N, int nums[]) {
        int idx = nums.length - 2;
        while (idx >= 0 && nums[idx] >= nums[idx + 1]) {
            idx--;
        }
        if (idx >= 0) {
            int idy = nums.length - 1;
            while (idy >= 0 && nums[idy] <= nums[idx])
                idy--;
            swap(nums, idx, idy);
        }
        reverse(nums, idx + 1);

        List<Integer> li = new ArrayList<>();
        for (Integer integer : nums) {
            li.add(integer);
        }
        return li;
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}