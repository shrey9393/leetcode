class Solution {
    HashMap<Integer, Integer> mark = new HashMap<>();
    int dp[][] = new int[2001][2001];
    
    boolean solve(int[] stones, int n, int index, int prevJump) {
        if (index == n - 1) {
            return true;
        }
        if (dp[index][prevJump] != -1) {
            return dp[index][prevJump] == 1;
        }
        boolean ans = false;
        for (int nextJump = prevJump - 1; nextJump <= prevJump + 1; nextJump++) {
            if (nextJump > 0 && mark.containsKey(stones[index] + nextJump)) {
                ans = ans || solve(stones, n, mark.get(stones[index] + nextJump), nextJump);
            }
        }
        dp[index][prevJump] = (ans ? 1 :0);
        return ans;
    }
    public boolean canCross(int[] stones) {
        for (int i = 0 ; i < stones.length; i++) {
            mark.put(stones[i], i);
        } 
        for (int i = 0; i < 2000; i++) {
            Arrays.fill(dp[i], -1);
        }
        return solve(stones, stones.length, 0, 0);
    }
}