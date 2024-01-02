import java.util.*;

class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        HashMap<Integer, HashSet<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new HashSet<>());
        }
        for (int i[] : roads) {
            graph.get(i[0]).add(i[1]);
            graph.get(i[1]).add(i[0]);
        }
        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int currentRank = graph.get(i).size() + graph.get(j).size();
                if (graph.get(i).contains(j)) {
                    currentRank--;
                }
                ans = Math.max(ans, currentRank);
            }
        }
        return ans;
    }
}
