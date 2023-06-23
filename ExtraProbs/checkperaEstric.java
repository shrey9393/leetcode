public class checkperaEstric {
    public static boolean checkValidString(String s) {
        int l = 0;
        int h = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                l++;
            } else {
                l--;
            }
            if (c != ')') {
                h++;
            } else {
                h--;
            }

            if (h < 0) {
                break;
            }

            l = Math.max(l, 0);
        }

        return l == 0;
    }

    public static void main(String[] args) {
        String s = "((((*)))";
        System.out.println(checkValidString(s));
    }

}
