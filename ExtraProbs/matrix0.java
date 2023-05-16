public class matrix0 {
    // class Solution {
    public static void setZeroes(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 0) {
                    for (int p = 0; p < row; p++) {
                        if (mat[p][j] == 0) {
                            continue;
                        }
                        mat[p][j] = -1;
                    }
                    for (int p = 0; p < col; p++) {
                        if (mat[i][p] == 0) {
                            continue;
                        }
                        mat[i][p] = -1;
                    }
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == -1) {
                    mat[i][j] = 0;
                }
            }
        }
        // return mat;
    }

    public static void main(String[] args) {
        int mat[][] = {
                { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 }
        };
        setZeroes(mat);
    }

}
