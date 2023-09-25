class Solution {
    public char findTheDifference(String s, String t) {
        char extraChar = 0;
        for (char ch : s.toCharArray()) {
            extraChar ^= ch;
        }
        for (char ch : t.toCharArray()) {
            extraChar ^= ch;
        }
        return extraChar;
    }
}