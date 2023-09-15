import java.util.*;

class Solution { 
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        boolean[] visited = new boolean[n];
        int[] minDistances = new int[n];
        Arrays.fill(minDistances, Integer.MAX_VALUE);
        minDistances[0] = 0;
        
        int cost = 0;
        
        for (int i = 0; i < n; i++) {
            int u = -1;
            for (int j = 0; j < n; j++) {
                if (!visited[j] && (u == -1 || minDistances[j] < minDistances[u])) {
                    u = j;
                }
            }
            
            visited[u] = true;
            cost += minDistances[u];
            
            for (int v = 0; v < n; v++) {
                if (!visited[v]) {
                    int distance = Math.abs(points[u][0] - points[v][0]) + Math.abs(points[u][1] - points[v][1]);
                    minDistances[v] = Math.min(minDistances[v], distance);
                }
            }
        }
        
        return cost;
    }
}
