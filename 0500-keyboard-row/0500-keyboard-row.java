import java.util.ArrayList;

class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> al = new ArrayList<>();
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        for (String temp : words) {
            String x = temp;
            temp = temp.toLowerCase();
            boolean check = true;
            int row = 0;
            if (row1.contains("" + temp.charAt(0))) {
                for (int i = 1; i < temp.length(); i++) {
                    if (!row1.contains("" + temp.charAt(i))) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    al.add(x);
                }
            } else if (row2.contains("" + temp.charAt(0))) {
                for (int i = 1; i < temp.length(); i++) {
                    if (!row2.contains("" + temp.charAt(i))) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    al.add(x);
                }
            } else {
                for (int i = 0; i < temp.length(); i++) {
                    if (!row3.contains("" + temp.charAt(i))) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    al.add(x);
                }
            }
        }
        int n = al.size();
        String ans[] = new String[n];
        for (int i = 0; i < n; i++) {
            ans[i] = al.get(i);
        }
        return ans;
    }
}