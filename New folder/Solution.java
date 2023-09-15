import java.util.HashMap;

class Solution {
    public String freqAlphabets(String s) {
        HashMap<String, Character> hm = new HashMap<>();
        char c = 'a';
        for (int j = 1; j <= 26; j++) {
            hm.put("" + j, c++);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                sb.append(hm.get(s.substring(i, i + 2)));
                i += 2;
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}