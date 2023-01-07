import java.util.stream.IntStream;

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        IntStream s1 = IntStream.of(cost);
        IntStream s2 = IntStream.of(gas);
        // int sum = s1.sum()
        if (s2.sum() < s1.sum()) {
            return -1;
        }
        int sum = 0, res = 0;
        for (int i = 0; i < cost.length; i++) {
            sum += (gas[i] - cost[i]);
            if (sum < 0) {
                sum = 0;
                res = i + 1;
            }
        }
        return res;
    }
}
