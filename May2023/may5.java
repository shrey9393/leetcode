import java.util.*;

class may5 {
    public static int maxVowels(String s, int k) {
        // int i = 0;
        HashSet<String> hs = new HashSet();
        hs.add("a");
        hs.add("e");
        hs.add("i");
        hs.add("o");
        hs.add("u");
        int count = 0;
        for (int i = 0; i < s.length() - k + 1; i++) {
            if (!hs.contains(s.charAt(i) + "")) {
                continue;
            }
            String p = s.substring(i, i + k);
            String c[] = p.split("");
            int tempCount = 0;
            for (String x : c) {
                if (hs.contains(x)) {
                    tempCount++;
                }
            }
            count = Math.max(count, tempCount);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(maxVowels("weallloveyou", 7));
    }
}