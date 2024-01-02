import java.util.Arrays;

class Solution {
    public String removeDuplicateLetters(String s) {
        int lastSeen[] = new int[26];
        boolean isTrue[] = new boolean[26];
        Arrays.fill(lastSeen, -1);
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            lastSeen[s.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            int idx = c - 'a';
            if (isTrue[idx]) {
                continue;
            }
            while (sb.length() > 0 && c < sb.charAt(sb.length() - 1)
                    && lastSeen[sb.charAt(sb.length() - 1) - 'a'] > i) {
                isTrue[sb.charAt(sb.length() - 1) - 'a'] = false;
                sb.deleteCharAt(sb.length() - 1);
            }
            sb.append(c);
            isTrue[idx] = true;
        }
        return sb.toString();
    }
}
