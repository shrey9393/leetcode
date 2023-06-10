class Solution {
    public int maxValue(int n, int index, int maxSum) {
        long leftPointer = index;
        long rightPointer = n - index - 1;
        long startPointer = 1;
        long endPointer = maxSum;
        while (startPointer <= endPointer) {
            long midValue = startPointer + (endPointer - startPointer) / 2;
            long m = midValue - 1;
            long leftSide = 0;
            long rightSide = 0;
            if (m >= leftPointer) {
                long notInRange = m - leftPointer;
                leftSide = m * (m + 1) / 2 - (notInRange) * (notInRange + 1) / 2;
            } else {
                leftSide = m * (m + 1) / 2 + 1 * (leftPointer - m);
            }
            if (m >= rightPointer) {
                long notInRange = m - rightPointer;
                rightSide = m * (m + 1) / 2 - (notInRange) * (notInRange + 1) / 2;
            } else {
                rightSide = m * (m + 1) / 2 + 1 * (rightPointer - m);
            }
            long sum = rightSide + leftSide + midValue;
            if (sum > maxSum) {
                endPointer = midValue - 1;
            } else {
                startPointer = midValue + 1;
            }
        }
        return (int) endPointer;
    }
}
