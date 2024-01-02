import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

class leetcodepob2 {
    public static boolean isItPossible(String word1, String word2) {
        HashSet<Character> hs1 = new HashSet<>();
        HashSet<Character> hs2 = new HashSet<>();
        int count1 = 0, count2 = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (hs1.contains(word1.charAt(i))) {
                count1++;
            } else {
                hs1.add(word1.charAt(i));
            }

        }
        for (int i = 0; i < word2.length(); i++) {

            if (hs2.contains(word2.charAt(i))) {
                count2++;
            } else {
                hs2.add(word2.charAt(i));
            }
        }
        // return ;
        return count1 == count2 && count1 < 2 && hs1.size() == hs2.size();
    }

    public static void main(String[] args) {
        System.out.println(isItPossible("abcc", "aab"));
    }
}