public class Solution {
    public String makeSmallestPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        char[] charArray = s.toCharArray();
        while (l < r) {
            if (charArray[l] != charArray[r]) {
                char c = (charArray[l] < charArray[r]) ? charArray[l] : charArray[r];
                charArray[l] = charArray[r] = c;
            }
            l++;
            r--;
        }
        return new String(charArray);
    }
}