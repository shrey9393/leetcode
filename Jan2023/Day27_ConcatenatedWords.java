import java.util.*;

class Solution {
    private static boolean check(String word, HashSet<String> hs) {
        for (int i = 1; i < word.length(); i++) {
            String left = word.substring(0, i);
            String right = word.substring(i);
            if (hs.contains(left)) {
                if (hs.contains(right) || check(right, hs)) {
                    return true;
                }
            }
        }
        return false;
    }

    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        HashSet<String> hs = new HashSet<>(Arrays.asList(words));
        List<String> ans = new ArrayList<String>();
        for (String w : words) {
            if (check(w, hs)) {
                ans.add(w);
            }
        }
        return ans;
    }
}