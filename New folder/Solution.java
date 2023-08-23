import java.util.HashMap;

class Solution {
    public boolean digitCount(String s) {
        int n = s.length();
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            hm.put((int) (c - '0'), hm.getOrDefault((int) (c - '0'), 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            int c = (int) s.charAt(i) - '0';

            if (!hm.containsKey(c) || hm.get(c) != c) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String input = "1210";
        System.out.println(solution.digitCount(input));
    }
}
