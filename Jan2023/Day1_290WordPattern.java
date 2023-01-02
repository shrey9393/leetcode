import java.util.HashMap;
class Solution {
    public static boolean wordPattern(String pattern, String s) {
        String arr[] = s.split(" ");
        String chararr[] = pattern.split("");
        if (arr.length != chararr.length) {
            return false;
        }
        HashMap<String, String> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            String c = chararr[i], k = arr[i];
            if (hm.containsKey(c)) {
                if (!hm.get(c).equals(k)) {
                    return false;
                }
            } else {
                if (hm.containsValue(k)) {
                    return false;
                }
                hm.put(c, k);
            }
        }
        return true;

    }
}