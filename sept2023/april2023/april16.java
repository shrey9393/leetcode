class Solution {
    public int numWays(String[] words, String target) {
        int modVal = 1000000007;
        int nLen = words[0].length();
        int[][] f = new int[nLen][26];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < nLen; j++) {
                f[j][words[i].charAt(j) - 'a']++;
            }
        }

        int[][] dp = new int[nLen + 1][target.length() + 1];
        for (int i = 0; i <= nLen; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= nLen; i++) {
            for (int j = 1; j <= target.length(); j++) {
                int charCount = f[i - 1][target.charAt(j - 1) - 'a'];
                dp[i][j] = (dp[i - 1][j] + (int) ((long) charCount * dp[i - 1][j - 1] % modVal)) % modVal;
            }
        }

        return dp[nLen][target.length()];
    }
}