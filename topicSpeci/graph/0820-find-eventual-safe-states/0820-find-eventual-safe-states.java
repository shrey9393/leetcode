class Solution {
    static boolean dfs(int cur, int graph[][],boolean visited[],boolean dfsVisited[],boolean hasCycle[]){
        visited[cur] = true;
        dfsVisited[cur] = true;
        int arr[] = graph[cur];
        for(int i : arr){
            if(!visited[i] ){
                if(dfs(i,graph,visited,dfsVisited,hasCycle)){
                    hasCycle[cur] = true;
                    return true;
                }
            }
            else if (visited[i]&& dfsVisited[i]){
                hasCycle[cur]= true;
                return true;
            }
        }
        dfsVisited[cur] = false;
        return false;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int len = graph.length;
        boolean visited[] = new boolean[len];
        boolean dfsVisited[] = new boolean[len];
        boolean hasCycle[] = new boolean[len];
        for(int i =0;i<len;i++){
            if(!visited[i]){
                dfs(i,graph,visited,dfsVisited,hasCycle);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int i =0;i<len;i++){
            if(!hasCycle[i]){
                ans.add(i);
            }
        }
        return ans;
    }
}