class Solution {
    public boolean strongPasswordCheckerII(String password) {
        int n = password.length();
        if (n < 8) {
            return false;
        }
        boolean hasSmall = false, hasCap = false, hasSp = false, isDgit = false;
        char prev = ' ';
        for (int i = 0; i < n; i++) {
            char c = password.charAt(i);
            if (prev == c) {
                return false;
            }
            prev = c;
            if (c >= 'a' && c <= 'z') {
                hasSmall = true;
            } else if (c >= 'A' && c <= 'Z') {
                hasCap = true;
            } else if (c >= '0' && c <= '9') {
                isDgit = true;
            } else {
                hasSp = true;
            }
        }
        return (hasSmall && hasCap && hasSp && isDgit);
    }
}