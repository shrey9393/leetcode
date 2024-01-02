import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public String sortVovHelper(String s) {
        char[] charArray = s.toCharArray();
        HashSet<Character> v = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        StringBuilder vString = new StringBuilder();

        for (char ch : charArray) {
            if (v.contains(ch)) {
                vString.append(ch);
            }
        }

        char[] sortedVovArray = vString.toString().toCharArray();
        Arrays.sort(sortedVovArray);

        int sortedIndex = 0;
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (v.contains(ch)) {
                charArray[i] = sortedVovArray[sortedIndex];
                sortedIndex++;
            }
        }

        return new String(charArray);
    }

    public String sortVowels(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        return sortVovHelper(s);

    }
}
