class Solution {
    public String longestPalindrome(String s) {
        String str = "";
        int resLen = 0;
        for (int i = 0; i < s.length(); i++) {
            int lptr = i, rptr = i;
            while (lptr >= 0 && rptr < s.length() && s.charAt(lptr) == s.charAt(rptr)) {
                if (rptr - lptr + 1 > resLen) {
                    str = s.substring(lptr, rptr + 1);
                    resLen = rptr - lptr + 1;
                }
                lptr--;
                rptr++;
            }
            lptr = i;
            rptr = i + 1;
            while (lptr >= 0 && rptr < s.length() && s.charAt(lptr) == s.charAt(rptr)) {
                if (rptr - lptr + 1 > resLen) {
                    str = s.substring(lptr, rptr + 1);
                    resLen = rptr - lptr + 1;
                }
                lptr--;
                rptr++;
            }

        }
        return str;
    }
}