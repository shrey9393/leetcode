class Solution {
    private int[][] dic = new int[][] { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

    public boolean canCross(int row, int col, int[][] cells, int day) {
        int[][] gr = new int[row][col];
        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < day; i++) {
            gr[cells[i][0] - 1][cells[i][1] - 1] = 1;
        }

        for (int i = 0; i < col; i++) {
            if (gr[0][i] == 0) {
                q.offer(new int[] { 0, i });
                gr[0][i] = -1;
            }
        }

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0], c = cur[1];
            if (r == row - 1) {
                return true;
            }

            for (int[] dir : dic) {
                int newRow = r + dir[0];
                int newCol = c + dir[1];
                if (newRow >= 0 && newRow < row && newCol >= 0 && newCol < col && gr[newRow][newCol] == 0) {
                    gr[newRow][newCol] = -1;
                    q.offer(new int[] { newRow, newCol });
                }
            }
        }

        return false;
    }

    public int latestDayToCross(int r, int c, int[][] cells) {
        int left = 1;
        int right = r * c;

        while (left < right) {
            int mid = right - (right - left) / 2;
            if (canCross(r, c, cells, mid)) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }
}