class Solution {
    public int minFlipsMonoIncr(String s) {
        int cf = 0, co = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                co++;
            } else {
                if (co > 0) {
                    cf++;
                }
            }
            cf = Math.min(co, cf);
        }
        return cf;
    }
}