public class Solution {
    int res;

    public int numberOfArrays(String s, int k) {
        res = 0;
        dfs(s, k, 0);
        return res;
    }

    public void dfs(String word, int k, int index) {
        if (index == word.length()) {
            res++;
            return;
        }
        for (int i = index; i < word.length(); i++) {
            long val = Long.parseLong(word.substring(index, i + 1));
            if (val > k)
                break;
            if (val == 0)
                break;
            if (val > 0) {
                dfs(word, k, i + 1);
            }
        }
    }
}
