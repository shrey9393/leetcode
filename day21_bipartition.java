import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        int col[] = new int[n + 1];
        List<Integer>[] g = new List[n + 1];
        for (int i = 0; i <= n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int v[] : dislikes) {
            g[v[0]].add(v[1]);
            g[v[1]].add(v[0]);
        }
        for (int i = 1; i <= n; i++) {
            if (col[i] == 0) {
                LinkedList<Integer> q = new LinkedList<>();
                q.add(i);
                col[i] = 1;
                while (q.size() != 0) {
                    int t = q.removeFirst();
                    for (int x : g[t]) {
                        if (col[x] == col[t]) {
                            return false;
                        }
                        if (col[x] == 0) {
                            col[x] = -col[t];
                            q.add(x);
                        }

                    }
                }

            }

        }
        return true;

    }
}