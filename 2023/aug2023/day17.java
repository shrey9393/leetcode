class Solution {
    public int findZero(int i, int j, int mat[][]) {
        if (i < 0 || j < 0 || i >= mat.length || j >= mat[0].length || mat[i][j] == 0) {
            return 0;
        }

        int up = findZero(i - 1, j, mat);
        int left = findZero(i, j - 1, mat);
        int down = findZero(i + 1, j, mat);
        int right = findZero(i, j + 1, mat);

        int min = Math.min(up, Math.min(left, Math.min(down, right)));
        return min + 1;
    }

    public int[][] updateMatrix(int[][] mat) {
        int col = mat.length;
        int row = mat[0].length;
        int dp[][] = new int[col][row];
        if (mat[0][0] == 1) {
            dp[0][0] = 1;
        }
        for (int i = 1; i < row; i++) {
            if (mat[0][i] == 1) {
                dp[0][i] = dp[0][i - 1] + 1;
            }
        }
        for (int i = 1; i < col; i++) {
            if (mat[i][0] == 1) {
                dp[i][0] = dp[i - 1][0] + 1;
            }
        }
        for (int i = 1; i < col; i++) {
            for (int j = 1; j < row; j++) {
                if (mat[i][j] == 1) {
                    dp[i][j] = findZero(i, j, mat);
                }
            }
        }
        return dp;
    }
}