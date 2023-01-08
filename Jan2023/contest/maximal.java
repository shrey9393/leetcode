import java.util.PriorityQueue;

class Solution {
    public static long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (b - a));
        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
        }
        Long sum = 0l;
        while (k > 0) {
            // System.out.println(pq);
            int val = pq.poll();
            sum += val;
            pq.add((int) Math.ceil(val / 3.0));
            k--;
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 756902131, 995414896, 95906472, 149914376, 387433380, 848985151 };
        System.out.println(maxKelements(arr, 6));
    }
}