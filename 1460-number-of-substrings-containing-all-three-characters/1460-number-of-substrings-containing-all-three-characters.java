class Solution {
    public int numberOfSubstrings(String s) {
        int sLen = s.length();
        int count = 0;
        int[] charCounts = new int[3]; 
        int left = 0; 
        for (int right = 0; right < sLen; right++) {
            char c = s.charAt(right);
            charCounts[c - 'a']++; 
            while (charCounts[0] > 0 && charCounts[1] > 0 && charCounts[2] > 0) {
                count += sLen - right;

                charCounts[s.charAt(left) - 'a']--;
                left++;
            }
        }

        return count;
    }
}
