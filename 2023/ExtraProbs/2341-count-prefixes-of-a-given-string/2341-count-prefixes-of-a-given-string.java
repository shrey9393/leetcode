class Solution {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for (String temp : words) {
            if (s.startsWith(temp)) {
                count++;
            }
        }
        return count;
    }
}