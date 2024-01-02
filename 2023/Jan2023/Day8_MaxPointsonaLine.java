import java.util.*;

class Solution {
    public int maxPoints(int[][] points) {
        int max = 0;
        for (int x[] : points) {
            Map<Double, Integer> m = new HashMap<>();
            for (int y[] : points) {
                if (x == y) {
                    continue;
                }
                double slope;
                if (x[0] == y[0]) {
                    slope = Double.POSITIVE_INFINITY;
                } else {
                    slope = (y[1] - x[1]) / (double) (y[0] - x[0]);
                }
                m.put(slope, m.getOrDefault(slope, 0) + 1);
                max = Math.max(max, m.get(slope));
            }
        }
        return max + 1;
    }
}