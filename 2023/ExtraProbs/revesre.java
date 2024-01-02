public class revesre {
    public static String reverseWords(String s) {
        String temp = "", ans = "";
        for (Character c : s.toCharArray()) {
            if (c == ' ') {
                if (temp != "") {
                    ans = temp + ans;
                    temp = "";
                }
                continue;
            }
            temp += c;
        }
        ans = temp + ans;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("  Anjali     Maheshwari  "));
    }
}
