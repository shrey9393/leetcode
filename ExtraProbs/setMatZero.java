import java.util.*;

public class setMatZero {

    public static void rcZero(int[][] mat, int row, int col) {
        for (int i = 0; i < mat.length; i++) {
            mat[i][col] = 0;
        }
        for (int i = 0; i < mat[0].length; i++) {
            mat[row][i] = 0;
        }
    }

    public static void setZeroes(int[][] mat) {
        List<List<Integer>> zeroIdx = new ArrayList<>();
        int row = mat.length, col = mat[0].length;
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    zeroIdx.add(temp);
                }
            }
        }
        for (int i = 0; i < zeroIdx.size(); i++) {
            int a = zeroIdx.get(i).get(0);
            int b = zeroIdx.get(i).get(1);
            rcZero(mat, a, b);
        }

    }

    public static void main(String[] args) {
        int mat[][] = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
        setZeroes(mat);
    }
}
