import java.util.ArrayList;
import java.util.List;

class swapvov {
    public static String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int start = 0, end = sb.length() - 1;
        List<Character> ch = new ArrayList<>();

        ch.add('a');
        ch.add('e');
        ch.add('i');
        ch.add('o');
        ch.add('u');
        while (start < end) {
            char st = sb.charAt(start), ed = sb.charAt(end);
            if (ch.contains(st) && ch.contains(ed)) {
                sb.setCharAt(start, ed);
                sb.setCharAt(end, st);
                start++;
                end--;
            } else if (ch.contains(st)) {
                end--;
            } else if (ch.contains(ed)) {
                start++;
            } else {
                start++;
                end--;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }
}
