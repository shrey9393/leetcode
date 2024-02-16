import java.util.HashMap;
import java.util.PriorityQueue;

class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : arr) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        for (int i : hm.keySet()) {
            pq.add(new int[] { i, hm.get(i) });
        }
        while (k > 0 && !pq.isEmpty()) {
            int[] entry = pq.poll();
            if (k >= entry[1]) {
                k -= entry[1];
            } else {
                pq.add(new int[]{entry[0], entry[1] - k});
                k = 0;
            }
        }
        return pq.size();
    }
}
