import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
    boolean visited[];

    public int dfs(int src, HashSet<Integer> set) {
        visited[src] = true;
        set.add(hm.get(src).size());
        int ans = 1;
        for (int i : hm.get(src)) {
            if (!visited[i]) {
                ans += dfs(i, set);
            }
        }
        return ans;
    }

    public int countCompleteComponents(int n, int[][] edges) {
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            hm.put(i, new ArrayList<>());
        }
        for (int[] is : edges) {
            hm.get(is[0]).add(is[1]);
            hm.get(is[1]).add(is[0]);
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                HashSet<Integer> set = new HashSet<>();
                int count = dfs(i, set);
                if (set.size() == 1 && set.contains(count - 1)) {
                    ans++;
                }
            }

        }
        return ans;
    }
}