class Solution {
    public int uniquePathsWithObstacles(int[][] obs) {
        int col = obs.length;
        int row = obs[0].length;
        
        if (obs[0][0] == 1) 
            return 0;
        
        if (obs[col - 1][row - 1] == 1) 
            return 0;
        
        int dp[][] = new int[col][row];
        dp[0][0] = 1;
        
        for (int i = 1; i < col; i++) {
            if (obs[i][0] == 1) {
                dp[i][0] = 0;
                continue;
            }
            dp[i][0] = dp[i - 1][0];
        }
        
        for (int i = 1; i < row; i++) {
            if (obs[0][i] == 1) {
                dp[0][i] = 0;
                continue;
            }
            dp[0][i] = dp[0][i - 1];
        }
        
        for (int i = 1; i < col; i++) {
            for (int j = 1; j < row; j++) {
                if (obs[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        
        return dp[col - 1][row - 1];
    }
}
