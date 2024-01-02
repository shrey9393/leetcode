
class Solution {
    static int dp[][];

    public static int rec(int st, int end, int arr[]) {
        if (st == end) {
            return arr[end];
        }
        int l = arr[st] - rec(st + 1, end, arr);
        int r = arr[end] - rec(st, end - 1, arr);
        return dp[st][end] = Math.max(l, r);
    }

    public static boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
        dp = new int[n][n];
        return rec(0, n - 1, nums) >= 0;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 2 };
        System.out.println(PredictTheWinner(arr));
    }
}
// can also refer to
// https://github.com/MAZHARMIK/Interview_DS_Algo/blob/master/DP/Game%20Strategy/Predict%20the%20Winner.cpp
