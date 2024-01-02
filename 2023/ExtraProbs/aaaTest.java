import java.util.*;

class aaaTest {
    public static List<Integer> findSubstring(String s, String[] words) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return res;
        }
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for (String w : words) {
            hm.put(w, hm.getOrDefault(w, 0) + 1);
        }

        int lenWord = words[0].length();
        for (int j = 0; j < lenWord; j++) {
            HashMap<String, Integer> cm = new HashMap<String, Integer>();
            int start = j;
            int count = 0;
            for (int i = j; i <= s.length() - lenWord; i = i + lenWord) {
                String sub = s.substring(i, i + lenWord);
                if (hm.containsKey(sub)) {
                    if (cm.containsKey(sub)) {
                        cm.put(sub, cm.get(sub) + 1);
                    } else {
                        cm.put(sub, 1);
                    }
                    count++;
                    while (cm.get(sub) > hm.get(sub)) {
                        String left = s.substring(start, start + lenWord);
                        cm.put(left, cm.get(left) - 1);
                        count--;
                        start = start + lenWord;
                    }
                    if (count == words.length) {
                        res.add(start);
                        String left = s.substring(start, start + lenWord);
                        cm.put(left, cm.get(left) - 1);
                        count--;
                        start = start + lenWord;
                    }
                } else {
                    cm.clear();
                    start = i + lenWord;
                    count = 0;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {

        String arr[] = { "foo", "bar" };
        String s = "barfoothefoobarman";
        List<Integer> li = findSubstring(s, arr);

    }
}