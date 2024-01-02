class Solution {
    public String largestOddNumber(String num) {
        int idx = num.length() - 1;
        while (idx > -1 && (num.charAt(idx) - '0') % 2 == 0) {
            idx--;
        }
        return num.substring(0, idx + 1);
    }
}
