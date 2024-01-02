class Solution {
    public double new21Game(int N, int K, int maxPts) {
        // Corner cases
        if (K == 0)
            return 1.0;
        if (N >= K - 1 + maxPts)
            return 1.0;

        // dp[i] is the probability of getting point i.
        double[] dpArr = new double[N + 1];
        Arrays.fill(dpArr, 0.0);

        double prob = 0.0; // dp of N or less points.
        double wSum = 1.0; // Sliding required window sum
        dpArr[0] = 1.0;
        for (int i = 1; i <= N; i++) {
            dpArr[i] = wSum / maxPts;

            if (i < K)
                wSum += dpArr[i];
            else
                prob += dpArr[i];

            if (i >= maxPts)
                wSum -= dpArr[i - maxPts];
        }

        return prob;
    }
}