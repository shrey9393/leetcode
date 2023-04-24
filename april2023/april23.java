class Solution {
    private int mod = 1_000_000_007;

    private int memoizationUtil(String s, int start, long k, int[] dp) {
        if (start == s.length()) {
            return 1;
        }
        if (s.charAt(start) == '0') {
            return 0;
        }
        if (dp[start] != -1) {
            return dp[start];
        }
        int val = 0;
        long numB = 0;
        for (int end = start; end < s.length(); end++) {
            numB = numB * 10 + s.charAt(end) - '0';
            if (numB > k) {
                break;
            }
            val += memoizationUtil(s, end + 1, k, dp);
            val %= mod;
        }
        return dp[start] = val;
    }

    private int memoization(String s, int k) {
        int[] dp = new int[s.length()];
        Arrays.fill(dp, -1);
        return memoizationUtil(s, 0, k, dp);
    }

    private int tabulation(String s, int k) {
        int dp[] = new int[s.length() + 1];
        dp[0] = 1;
        for (int start = 0; start < s.length(); start++) {
        if (s.charAt(start) == '0') {
            continue;
        }
        long num = 0;
        for (int end = start; end < s.length(); end++) {
            num = num * 10 + s.charAt(end) - '0';
            if (num > k) {
                break;
            }
            dp[end + 1] = (dp[end + 1] + dp[start]) % mod;
        }
        }
        return dp[s.length()];
    }
    public int numberOfArrays(String s, int k) {
        return tabulation(s, k);
    }
}