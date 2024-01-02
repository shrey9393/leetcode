class Solution {

    public int[] countSubTrees(int n, int[][] edges, String labels) {
        Map<Integer, List<Integer>> aj = new HashMap<>();
        for (int[] edge : edges) {
            int e1 = edge[0], e2 = edge[1];
            aj.computeIfAbsent(e1, value -> new ArrayList<Integer>()).add(e2);
            aj.computeIfAbsent(e2, value -> new ArrayList<Integer>()).add(e1);
        }

        int[] ans = new int[n];
        char[] label = labels.toCharArray();
        dfs(0, -1, aj, label, ans);
        return ans;
    }

    public int[] dfs(int n, int pt, Map<Integer, List<Integer>> aj, char[] lbl, int[] ans) {
        int[] nodeCounts = new int[26];
        nodeCounts[lbl[n] - 'a'] = 1;

        if (!aj.containsKey(n))
            return nodeCounts;
        for (int child : aj.get(n)) {
            if (child == pt) {
                continue;
            }
            int[] childCounts = dfs(child, n, aj, lbl, ans);
            for (int i = 0; i < 26; i++) {
                nodeCounts[i] += childCounts[i];
            }
        }

        ans[n] = nodeCounts[lbl[n] - 'a'];
        return nodeCounts;
    }
}