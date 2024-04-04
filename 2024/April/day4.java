class Solution {
    public int maxDepth(String s) {
        int maxd = 0;
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count += 1;
                maxd = Math.max(maxd, count);
            } else if (c == ')') {
                count--;
            }
        }
        return maxd;
    }
}