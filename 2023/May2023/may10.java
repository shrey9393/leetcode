import java.util.*;

class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][] = new int[n][n];
        int rows = n;
        int cols = n;
        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;
        int k = 0;
        int x = 1;
        while (k < (rows * cols)) {
            for (int i = left; i <= right && k < (rows * cols); i++) {
                matrix[top][i] = x++;
                ;
                k++;
            }
            top++;
            for (int i = top; i <= bottom && k < (rows * cols); i++) {
                matrix[i][right] = x++;
                k++;
            }
            right--;
            for (int i = right; i >= left && k < (rows * cols); i--) {
                matrix[bottom][i] = x++;
                k++;
            }
            bottom--;
            for (int i = bottom; i >= top && k < (rows * cols); i--) {
                matrix[i][left] = x++;
                k++;
            }
            left++;

        }
        return matrix;
    }
}