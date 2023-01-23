import java.util.*;

class Solution {
    static boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start++) != s.charAt(end--))
                return false;
        }
        return true;
    }

    static void partitionHelper(int idx, String str, List<String> p, List<List<String>> res) {
        if (idx == str.length()) {
            res.add(new ArrayList<>(p));
            return;
        }
        for (int i = idx; i < str.length(); ++i) {
            if (isPalindrome(str, idx, i)) {
                p.add(str.substring(idx, i + 1));
                partitionHelper(i + 1, str, p, res);
                p.remove(p.size() - 1);
            }
        }
    }

    public static List<List<String>> partition(String s) {
        List<List<String>> ls = new ArrayList<>();
        List<String> checkPath = new ArrayList<>();
        partitionHelper(0, s, checkPath, ls);
        return ls;
    }

}