class leetCode_14LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String r = "";
        for (int i = 0; i < strs[0].length(); i++) {
            for (String s : strs) {
                if (i == s.length() || s.charAt(i) != strs[0].charAt(i)) {
                    return r;
                }
            }
            r += strs[0].charAt(i);
        }
        return r;
    }

}