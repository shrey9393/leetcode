import java.util.*;

class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        int[] arr = new int[n + 1];
        int max = 0;

        for (int i = 0; i < rounds.length - 1; i++) {
            int st = rounds[i];
            int ed = rounds[i + 1];
            while (st != ed) {
                arr[st] = arr[st] + 1;
                max = Math.max(max, arr[st]);
                st = (st % n) + 1;
            }
        }

        arr[rounds[rounds.length - 1]]++;
        max = Math.max(max, arr[rounds[rounds.length - 1]]);

        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (arr[i] == max) {
                ans.add(i);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 1, 2 };
        Solution s = new Solution();
        System.out.println(s.mostVisited(4, arr)); // Output: [1, 2]
    }
}
