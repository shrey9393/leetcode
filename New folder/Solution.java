import java.util.PriorityQueue;
import java.util.TreeSet;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        TreeSet<int[]> pq = new TreeSet<>();
        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat[0].length; j++) {
                sum += mat[i][j];
            }
            pq.add(new int[] { i, sum });
        }

        int ans[] = new int[k];
        int j = 0;
        for (int i[] : pq) {
            ans[j++] = i[0];
            if (j == k) {
                break;
            }

        }

        return ans;
    }
}
