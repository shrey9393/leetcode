import java.util.*;

class Solution {
    public long pickGifts(int[] gifts, int k) {
        int n = gifts.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.add(gifts[i]);
        }
        while (k-- > 0) {
            int a = Collections.max(pq);
            pq.remove(a);
            pq.add((int) Math.floor(Math.sqrt(a)));
        }
        long ans = 0;
        for (int i : pq) {
            ans += i;
        }
        return ans;
    }
}