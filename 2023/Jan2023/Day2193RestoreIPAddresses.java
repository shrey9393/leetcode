class Solution {
    public List<String> restoreIpAddresses(final String s) {
        List<String> ans = new ArrayList<>();
        dfs(s, 0, new ArrayList<>(), ans);
        return ans;
    }

    private void dfs(final String str, int sidx, List<String> pList, List<String> res) {
        if (pList.size() == 4 && sidx == str.length()) {
            res.add(String.join(".", pList));
            return;
        }
        if (pList.size() == 4 || sidx == str.length()) {
            return;
        }
        for (int length = 1; length <= 3; ++length) {
            if (sidx + length > str.length()) {
                return;
            }
            if (length > 1 && str.charAt(sidx) == '0') {
                return;
            }
            final String num = str.substring(sidx, sidx + length);
            if (Integer.parseInt(num) > 255) {
                return;
            }
            pList.add(num);
            dfs(str, sidx + length, pList, res);
            pList.remove(pList.size() - 1);
        }
    }
}