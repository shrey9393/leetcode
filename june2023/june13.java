import java.lang.reflect.Array;
import java.util.*;

class june13 {
    public static int equalPairs(int[][] grid) {
        HashMap<String, Integer> hs = new HashMap<>();
        for (int i = 0; i < grid.length; i++) {
            hs.put(Arrays.toString(grid[i]), hs.getOrDefault(Arrays.toString(grid[i]), 0) + 1);
        }
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            int arr[] = new int[grid.length];
            for (int j = 0; j < grid.length; j++) {
                arr[j] = grid[j][i];
            }
            if (hs.containsKey(Arrays.toString(arr))) {
                count += hs.get(Arrays.toString(arr));
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int arr[][] = { { 3, 1, 2, 2 }, { 1, 4, 4, 5 }, { 2, 4, 2, 2 }, { 2, 4, 2, 2 } };
        System.out.println(equalPairs(arr));
    }

}
