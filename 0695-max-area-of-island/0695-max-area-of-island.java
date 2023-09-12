class Solution {
    public int arr[][];
    public int ans = 0, m, n;

    public int solve(int arr[][], int idx, int idy) {
        if (idx < 0 || idy < 0 || idx >= m || idy >= n || arr[idx][idy] == 0) {
            return 0;
        }
        arr[idx][idy] = 0;
        int count = 1; // Start with 1 for the current cell
        count += solve(arr, idx + 1, idy);
        count += solve(arr, idx - 1, idy);
        count += solve(arr, idx, idy + 1);
        count += solve(arr, idx, idy - 1);
        return count;
    }

    public int maxAreaOfIsland(int[][] grid) {
        arr = grid;
        m = grid.length;
        n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    int max = solve(grid, i, j);
                    ans = Math.max(ans, max);
                }
            }
        }
        return ans;
    }
}
