class Solution {
    public boolean makeStringsEqual(String s, String target) {
        int slen = s.length();
        int countA = 0;
        int countB = 0;
        for (int i = 0; i < slen; i++) {
            if (s.charAt(i) == '1') {
                countA++;
            }
            if (target.charAt(i) == '1') {
                countB++;
            }
        }
        if (countB == 0) {
            return s.equals(target);
        } else {
            return countA > 0;
        }
    }
}