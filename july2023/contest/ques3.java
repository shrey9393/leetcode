class Solution {
    static int countHelper(int x, int n, int num, Map<String, Integer> hm) {
        String key = x + "-" + n + "-" + num;
        if (hm.containsKey(key)) {
            return hm.get(key);
        }

        int val = (int) (x - Math.pow(num, n));
        if (val == 0)
            return 1;
        if (val < 0)
            return 0;

        int ways = countHelper(val, n, num + 1, hm) +
                countHelper(x, n, num + 1, hm);

        hm.put(key, ways);
        return ways;
    }

    static int numberOfWays(int x, int n) {
        Map<String, Integer> memo = new HashMap<>();
        return countHelper(x, n, 1, memo);
    }
    /**
     * Input:
     * 213
     * 1
     * Output:
     * 1055852590
     * Expected:
     * 55852583
     */

}
