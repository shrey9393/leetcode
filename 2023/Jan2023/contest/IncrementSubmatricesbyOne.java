import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int a[][] = new int[n][n];
        for (int i = 0; i < queries.length; i++) {
            int sidx = queries[i][0];
            int sidy = queries[i][1];
            int endidx = queries[i][2];
            int endidy = queries[i][3];
            for (int j = sidx; j <= endidx; j++) {
                for (int j2 = sidy; j2 <= endidy; j2++) {
                    a[j][j2]++;
                }
            }
        }
        return a;
    }
}