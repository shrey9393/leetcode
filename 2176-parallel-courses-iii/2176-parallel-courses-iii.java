class Solution {
    public int solve(int i,List<List<Integer>> preq,int time[], int memo[]){
        if(memo[i]!=0){
            return memo[i];
        }
        int max =0;
        for(int j:preq.get(i)){
            max = Math.max(max,solve(j,preq,time,memo));
        }
        memo[i] = max+time[i];
        return memo[i];
    }
    public int minimumTime(int n, int[][] relations, int[] time) {
        List<List<Integer>>  preq = new ArrayList<>();
        for(int i =0;i<n;i++){
            preq.add(new ArrayList<>());
        }
        for(int i[]:relations){
            preq.get(i[0]-1).add(i[1]-1);
        }
        int memo[] = new int[n];
        int minTime =0;
        for(int i =0;i<n;i++){
            minTime = Math.max(solve(i,preq,time,memo),minTime);
        }
        return minTime;
    }
}