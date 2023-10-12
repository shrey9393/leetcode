class Solution {
    public int[] distributeCandies(int c, int np) {
        int ans[] = new int[np];
        int idx = 1;

        while (c > 0) {
            ans[(idx - 1) % np] += Math.min(c, idx);
            c -= idx;
            idx++;
        }

        return ans;
    }
}
