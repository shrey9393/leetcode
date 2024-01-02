import java.util.*;

class Solution {
    public int[] longestObstacleCourseAtEachPosition(int[] obstacles) {
        int obsLen = obstacles.length;
        int[] dp = new int[obsLen];
        int[] res = new int[obsLen];
        int len = 0;
        for (int i = 0; i < obsLen; i++) {
            int idx = binarySearch(dp, 0, len - 1, obstacles[i]);

            dp[idx] = obstacles[i];
            if (idx == len) {
                len++;
            }

            res[i] = idx + 1;
        }

        return res;
    }

    private int binarySearch(int[] dp, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (dp[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}