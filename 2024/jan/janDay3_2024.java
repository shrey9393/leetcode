class Solution {
    public int numberOfBeams(String[] bank) {
        ArrayList<Integer> al = new ArrayList<>();
        int ans = 0;
        for (String s : bank) {
            int count = 0;
            for (char c : s.toCharArray()) {
                if (c == '1') {
                    count++;
                }
            }
            if (count != 0) {
                al.add(count);
            }
        }
        int n = al.size();
        if (n == 1) {
            return 0;
        }
        for (int i = 0; i < al.size() - 1; i++) {
            ans += (al.get(i) * al.get(i + 1));
        }
        return ans;
    }
}