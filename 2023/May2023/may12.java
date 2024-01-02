class Solution {
    int n ;
    long solve(int i , int[][] q, long arr[]){
        if(i>=n){
            return 0;
        }
        if(arr[i]!=-1){
            return arr[i];
        }
        long taken = q[i][0] + solve(i+q[i][1]+1,q,arr);
        long Nottaken =solve(i+1,q,arr);
        return arr[i]= Long.max(taken,Nottaken);
    }
    public long mostPoints(int[][] qus) {
        n = qus.length;
        long arr[]= new long[n+1];
        Arrays.fill(arr,-1);
        return solve(0,qus,arr);
    }
}