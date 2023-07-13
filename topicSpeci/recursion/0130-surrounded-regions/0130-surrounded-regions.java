class Solution {
    public void dfs(char board[][],int i ,int j){
        if(i<0||j<0||i>=board.length||j>=board[0].length){
            return;
        }
        if(board[i][j]=='O'){
            board[i][j]='S';
        }
        else{
            return;
        }
        dfs(board,i-1,j);
        dfs(board,i+1,j);
        dfs(board,i,j-1);
        dfs(board,i,j+1);
    }
    public void solve(char[][] board) {
        int row = board.length;
        int col = board[0].length;
        for(int i =0;i<col;i++){
            if(board[0][i]=='O'){
                dfs(board,0,i);
            }
            if(board[row-1][i]=='O'){
                dfs(board,row-1,i);
            }
        }
        for(int i =0;i<row;i++){
            if(board[i][0]=='O'){
                dfs(board,i,0);
            }
            if(board[i][col-1]=='O'){
                dfs(board,i,col-1);
            }
        }
        for(int i=0;i<row;i=i+1){
            for(int j=0;j<col;j=j+1){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }else if(board[i][j]=='S'){
                    board[i][j]='O';
                }
            }
        }
    }
}