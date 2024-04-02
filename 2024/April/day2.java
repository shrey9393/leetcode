class Solution {
    public boolean isIsomorphic(String s, String t) {
        if ((s.length() != t.length()) || s == null || t == null) {
            return false;
        }
        HashMap<Character, Character> hmS = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char st1 = s.charAt(i), st2 = t.charAt(i);
            if (hmS.containsKey(st1)) {
                if (hmS.get(st1) != st2) {
                    return false;
                }
            } else {
                if (hmS.containsValue(st2)) {
                    return false;
                }
                hmS.put(st1, st2);
            }
        }

        return true;
    }
}
