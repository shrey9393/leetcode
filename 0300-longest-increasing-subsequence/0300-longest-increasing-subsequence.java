class Solution {
    public int lengthOfLIS(int[] nums) {
        TreeSet<Integer> ts = new TreeSet<>();
        for (Integer val : nums) {
            ts.add(val);
        }

        int arr[] = new int[ts.size()];
        int j = 0;
        for (int i : ts) {
            arr[j] = i;
            j++;

        }
        int aLen = nums.length;
        int arrLen = arr.length;
        int dp[][] = new int[aLen + 1][arrLen + 1];
        for (int i = 1; i < aLen + 1; i++) {
            for (j = 1; j < arrLen + 1; j++) {
                if (nums[i - 1] == arr[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    int ans1 = dp[i - 1][j];
                    int ans2 = dp[i][j - 1];
                    dp[i][j] = Math.max(ans1, ans2);
                }

            }

        }
        return (dp[aLen][arrLen]);
    }
}