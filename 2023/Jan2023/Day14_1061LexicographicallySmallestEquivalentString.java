class Solution {
    int[] charArray = new int[26];

    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        for (int i = 0; i < 26; i++) {
            charArray[i] = i;
        }
        for (int i = 0; i < s1.length(); i++) {
            checkUnit(s1.charAt(i) - 'a', s2.charAt(i) - 'a');
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < baseStr.length(); i++) {
            ans.append((char) ((get(baseStr.charAt(i) - 'a')) + 'a'));

        }
        return ans.toString();

    }

    public void checkUnit(int a, int b) {
        a = get(a);
        b = get(b);
        if (a < b) {
            charArray[b] = a;

        } else {
            charArray[a] = b;
        }
    }

    public int get(int i) {
        if (charArray[i] == i) {
            return i;
        } else {
            charArray[i] = get(charArray[i]);
            return charArray[i];
        }
    }
}