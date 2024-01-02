class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }

        int length = s2.length();
        char[] temp = s2.toCharArray();

        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                char tempChar = temp[i];
                temp[i] = temp[j];
                temp[j] = tempChar;

                String swapped = new String(temp);
                if (s1.equals(swapped)) {
                    return true;
                }
                temp[j] = temp[i];
                temp[i] = tempChar;
            }
        }

        return false;
    }
}