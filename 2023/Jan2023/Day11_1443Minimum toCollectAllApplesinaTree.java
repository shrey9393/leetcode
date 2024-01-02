import java.util.*;

class Solution {

    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        Map<Integer, List<Integer>> aj = new HashMap<>();
        for (int[] edge : edges) {
            int initEdge = edge[0], nextEdge = edge[1];
            aj.computeIfAbsent(initEdge, value -> new ArrayList<Integer>()).add(nextEdge);
            aj.computeIfAbsent(nextEdge, value -> new ArrayList<Integer>()).add(initEdge);
        }
        return dfs(0, -1, aj, hasApple);
    }

    public int dfs(int nd, int parent, Map<Integer, List<Integer>> aj, List<Boolean> hasApple) {
        if (!aj.containsKey(nd))
            return 0;

        int totalTime = 0, childTime = 0;
        for (int child : aj.get(nd)) {
            if (child == parent) {
                continue;
            }
            childTime = dfs(child, nd, aj, hasApple);
            if (childTime > 0 || hasApple.get(child)) {
                totalTime += childTime + 2;
            }
        }
        return totalTime;
    }
}