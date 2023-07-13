class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int ans[] = new int[numCourses];
        ArrayList<Integer>[] graph = new ArrayList[numCourses];
        for(int i =0;i<numCourses;i++){
            graph[i] = new ArrayList<>();
        }
        for(int arr[]: prerequisites){
            int crs = arr[0];
            int preq = arr[1];
            graph[preq].add(crs);
        }


        int indegree[] = new int[numCourses];
        for(int i =0;i<numCourses;i++){
            for(int x:graph[i]){
                indegree[x]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int idx =0;
        int count =0;
        while(!q.isEmpty()){
            int temp = q.poll();
            count++;
            ans[idx++]=temp;
            for(int z:graph[temp]){
                indegree[z]--;
                if(indegree[z]==0){
                    q.offer(z);
                }
            }
        }
        if(count!=numCourses) return new int[0];
        return ans;
    }
}