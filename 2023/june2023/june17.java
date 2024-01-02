class Solution {
    public int makeArrayIncreasing(int[] originalArray, int[] insertArray) {
        TreeSet<Integer> iS = new TreeSet<>(Arrays.stream(insertArray).boxed().toList());
        int[] dp = new int[insertArray.length + 1];
        dp[0] = -1;
        int infi = (int) 2e9;
        for (int i = 0; i < originalArray.length; i++) {
            for (int j = insertArray.length; j >= 0; j--) {
                int currentElement = originalArray[i] > dp[j] ? originalArray[i] : infi;
                Integer nextHigher = iS.higher(j == 0 ? infi : dp[j - 1]);
                dp[j] = Math.min(currentElement, nextHigher == null ? infi : nextHigher);
            }
        }
        for (int i = 0; i < insertArray.length; i++)
            if (dp[i] != infi)
                return i;
        return -1;

    }
}