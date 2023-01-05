import java.util.HashSet;

class LeetCode_3LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int sidx = 0, eidx = 0, max = 0;

        HashSet<Character> ch = new HashSet<>();

        while (eidx < s.length()) {
            if (!ch.contains(s.charAt(eidx))) {
                ch.add(s.charAt(eidx));
                eidx++;
                max = Integer.max(ch.size(), max);
            } else {
                ch.remove(s.charAt(sidx));
                sidx++;
            }
        }
        return max;
    }
}