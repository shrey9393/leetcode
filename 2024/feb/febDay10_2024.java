class Solution {
    public static boolean checkPali(String s) {
        StringBuilder sb = new StringBuilder(s);

        if (sb.toString().equals(sb.reverse().toString())) {
            return true;
        }
        return false;
    }

    public static int countSubstrings(String s) {
        int count = s.length();
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (checkPali(s.substring(i, j + 1))) {
                    count++;
                }
            }
        }
        return count;
    }
}