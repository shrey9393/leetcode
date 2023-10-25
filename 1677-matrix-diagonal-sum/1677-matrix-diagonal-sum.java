class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int ans =0;
        for(int i =0;i<n;i++){
            int sec = n-i-1;
            ans+=mat[i][i];
            if(i!=sec){
                ans+=mat[i][sec];
            }
        }
        return ans;
    }
}