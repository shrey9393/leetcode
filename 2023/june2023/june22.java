class june22 {
    public int maxProfit(int[] prices, int fee) {
        int bp = prices[0] + fee;
        int ans = 0;
        for (int i = 1; i < prices.length; i++) {
            if (bp > prices[i] + fee) {

                bp = prices[i] + fee;
            } else if (prices[i] > bp) {
                ans += prices[i] - bp;
                bp = prices[i];
            }
        }
        return ans;
    }
}
