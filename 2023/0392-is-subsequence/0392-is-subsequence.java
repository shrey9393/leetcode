class Solution {
    public boolean isSubsequence(String s, String t) {
        int idx = 0, idy = 0;
        int sLen = s.length(), tLen = t.length();
        while (idy != tLen) {
            if (idx == sLen) {
                return true;
            }
            if (s.charAt(idx) == t.charAt(idy)) {
                idx++;
            }
            idy++;
        }
        if (idx == sLen) {
                return true;
            }
        return false;
    }
}