class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] arr = new ArrayList[numCourses];
        int inEdge[] = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            arr[i] = new ArrayList<>();
        }
        for(int x[]:prerequisites){
            int a = x[0];
            int b = x[1];
            arr[b].add(a);
            inEdge[a]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i =0;i<numCourses;i++){
            if(inEdge[i]==0){
                q.offer(i);
            }
        }
        int ct = 0;
        while(!q.isEmpty()){
            int temp = q.poll();
            ct++;
            for(int x:arr[temp]){
                inEdge[x]--;
                if(inEdge[x]==0){
                    q.offer(x);
                }
            }
        }
        return ct==numCourses;
    }
}
