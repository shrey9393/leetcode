import java.util.ArrayList;
import java.util.List;

public class ques4 {
    public static List<Integer> goodSubsetofBinaryMatrix(int[][] grid) {
        List<Integer> li = new ArrayList<>();
        int len = (int) (Math.floor((((double) (grid.length)) / 2.0)));
        if (grid.length == 1) {
            boolean b = true;
            li.add(0);
            for (int i = 0; i < grid[0].length; i++) {
                if (grid[0][i] > len) {
                    li.remove(0);
                    return li;
                    // break;
                }
            }

        }
        for (int i = 0; i < grid.length; i++) {
            Boolean check = true;
            li.add(i);
            for (int j = 1; j < grid.length; j++) {
                for (int j2 = 0; j2 < grid[0].length; j2++) {
                    if (grid[i][j2] + grid[j][j2] > len) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    li.add(j);
                    return (li);
                }

            }
            li.remove(0);

        }
        return li;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 1, 1 }, { 1, 1, 1 } };
        List<Integer> li = goodSubsetofBinaryMatrix(arr);
        for (Integer integer : li) {
            System.out.println(integer);

        }
    }

}
