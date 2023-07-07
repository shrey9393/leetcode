public class Test {
    public static int maxConsecutiveAnswers(String answerKey, int k) {
        int len = answerKey.length(), lptr = 0, ans = 0, cnt = 0;
        for (int i = 0; i < len; i++) {
            if (answerKey.charAt(i) == 'F') {
                cnt++;
            }
            while (cnt > k) {
                if (answerKey.charAt(lptr) == 'F') {
                    cnt--;
                }
                lptr++;
            }
            ans = Math.max(ans, i - lptr + 1);
        }
        lptr = 0;
        cnt = 0;
        for (int i = 0; i < len; i++) {
            if (answerKey.charAt(i) == 'T') {
                cnt++;
            }
            while (cnt > k) {
                if (answerKey.charAt(lptr) == 'T') {
                    cnt--;
                }
                lptr++;
            }
            ans = Math.max(ans, i - lptr + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(maxConsecutiveAnswers("TTFTTFTT", 1));
    }

}
