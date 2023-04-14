class Solution {
    private int memoizationUtil(String s1, String s2, int valM, int ValN, int[][] mm) {
		if (valM < 0 || ValN < 0) {
			return 0;
		}
		if (mm[valM][ValN] != -1) {
			return mm[valM][ValN];
		}
		if (s1.charAt(valM) == s2.charAt(ValN)) {
			return mm[valM][ValN] = 1 + memoizationUtil(s1, s2, valM - 1, ValN - 1, mm);
		} else {
			return mm[valM][ValN] = Math.max(memoizationUtil(s1, s2, valM - 1, ValN, mm),
					memoizationUtil(s1, s2, valM, ValN - 1, mm));
		}
	}

	private int memoization(String seq) {
		int n = seq.length();
		int[][] memoization = new int[n][n];
		for (int[] row : memoization) {
			Arrays.fill(row, -1);
		}
		String reverse = new StringBuilder(seq).reverse().toString();
		return memoizationUtil(seq, reverse, n - 1, n - 1, memoization);
	}

	private int tabulation(char[] a, char[] b, int m, int n) {
		int[][] lcs = new int[m + 1][n + 1];
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0) {
					lcs[i][j] = 0;
				} else if (a[i - 1] == b[j - 1]) {
					lcs[i][j] = lcs[i - 1][j - 1] + 1;
				} else {
					lcs[i][j] = Math.max(lcs[i - 1][j], lcs[i][j - 1]);
				}
			}
		}
		return lcs[m][n];
	}
    public int longestPalindromeSubseq(String s) {
        String reverse = new StringBuilder(s).reverse().toString();
        // return tabulation(s.toCharArray(), reverse.toCharArray(), s.length(), s.length());
        return memoization(s);
    }
}
