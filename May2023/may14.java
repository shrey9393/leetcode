class Solution {
    int[] memo;

    public int maxScore(int[] arr) {
        int n = arr.length;
        memo = new int[1 << n];
        Arrays.fill(memo, -1);
        return dp(0, arr);
    }

    private int dp(int bitmask, int[] nums) {
        int sb = 0;
        int b = bitmask;

        while (b > 0) {
            sb += (b & 1);
            b = b >> 1;
        }

        if (sb == nums.length) {
            return 0;
        }

        int op = 1 + (sb / 2);
        if (memo[bitmask] == -1) {
            int maxVal = 0;
            for (int i = 0; i < nums.length; i++) {
                if ((bitmask & (1 << i)) == 0) {
                    for (int j = i + 1; j < nums.length; j++) {
                        if ((bitmask & (1 << j)) == 0) {
                            maxVal = Math.max(maxVal,
                                    op * gcd(nums[i], nums[j]) + dp(bitmask | (1 << i) | (1 << j), nums));
                        }
                    }
                }
            }
            memo[bitmask] = maxVal;
        }

        return memo[bitmask];

    }

    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}