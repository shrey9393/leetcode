import java.util.PriorityQueue;

class KthLargest {
    PriorityQueue<Integer> PriorityQueue;
    int l;

    public KthLargest(int k, int[] nums) {
        this.l = k;
        PriorityQueue = new PriorityQueue<>(k);
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        if (PriorityQueue.size() < l) {
            PriorityQueue.offer(val);
        } else if (PriorityQueue.peek() < val) {
            PriorityQueue.poll();
            PriorityQueue.offer(val);
        }
        return PriorityQueue.peek();
    }
}