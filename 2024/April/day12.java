class Solution {
    public int trap(int[] height) {
        int maxL[] = new int[height.length];
        int maxR[] = new int[height.length];
        int m = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] > m) {
                m = height[i];
            }
            maxL[i] = m;
        }
        m = 0;
        for (int i = height.length - 1; i > -1; i--) {
            if (height[i] > m) {
                m = height[i];
            }
            maxR[i] = m;
        }
        int sum =0;
        for (int i = 0; i < maxR.length; i++) {
            sum += (Integer.min(maxL[i], maxR[i]) - height[i]);
        }
        return sum;
    }
}