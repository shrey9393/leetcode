class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {
        int[] arr = new int[high + 1];
        arr[0] = 1;
        int mod = 1_000_000_007;

        for (int e = 1; e <= high; ++e) {
            if (e >= zero) {
                arr[e] += arr[e - zero];
            }
            if (e >= one) {
                arr[e] += arr[e - one];
            }
            arr[e] %= mod;
        }
        int ans = 0;
        for (int i = low; i <= high; ++i) {
            ans += arr[i];
            ans %= mod;
        }
        return ans;
    }
}