class Solution {
    public int row, col;
    int calls[][] = { { 0, -1 }, { -1, 0 }, { 1, 0 }, { 0, 1 } };
    int ans = 0;

    public int solve(int grid[][], int idx, int idy) {
        if (idx >= row || idy >= col || idx < 0 || idy < 0 || grid[idx][idy] == 0) {
            return 1;
        }
        if (grid[idx][idy] == -2) {
            return 0;
        }
        grid[idx][idy] = -2;
        int peri = 0;
        for (int arr[] : calls) {
            peri += solve(grid, idx + arr[0], idy + arr[1]);
        }
        ans += peri;
        return 0;
    }

    public int islandPerimeter(int[][] grid) {
        row = grid.length;
        col = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    solve(grid, i, j);
                }
            }
        }

        return ans;
    }
}