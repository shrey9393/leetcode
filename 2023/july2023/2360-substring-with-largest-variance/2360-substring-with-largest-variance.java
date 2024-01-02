class Solution {
    public int largestVariance(String s) {
        int arr[] = new int[26];
        int l = s.length();
        for (int i = 0; i < l; i++) {
            arr[s.charAt(i) - 'a']++;
        }
        int res = 0;
        for (Character first = 'a'; first <= 'z'; ++first) {
            for (Character sec = 'a'; sec <= 'z'; ++sec) {
                if (arr[first - 'a'] == 0 || arr[sec - 'a'] == 0) {
                    continue;
                }
                int fc = 0, sc = 0;
                boolean lf = false;
                for (char c : s.toCharArray()) {
                    if (c == first) {
                        fc++;
                    }
                    if (c == sec) {
                        sc++;
                    }
                    if (sc > 0) {
                        res = Math.max(res, fc - sc);
                    } else if (lf) {
                        res = Math.max(res, fc - 1);
                    }

                    if (sc > fc) {
                        fc = 0;
                        sc = 0;
                        lf = true;
                    }
                }
            }
        }
        return res;
    }
}