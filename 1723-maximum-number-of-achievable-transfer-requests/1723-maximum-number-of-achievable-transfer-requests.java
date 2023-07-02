public class Solution {
    public int maximumRequests(int n, int[][] requests) {
        int mReq = 0;
        int reqLen = requests.length;

        for (int i = 0; i < (1 << reqLen); i++) {
            HashMap<Integer, Integer> hm = new HashMap<>();
            int currRequests = 0;

            for (int j = 0; j < reqLen; j++) {
                if ((i & (1 << j)) != 0) {
                    int from = requests[j][0];
                    int to = requests[j][1];

                    hm.put(from, hm.getOrDefault(from, 0) - 1);
                    hm.put(to, hm.getOrDefault(to, 0) + 1);
                    currRequests++;
                }
            }

            boolean isFeasible = true;
            for (int count : hm.values()) {
                if (count != 0) {
                    isFeasible = false;
                    break;
                }
            }
            if (isFeasible) {
                mReq = Math.max(mReq, currRequests);
            }
        }

        return mReq;
    }
}
