class Solution {
    public int diagonalSum(int[][] mat) {
        int x = mat.length;
        int sum = 0;
        for (int i = 0; i < x; i++) {
            sum += mat[i][i];
        }
        int j = x - 1;
        int i = 0;
        while (j > -1) {
            sum += mat[i++][j--];
        }
        if (x % 2 != 0) {
            sum -= mat[(x - 1) / 2][(x - 1) / 2];
        }
        return sum;

    }
}