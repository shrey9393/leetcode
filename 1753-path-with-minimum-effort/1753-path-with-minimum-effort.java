import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length, n = heights[0].length;
        int res[][] = new int[m][n];
        for (int i[] : res) {
            Arrays.fill(i, Integer.MAX_VALUE);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        pq.add(new int[] { 0, 0, 0 });

        int dir[][] = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };
        while (!pq.isEmpty()) {
            int top[] = pq.poll();
            int cost = top[0], x = top[1], y = top[2];
            if (cost > res[x][y]) {
                continue;
            }
            if (x == m - 1 && y == n - 1) {
                return cost;
            }
            for (int i[] : dir) {
                int new_x = x + i[0], new_y = y + i[1];
                if (new_x >= 0 && new_y >= 0 && new_x < m && new_y < n) {
                    int temp = Math.max(cost, Math.abs(heights[x][y] - heights[new_x][new_y]));
                    if (temp < res[new_x][new_y]) {
                        res[new_x][new_y] = temp;
                        pq.add(new int[] { temp, new_x, new_y });
                    }
                }

            }
        }
        return -1;
    }
}