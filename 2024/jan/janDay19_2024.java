<<<<<<< HEAD
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
=======
class Solution {
    public int climbStairs(int n) {
        int x = 1, j = 1;
        for (int i = 0; i < n - 1; i++) {
            int temp = x;
            x += j;
            j = temp;
        }
        return x;
    }
>>>>>>> 6a0b46beb92301085b28e48027255d2d7ae293d1
}