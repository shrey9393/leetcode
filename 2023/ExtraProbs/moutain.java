class Solution {
    public int findInMountainArray(int target, MountainArray mArr) {
        int peakIdx = -1;
        int left = 0, mid = 0, right = mArr.length() - 1;

        while (left <= right) {
            mid = (left + right) / 2;

            int a = (mid - 1 >= 0) ? mArr.get(mid - 1) : Integer.MIN_VALUE;
            int b = mArr.get(mid);
            int c = (mid + 1 < mArr.length()) ? mArr.get(mid + 1) : Integer.MIN_VALUE;

            if (a < b && b > c) {
                peakIdx = mid;
                break;
            } else if (c > b) {
                left = mid + 1;
            } else if (a > b) {
                right = mid - 1;
            }
        }

        left = 0;
        right = peakIdx;

        while (left <= right) {
            mid = (left + right) / 2;
            int val = mArr.get(mid);

            if (val == target) {
                return mid;
            } else if (val < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        left = peakIdx;
        right = mArr.length() - 1;

        while (left <= right) {
            mid = (left + right) / 2;
            int val = mArr.get(mid);

            if (val == target) {
                return mid;
            } else if (val > target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}