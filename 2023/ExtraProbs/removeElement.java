import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public int removeElement(int[] nums, int val) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // pq.addAll((nums));
        for (int i : nums) {
            if (i != val) {
                pq.add(i);
            }
        }
        return pq.size();

    }
}