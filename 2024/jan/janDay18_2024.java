class Solution {
    public HashMap<String, Integer> hm = new HashMap<>();

    public int rec(int i, int j, int arr[][]) {
        int row = arr.length;
        int col = arr[0].length;
        if (i == row) {
            return 0;
        }
        if (j < 0 || j >= col) {
            return Integer.MAX_VALUE;
        }
        String k = i + "+" + j;
        if (hm.containsKey(k)) {
            return hm.get(k);
        }
        int x1 = rec(i + 1, j - 1, arr);
        int x2 = rec(i + 1, j, arr);
        int x3 = rec(i + 1, j + 1, arr);
        int min = Integer.min(x1, Integer.min(x2, x3));
        hm.put(k, arr[i][j] + min);
        return arr[i][j] + min;
    }

    public int minFallingPathSum(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < col; i++) {
            ans = Integer.min(ans, rec(0, i, matrix));
        }
        return ans;
    }
}