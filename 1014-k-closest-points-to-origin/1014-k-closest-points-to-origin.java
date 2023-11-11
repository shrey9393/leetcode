import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int arr[][] = new int[k][2];
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(x -> x[2]));

        for (int i[] : points) {
            int dist = (int) (Math.pow(i[0], 2) + Math.pow(i[1], 2)); 
            pq.add(new int[]{i[0], i[1], dist});
        }

        for (int i = 0; i < k; i++) {
            int[] point = pq.poll();
            arr[i][0] = point[0];
            arr[i][1] = point[1];
        }

        return arr;
    }
}
