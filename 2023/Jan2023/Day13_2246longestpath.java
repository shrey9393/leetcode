import java.util.*;

class Solution {
    List<Integer>[] child = new List[100001];
    int ans;

    int dfs(String s, int current) {
        if (child[current].isEmpty())
            return 1;
        int max1 = 0, max2 = 0;
        for (int chNode : child[current]) {
            int l = dfs(s, chNode);
            ans = Math.max(ans, l);

            if (s.charAt(current) == s.charAt(chNode))
                continue;
            if (l > max1) {
                max2 = max1;
                max1 = l;
            } else {
                max2 = Math.max(max2, l);
            }
        }
        ans = Math.max(ans, 1 + max1 + max2);
        return 1 + max1;
    }

    int longestPath(int[] parent, String s) {
        int pSize = parent.length;
        for (int i = 0; i < pSize; i++) {
            child[i] = new ArrayList<>();
        }
        for (int i = 1; i < pSize; i++) {
            child[parent[i]].add(i);
        }
        ans = 1;
        dfs(s, 0);
        return ans;
    }
}
