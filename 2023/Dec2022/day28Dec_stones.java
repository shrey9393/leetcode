import java.util.PriorityQueue;

class Solution {
    public int minStoneSum(int[] piles, int k) {
        int sum = 0;
        PriorityQueue<Integer> p = new PriorityQueue<Integer>((a, b) -> b - a);
        for (int i = 0; i < piles.length; i++) {
            p.add(piles[i]);
        }
        int t = 0;
        while (t < k) {
            int x = p.poll();
            int c = Math.floorDiv(x, 2);
            p.add(x - c);
            t++;
        }
        while (!p.isEmpty()) {
            sum += p.poll();
        }
        return sum;
    }
}