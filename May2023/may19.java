class Solution {
    public boolean isBipartite(int[][] g) {
        int[] colors = new int[g.length];
        Arrays.fill(colors, -1);
        for(int u = 0; u < g.length; u++){
            if(colors[u] == -1){
                if(!dfs(u, g, colors, 1)){
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean dfs(int u, int[][]g, int[]colors, int col){
        if (colors[u] == 1 - col){
            return false; 
        } 
        if (colors[u] == col) {
            return true; 
        }
        colors[u] = col;
        for (var neighbor: g[u]) {
            if (!dfs(neighbor, g, colors, 1 - col)) {
                return false;
            }
        }
        return true;
    }
}