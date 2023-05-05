import java.util.*;

class may5 {
    public static int maxVowels(String s, int k) {
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (vowels.contains(c)) {
                count++;
            }
            if (i >= k && vowels.contains(s.charAt(i - k))) {
                count--;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}
