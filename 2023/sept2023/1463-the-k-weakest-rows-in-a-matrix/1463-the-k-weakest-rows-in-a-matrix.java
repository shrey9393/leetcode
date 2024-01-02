import java.util.PriorityQueue;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[1] != b[1]) {
                return Integer.compare(a[1], b[1]);
            } else {
                return Integer.compare(a[0], b[0]);
            }
        });

        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat[0].length; j++) {
                sum += mat[i][j];
            }
            pq.add(new int[] { i, sum });
        }

        int ans[] = new int[k];
        int j = 0;
        while (j < k && !pq.isEmpty()) {
            ans[j++] = pq.poll()[0];
        }
        return ans;
    }
}
