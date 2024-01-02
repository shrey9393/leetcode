class Solution {
    public int alternateDigitSum(int n) {
        int co = 0;
        String str = Integer.toString(n);
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                co += str.charAt(i) - '0';
            } else {
                co -= str.charAt(i) - '0';
            }

        }
        return co;
    }
}