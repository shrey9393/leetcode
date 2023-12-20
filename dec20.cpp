class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int n = money-prices[0]-prices[1];
        return (n>=0)?n:money;
    }
}
