import java.util.ArrayList;
import java.util.List;

public class findwordDict {
    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean temp = false, finalans = false;
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            if (wordDict.contains(s.substring(idx, i + 1))) {
                finalans = true;
                temp = true;
                idx = i + 1;
            } else {
                temp = false;
            }
            System.out.println(s.substring(idx, i + 1));
        }
        return temp && finalans;
    }

    public static void main(String[] args) {
        List<String> wd = new ArrayList<>();
        wd.add("aaaa");
        wd.add("aaa");
        System.out.println(wordBreak("aaaaaaa", wd));
    }
}
