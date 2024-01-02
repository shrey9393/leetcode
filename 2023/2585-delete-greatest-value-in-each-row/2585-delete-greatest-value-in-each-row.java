class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int sum =0;
        for(int i[] : grid){
            Arrays.sort(i);
        }
        int n =grid.length,m = grid[0].length;
        for(int i =0;i<m;i++){
            int max =0;
            for(int j =0;j<n;j++){
                max = Math.max(max,grid[j][i]);
            }
            sum+=max;
        }
        return sum;

    }
}