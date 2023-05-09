import java.util.*;

public class may9 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> li = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;
        int k = 0;
        while (k < (rows * cols)) {
            for (int i = left; i <= right && k < (rows * cols); i++) {
                li.add(matrix[top][i]);
                k++;
            }
            top++;
            for (int i = top; i <= bottom && k < (rows * cols); i++) {
                li.add(matrix[i][right]);
                k++;
            }
            right--;
            for (int i = right; i >= left && k < (rows * cols); i--) {
                li.add(matrix[bottom][i]);
                k++;
            }
            bottom--;
            for (int i = bottom; i >= top && k < (rows * cols); i--) {
                li.add(matrix[i][left]);
                k++;
            }
            left++;
        }
        return li;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 4, 5, 6, 7 },
                { 7, 8, 9, 20 } };
        List<Integer> al = spiralOrder(arr);

        for (Integer integer : al) {
            System.out.print(integer + " ");

        }
    }
}
