class Solution {
    public int uniquePathsIII(int[][] grid) {
        int zo = 0,sx =0,sy=0;
        for(int i =0;i<grid.length;i++)
        {
            for(int j =0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    zo++;
                }
                else if(grid[i][j]==1){
                    sx=i;
                    sy=j;
                }
            }
            
        }
        return d(grid,sx,sy,zo);
    }
    public static int d(int grid[][],int x,int y,int zo){
        if(x<0 || y<0 || x>=grid.length || y>=grid[0].length || grid[x][y]==-1){
            return 0;
        }
        if(grid[x][y]==2){
            return zo==-1 ? 1 : 0;
        }
        grid[x][y]=-1;
        zo--;
        int tp = d(grid,x+1,y,zo)+d(grid,x,y+1,zo)+d(grid,x-1,y,zo)+d(grid,x,y-1,zo);
        grid[x][y]=0;
        zo++;
        return tp;
    }
}