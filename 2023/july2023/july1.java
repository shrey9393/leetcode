class Solution {
    private int result = Integer.MAX_VALUE;
    private int n;

    public void solve(int idx, int[] cookies, int[] children, int k) {
        if (idx == cookies.length) {
            int ans = -1;
            for(int val:children){
                ans = Math.max(ans,val);
            }
            result = Math.min(result, ans);
            return;
        }

        int candy = cookies[idx];
        for (int i = 0; i < k; i++) {
            children[i] += candy;

            solve(idx + 1, cookies, children, k);

            children[i] -= candy;
        }
    }

    public int distributeCookies(int[] cookies, int k) {
        n = cookies.length;
        int[] children = new int[k];
        solve(0, cookies, children, k);
        return result;
    }
}