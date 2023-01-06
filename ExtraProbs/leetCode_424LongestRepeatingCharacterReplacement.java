import java.util.ArrayList;
import java.util.HashSet;

class leetCode_424LongestRepeatingCharacterReplacement {
    public static int characterReplacement(String s, int k) {
        int n = s.length();

        int charArray[] = new int[26];

        int sidx = 0, maxLen = 0, maxCount = 0;

        for (int i = 0; i < n; i++) {
            charArray[s.charAt(i) - 'A']++;
            int curCount = charArray[s.charAt(i) - 'A'];

            maxCount = Math.max(maxCount, curCount);

            while (i - sidx - maxCount + 1 > k) {
                charArray[s.charAt(sidx) - 'A']--;
                sidx++;
            }
            maxLen = Math.max(maxLen, i - sidx + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(characterReplacement("ABAB", 2));
        System.out.println(characterReplacement("AABABBA", 1));
        System.out.println(characterReplacement("BAAA", 0));
        System.out.println(characterReplacement("AABA", 0));
        System.out.println(characterReplacement("ABBB", 2));
    }
}
