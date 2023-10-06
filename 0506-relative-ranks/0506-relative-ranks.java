import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] temp = Arrays.copyOf(score, score.length); 
        HashMap<Integer, String> hm = new HashMap<>();
        Arrays.sort(temp);
        String rank[] = new String[temp.length];
        int val = 4;
        for (int i = temp.length - 1; i > -1; i--) {
            int x = temp[i];
            if (i == temp.length - 1) {
                hm.put(x, "Gold Medal");
            } else if (i == temp.length - 2) {
                hm.put(x, "Silver Medal");
            } else if (i == temp.length - 3) {
                hm.put(x, "Bronze Medal");
            } else {
                hm.put(x, "" + val++);
            }
        }
        System.out.println(hm);
        for (int i = 0; i < rank.length; i++) {
            rank[i] = hm.get(score[i]);
        }
        return rank;
    }
}
