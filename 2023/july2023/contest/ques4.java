// leetcode 6931. Visit Array Positions to Maximize Score
// Level: Medium
class Solution {
    public int binarySearch(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;
        int index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= target) {
                index = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return index;
    }

    public long maxScore(int[] nums, int x) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            left[i] = sum;
        }

        sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            sum += nums[i];
            right[i] = sum;
        }

        long max = 0;
        for (int i = 0; i < n; i++) {
            if (left[i] <= x && right[i] <= x) {
                max = Math.max(max, i + 1);
            }
        }

        for (int i = 0; i < n; i++) {
            if (left[i] <= x) {
                int target = x - left[i];
                int index = binarySearch(right, target);
                if (index != -1) {
                    max = Math.max(max, i + 1 + index + 1);
                }
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (right[i] <= x) {
                int target = x - right[i];
                int index = binarySearch(left, target);
                if (index != -1) {
                    max = Math.max(max, i + 1 + index + 1);
                }
            }
        }

        return max;
    }
}